package com.example.david.zoneify.data;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.david.zoneify.data.converters.BooleanConverter;
import com.example.david.zoneify.data.converters.DirectionEnumConverter;
import com.example.david.zoneify.data.converters.LatLngConverter;
import com.google.android.gms.maps.model.LatLng;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class ZoneDao_Impl implements ZoneDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfZone;

  private final LatLngConverter __latLngConverter = new LatLngConverter();

  private final DirectionEnumConverter __directionEnumConverter = new DirectionEnumConverter();

  private final BooleanConverter __booleanConverter = new BooleanConverter();

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfZone;

  private final SharedSQLiteStatement __preparedStmtOfDeleteZoneById;

  public ZoneDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfZone = new EntityInsertionAdapter<Zone>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `zones_table`(`id`,`name`,`latLng`,`radius`,`direction`,`message`,`active`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Zone value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final String _tmp;
        _tmp = __latLngConverter.fromLocation(value.getLatLng());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        stmt.bindLong(4, value.getRadius());
        final int _tmp_1;
        _tmp_1 = __directionEnumConverter.enumDirectionToTnt(value.getDirection());
        stmt.bindLong(5, _tmp_1);
        if (value.getMessage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMessage());
        }
        final int _tmp_2;
        _tmp_2 = __booleanConverter.fromBoolean(value.getActive());
        stmt.bindLong(7, _tmp_2);
      }
    };
    this.__updateAdapterOfZone = new EntityDeletionOrUpdateAdapter<Zone>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `zones_table` SET `id` = ?,`name` = ?,`latLng` = ?,`radius` = ?,`direction` = ?,`message` = ?,`active` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Zone value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final String _tmp;
        _tmp = __latLngConverter.fromLocation(value.getLatLng());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        stmt.bindLong(4, value.getRadius());
        final int _tmp_1;
        _tmp_1 = __directionEnumConverter.enumDirectionToTnt(value.getDirection());
        stmt.bindLong(5, _tmp_1);
        if (value.getMessage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMessage());
        }
        final int _tmp_2;
        _tmp_2 = __booleanConverter.fromBoolean(value.getActive());
        stmt.bindLong(7, _tmp_2);
        stmt.bindLong(8, value.getId());
      }
    };
    this.__preparedStmtOfDeleteZoneById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM zones_table WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertZone(Zone zone) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfZone.insert(zone);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateZone(Zone zone) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfZone.handle(zone);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteZoneById(int zoneId) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteZoneById.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, zoneId);
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteZoneById.release(_stmt);
    }
  }

  @Override
  public List<Zone> getAllZones() {
    final String _sql = "SELECT * FROM zones_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfLatLng = _cursor.getColumnIndexOrThrow("latLng");
      final int _cursorIndexOfRadius = _cursor.getColumnIndexOrThrow("radius");
      final int _cursorIndexOfDirection = _cursor.getColumnIndexOrThrow("direction");
      final int _cursorIndexOfMessage = _cursor.getColumnIndexOrThrow("message");
      final int _cursorIndexOfActive = _cursor.getColumnIndexOrThrow("active");
      final List<Zone> _result = new ArrayList<Zone>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Zone _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final LatLng _tmpLatLng;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfLatLng);
        _tmpLatLng = __latLngConverter.toLatLng(_tmp);
        final int _tmpRadius;
        _tmpRadius = _cursor.getInt(_cursorIndexOfRadius);
        final Direction _tmpDirection;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfDirection);
        _tmpDirection = __directionEnumConverter.intToEnumDirection(_tmp_1);
        final String _tmpMessage;
        _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
        final boolean _tmpActive;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfActive);
        _tmpActive = __booleanConverter.toBoolean(_tmp_2);
        _item = new Zone(_tmpName,_tmpLatLng,_tmpRadius,_tmpDirection,_tmpMessage,_tmpActive);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Zone getZoneById(int zoneId) {
    final String _sql = "SELECT * FROM zones_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, zoneId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfLatLng = _cursor.getColumnIndexOrThrow("latLng");
      final int _cursorIndexOfRadius = _cursor.getColumnIndexOrThrow("radius");
      final int _cursorIndexOfDirection = _cursor.getColumnIndexOrThrow("direction");
      final int _cursorIndexOfMessage = _cursor.getColumnIndexOrThrow("message");
      final int _cursorIndexOfActive = _cursor.getColumnIndexOrThrow("active");
      final Zone _result;
      if(_cursor.moveToFirst()) {
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final LatLng _tmpLatLng;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfLatLng);
        _tmpLatLng = __latLngConverter.toLatLng(_tmp);
        final int _tmpRadius;
        _tmpRadius = _cursor.getInt(_cursorIndexOfRadius);
        final Direction _tmpDirection;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfDirection);
        _tmpDirection = __directionEnumConverter.intToEnumDirection(_tmp_1);
        final String _tmpMessage;
        _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
        final boolean _tmpActive;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfActive);
        _tmpActive = __booleanConverter.toBoolean(_tmp_2);
        _result = new Zone(_tmpName,_tmpLatLng,_tmpRadius,_tmpDirection,_tmpMessage,_tmpActive);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
