# ![](https://github.com/dhines87/Zoneify/svg/readme_logo.svg) Zoneify

A location based Android application written in kotlin that uses geofences to send notifications when entering or leaving a created zone.

Zoneify is targeted for [Android Version 8 - Oreo](https://www.android.com/versions/oreo-8-0/) and its layout was targeted to run on a Samsung A5 phone. This application was created as a PLAR (Prior Learning Accessment and Recognization) school project to showcase my knowledge in Android.

---

Table of Contents

* [How Zoneify Works](#how-zoneify-works)
  * [Splash Screen](#splash-screen)
  * [On Boarding Screen](#on-boarding-screen)
  * [Zone List Screen](#zone-list-screen)
  * [Zone Screen](#zone-screen)
  * [Zone Location Screen](#zone-location-screen)
* [Architecture and Technology](#architecture-and-technology)
  * [Data](#data)
  * [UI](#ui)
  * [Geofencing](#geofencing)
  * [Broadcast Receiever](#broadcast-receiever)
  * [Notifications](#notifications)
  * [RecyclerView](#recyclerview)
  * [Collapsing Toolbar](#collapsing-toolbar)
  * [View Pager and Pager Adapter](#view-pager-and-pager-adapter)
  * [Handler](#handler)
* [Dependencies](#dependencies)

---

## How Zoneify Works

### Splash Screen

![](https://github.com/dhines87/Zoneify/blob/master/app/src/main/res/drawable/splash_screen.PNG)

When Zoneify starts the user will be presented by a splash screen.

### On Boarding Screen

![](https://github.com/dhines87/Zoneify/blob/master/app/src/main/res/drawable/onboarding_one.PNG)

On the first start of Zoneify the user will be presented with an on boarding screen. This will only be shown the first time a user opens Zoneify. There are three screens that walk the user through how to use Zoneify. The user can click the Skip button on the left on the first screen to skip the on boarding process. The user can either click on the Next button on the right to go to the next screen or swipe across.

### Zone List Screen

![](https://github.com/dhines87/Zoneify/blob/master/app/src/main/res/drawable/zone_list_view.PNG)

Zoneify's home screen is a list of all the zones that the user has added. Each zone listed will show the zone's name, direction, location in latitude and longitude, and wether or not the zone is active. You can edit or view a particular zone by tapping on one of the listed zones. To create a new zone you can tap on the floating action button found in the bottom-right corner of the screen.

### Zone Screen

![](https://github.com/dhines87/Zoneify/blob/master/app/src/main/res/drawable/zone_view.PNG)

After tapping on a zone from the main screen you are presented with the zone screen. On this screen you can edit their zone. Each zone has: 
- A name field
- A location button. By default the location is set to the user's current location. By clicking on the button the location screen will be shown where you can edit the location and radius of the zone.
- An active switch button. Only active zone's will trigger geofences. Non-active zones will not be triggered.
- A toggle button for the direction of the zone trigger. Tapping on the desired direction will disable the other button. The direction that is enabled for this zone will have a green background.
- A message field. This is the text that will show up in the notification.

You can either save or delete the zone from the icons in the menu bar.

### Edit Location Screen

![](https://github.com/dhines87/Zoneify/blob/master/app/src/main/res/drawable/zone_location_view.PNG)

After tapping on the edit location button from the zone screen the user is presented with the edit location screen. The user can see the zone's geofence represented by a shaded circle drawn on the map. You can change the radius size using the + and - buttons located at the bottom of the screen. The radius has a minimum value of 75 and a maximum value of 250. You can also save or delete the zone from this screen in the menu bar.

## Architecture and Technology

This application is using [Android's recommended app architecture](https://developer.android.com/jetpack/docs/guide#recommended-app-arch) to properly separate the different layers in this application to facilitate a consistent and pleasant user experience. In the following image we can see how all the different layers interact with one another:

![](https://codelabs.developers.google.com/codelabs/android-room-with-a-view-kotlin/img/a7da8f5ea91bac52.png "")

### Data
Zoneify uses Room Persistence Library to save its data in a local database. Room provides an abstraction layer over SQLite to allow database access while harnessing the full power of SQLite.

Room uses 3 main components:
1. **[Entity:](https://developer.android.com/training/data-storage/room/defining-data.html)** An annotated class that represents a table within the database. ([Zone.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/data/Zone.kt))
2. **[DAO:](https://developer.android.com/training/data-storage/room/accessing-data.html)** Data access object. An interface that contains the methods used to access the database. ([ZoneDao.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/data/ZoneDao.kt))
3. **[Room Database:](https://developer.android.com/reference/androidx/room/Database.html)** Contains the SQLite database and serves as the main access point for the underlying SQLite database. ([ZoneifyDatabase.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/data/ZoneifyDatabase.kt))

Zoneify also makes use of [Type Converters](https://developer.android.com/reference/android/arch/persistence/room/TypeConverters.html) as SQLite doesn't know how to store custom data types. We use the converter to convert data into a type that the SQLite database supports. ([LatLngConverter.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/data/converters/LatLngConverter.kt]))

Our Room database is at the lowest level. A repository is used as a centralized access point between the database layer and the View Models. It is responsible for data operations, such as calling the DAO methods for Entities in the database, and in the case of this application adding and removing geofences as well ([ZoneRepository.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/data/ZoneRepository.kt)). The repository uses kotlin's [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) to asynchronously access the database, and ensures that only one instance of the database is made available at a time.

![](https://developer.android.com/images/training/data-storage/room_architecture.png)

### UI
Zoneify uses the MVVM (Model View View Model) pattern. Zoneify's UI follows the [Material Design Guidelines](https://material.io/design/)

The [View Model](https://developer.android.com/topic/libraries/architecture/viewmodel) layer are objects that provide data for specific UI components such as fragments and activies. It also handles data business logic for the model. ([ZoneViewModel.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/zoneView/ZoneViewModel.kt)) The ViewModel doesn't know about UI components, so it isn't affected by configuration changes, such as recreating an activity when rotating the device.

![](https://developer.android.com/images/topic/libraries/architecture/viewmodel-lifecycle.png)

In order to communicate with the view ([ZoneFragment.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/zoneView/ZoneFragment.kt)) we use [Live Data](https://developer.android.com/topic/libraries/architecture/livedata) which observes data in our View Model and updates the View when data changes. Unlike a regular observable, LiveData is lifecycle-aware, meaning it respects the lifecycle of other app components, such as activities, fragments, or services. This awareness ensures LiveData only updates app component observers that are in an active lifecycle state.

Zoneify also uses [Databinding](https://developer.android.com/topic/libraries/data-binding) which allows us to bind UI components to layout files. This reduces UI framework calls in activities, making them simpler and easier to maintain, and also improves  app performance and helps prevent memory leaks and null pointer exceptions. We use a declarative format in the layout files rather than programmatically writing them out. Ex: `@{viewmodel.zone}` ([zone_fragment](https://github.com/dhines87/Zoneify/blob/master/app/src/main/res/layout/fragment_zone.xml))

### Geofencing
Zoneify uses [Geofences](https://developer.android.com/training/location/geofencing) to create geofences (zones) that combines awareness of the user's current location with awareness of the user's proximity to the zone. Zoneify uses `GEOFENCE_TRANSITION_ENTER` transition for when a user enters a zone and `GEOFENCE_TRANSITION_DWELL` transition when a user leaves a zone. Using the `GEOFENCE_TRANSITION_DWELL` is needed so that Zoneify doesn't send a large amount of notifications when on the edge of a zone or driving through a zone. A user needs to dwell in the zone for 1 minute before a notification is sent.

### Broadcast Receiever
In order for Zoneify to be able to respond to geofence triggers a [Broadcast Receiver](https://developer.android.com/reference/android/content/BroadcastReceiver.html) is needed. This is a foreground service that responds to a geofence intent. When we create the geofence we create a [Pending Intent](https://developer.android.com/reference/android/app/PendingIntent.html) which starts the Broadcast Receiver when a geofence is triggered. A class is created ([GeofenceBroadcastReceiver.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/util/GeofenceBroadcastReceiver.kt)) that handles the intent.

### Notifications
Zonefiy uses [Notification Manager](https://developer.android.com/reference/kotlin/android/app/NotificationManager) to send notifications to the device when a geofence intent is received from the Broadcast Receiver. ([NotificationHelper.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/util/NotificationHelper.kt))

### Navigation
Zonefiy uses a custom [Navigation Manager](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/util/NavigationManager.kt) to handle navigation events.

### RecyclerView
Zoneify uses a [Recycler View](https://developer.android.com/guide/topics/ui/layout/recyclerview) to list all of the users zones in the main screen. The fragment ([ZoneListFragment.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/zoneListView/ZoneListFragment.kt)) creates the recyclerview and adapter, and notifies the view model when the data has changed. The [Adapter](https://developer.android.com/reference/android/support/v7/widget/RecyclerView.Adapter) ([ZoneListAdapter.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/zoneListView/ZoneListAdapter.kt)) binds the View Model ([ZoneListViewModel.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/zoneListView/ZoneListViewModel.kt)) which binds a [View Holder](https://developer.android.com/reference/android/support/v7/widget/RecyclerView.ViewHolder.html) for each zone item ([zone_item.xml](https://github.com/dhines87/Zoneify/blob/master/app/src/main/res/layout/zone_item.xml)) in the list. Notice how we have to import our Converter and Direction enum variables into this layout file so that the data binding knows how to handle this.

### Collapsing Toolbar
Zoneify uses a [Collapsing Toolbar](https://material.io/develop/android/components/collapsing-toolbar-layout/) for its main screen. When the user scrolls up the logo will disappear and the Zoneify title will get smaller. When the user scrolls down to the start of the list the Logo will reappear.

### View Pager and Pager Adapter
Zoneify uses a [View Pager](https://developer.android.com/reference/android/support/v4/view/ViewPager) for the on boarding screens. An activity is created ([OnBoardingActivity.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/activity/OnBoardingActivity.kt)) that holds the View Pager in a layout file ([activity_onboarding.xml](https://github.com/dhines87/Zoneify/blob/master/app/src/main/res/layout/activity_onboarding.xml)). A [Pager Adapter](https://developer.android.com/reference/androidx/viewpager/widget/PagerAdapter.html) ([OnBoardingViewPagerAdapter](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/onBoardingView/OnBoardingViewPagerAdapter.kt)) is created to supply the screen fragments to the activity. Fragments and layouts are created for each screen ([OnBoardingStepOneFragment.kt](https://github.com/dhines87/Zoneify/blob/master/app/src/main/java/com/example/david/zoneify/onBoardingView/OnBoardingStepOneFragment.kt), [fragment_onboarding_one.xml](https://github.com/dhines87/Zoneify/blob/master/app/src/main/res/layout/fragment_onboarding_one.xml)). The activity hooks the Pager Adapter to the View Holder.

### Handler
Zoneify uses a [Handler](https://developer.android.com/reference/android/os/Handler) as a delay for the splash screen.

---

## Dependencies

* [Kotlin Version: 1.3.41](https://kotlinlang.org/docs/reference/using-gradle.html)
* [Appcompat Version: 1.0.2](https://developer.android.com/jetpack/androidx/releases/appcompat#version_102_3)
* [Material Component Version: 1.0.0](https://material.io/develop/android/docs/getting-started/)
* [Room Version: 2.1.0-alpha06](https://developer.android.com/jetpack/androidx/releases/room#2.1.0-alpha06)
* [Lifecycle Version: 2.1.0-alpha04](https://developer.android.com/jetpack/androidx/releases/lifecycle#2.1.0-alpha04)
* [Cardview Version: 1.0.0](https://developer.android.com/jetpack/androidx/releases/cardview)
* [Recyclerview Version: 1.0.0](https://developer.android.com/jetpack/androidx/releases/recyclerview)
* [View Pager Version: 1.0.0](https://developer.android.com/jetpack/androidx/releases/viewpager)
* [Google Maps Version: 17.0.0](https://developers.google.com/android/guides/setup)

