package com.example.david.zoneify.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class ZoneifyDatabase_Impl extends ZoneifyDatabase {
  private volatile ZoneDao _zoneDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `zones_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `latLng` TEXT NOT NULL, `radius` INTEGER NOT NULL, `direction` INTEGER NOT NULL, `message` TEXT NOT NULL, `active` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"ec615dca56501432a403aff1c6f4523a\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `zones_table`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsZonesTable = new HashMap<String, TableInfo.Column>(7);
        _columnsZonesTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsZonesTable.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsZonesTable.put("latLng", new TableInfo.Column("latLng", "TEXT", true, 0));
        _columnsZonesTable.put("radius", new TableInfo.Column("radius", "INTEGER", true, 0));
        _columnsZonesTable.put("direction", new TableInfo.Column("direction", "INTEGER", true, 0));
        _columnsZonesTable.put("message", new TableInfo.Column("message", "TEXT", true, 0));
        _columnsZonesTable.put("active", new TableInfo.Column("active", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysZonesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesZonesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoZonesTable = new TableInfo("zones_table", _columnsZonesTable, _foreignKeysZonesTable, _indicesZonesTable);
        final TableInfo _existingZonesTable = TableInfo.read(_db, "zones_table");
        if (! _infoZonesTable.equals(_existingZonesTable)) {
          throw new IllegalStateException("Migration didn't properly handle zones_table(com.example.david.zoneify.data.Zone).\n"
                  + " Expected:\n" + _infoZonesTable + "\n"
                  + " Found:\n" + _existingZonesTable);
        }
      }
    }, "ec615dca56501432a403aff1c6f4523a", "704bed96e089b2bd9bcee3e9f6091f6a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "zones_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `zones_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ZoneDao zoneDao() {
    if (_zoneDao != null) {
      return _zoneDao;
    } else {
      synchronized(this) {
        if(_zoneDao == null) {
          _zoneDao = new ZoneDao_Impl(this);
        }
        return _zoneDao;
      }
    }
  }
}
