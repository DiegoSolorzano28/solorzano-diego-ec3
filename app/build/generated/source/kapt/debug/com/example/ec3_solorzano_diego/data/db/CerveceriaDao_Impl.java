package com.example.ec3_solorzano_diego.data.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.ec3_solorzano_diego.model.Cerveceria;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CerveceriaDao_Impl implements CerveceriaDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Cerveceria> __insertionAdapterOfCerveceria;

  private final EntityDeletionOrUpdateAdapter<Cerveceria> __deletionAdapterOfCerveceria;

  public CerveceriaDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCerveceria = new EntityInsertionAdapter<Cerveceria>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `cerveceria` (`id`,`name`,`brewery_type`,`city`,`country`,`phone`,`website_url`,`isFavorite`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Cerveceria value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getBrewery_type() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBrewery_type());
        }
        if (value.getCity() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCity());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCountry());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPhone());
        }
        if (value.getWebsite_url() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getWebsite_url());
        }
        final int _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(8, _tmp);
      }
    };
    this.__deletionAdapterOfCerveceria = new EntityDeletionOrUpdateAdapter<Cerveceria>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `cerveceria` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Cerveceria value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object addFavorite(final Cerveceria cerveceria,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCerveceria.insert(cerveceria);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object removeFavorite(final Cerveceria cerveceria,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCerveceria.handle(cerveceria);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public List<Cerveceria> getFavorites() {
    final String _sql = "SELECT * FROM cerveceria";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfBreweryType = CursorUtil.getColumnIndexOrThrow(_cursor, "brewery_type");
      final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
      final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfWebsiteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "website_url");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
      final List<Cerveceria> _result = new ArrayList<Cerveceria>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Cerveceria _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpBrewery_type;
        if (_cursor.isNull(_cursorIndexOfBreweryType)) {
          _tmpBrewery_type = null;
        } else {
          _tmpBrewery_type = _cursor.getString(_cursorIndexOfBreweryType);
        }
        final String _tmpCity;
        if (_cursor.isNull(_cursorIndexOfCity)) {
          _tmpCity = null;
        } else {
          _tmpCity = _cursor.getString(_cursorIndexOfCity);
        }
        final String _tmpCountry;
        if (_cursor.isNull(_cursorIndexOfCountry)) {
          _tmpCountry = null;
        } else {
          _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
        }
        final String _tmpPhone;
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _tmpPhone = null;
        } else {
          _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
        }
        final String _tmpWebsite_url;
        if (_cursor.isNull(_cursorIndexOfWebsiteUrl)) {
          _tmpWebsite_url = null;
        } else {
          _tmpWebsite_url = _cursor.getString(_cursorIndexOfWebsiteUrl);
        }
        final boolean _tmpIsFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp != 0;
        _item = new Cerveceria(_tmpId,_tmpName,_tmpBrewery_type,_tmpCity,_tmpCountry,_tmpPhone,_tmpWebsite_url,_tmpIsFavorite);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
