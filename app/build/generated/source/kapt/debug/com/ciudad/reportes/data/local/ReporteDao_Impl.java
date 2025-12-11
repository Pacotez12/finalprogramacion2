package com.ciudad.reportes.data.local;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ciudad.reportes.data.model.Reporte;
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
public final class ReporteDao_Impl implements ReporteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Reporte> __insertionAdapterOfReporte;

  private final EntityDeletionOrUpdateAdapter<Reporte> __deletionAdapterOfReporte;

  private final EntityDeletionOrUpdateAdapter<Reporte> __updateAdapterOfReporte;

  public ReporteDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfReporte = new EntityInsertionAdapter<Reporte>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `reportes` (`id`,`descripcion`,`fechaHora`,`latitud`,`longitud`,`rutaFoto`,`sincronizado`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Reporte entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getDescripcion() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getDescripcion());
        }
        if (entity.getFechaHora() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getFechaHora());
        }
        statement.bindDouble(4, entity.getLatitud());
        statement.bindDouble(5, entity.getLongitud());
        if (entity.getRutaFoto() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getRutaFoto());
        }
        final int _tmp = entity.getSincronizado() ? 1 : 0;
        statement.bindLong(7, _tmp);
      }
    };
    this.__deletionAdapterOfReporte = new EntityDeletionOrUpdateAdapter<Reporte>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `reportes` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Reporte entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfReporte = new EntityDeletionOrUpdateAdapter<Reporte>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `reportes` SET `id` = ?,`descripcion` = ?,`fechaHora` = ?,`latitud` = ?,`longitud` = ?,`rutaFoto` = ?,`sincronizado` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Reporte entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getDescripcion() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getDescripcion());
        }
        if (entity.getFechaHora() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getFechaHora());
        }
        statement.bindDouble(4, entity.getLatitud());
        statement.bindDouble(5, entity.getLongitud());
        if (entity.getRutaFoto() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getRutaFoto());
        }
        final int _tmp = entity.getSincronizado() ? 1 : 0;
        statement.bindLong(7, _tmp);
        statement.bindLong(8, entity.getId());
      }
    };
  }

  @Override
  public Object insertReporte(final Reporte reporte, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfReporte.insert(reporte);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteReporte(final Reporte reporte, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfReporte.handle(reporte);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateReporte(final Reporte reporte, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfReporte.handle(reporte);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<List<Reporte>> getAllReportes() {
    final String _sql = "SELECT * FROM reportes ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"reportes"}, false, new Callable<List<Reporte>>() {
      @Override
      @Nullable
      public List<Reporte> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDescripcion = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcion");
          final int _cursorIndexOfFechaHora = CursorUtil.getColumnIndexOrThrow(_cursor, "fechaHora");
          final int _cursorIndexOfLatitud = CursorUtil.getColumnIndexOrThrow(_cursor, "latitud");
          final int _cursorIndexOfLongitud = CursorUtil.getColumnIndexOrThrow(_cursor, "longitud");
          final int _cursorIndexOfRutaFoto = CursorUtil.getColumnIndexOrThrow(_cursor, "rutaFoto");
          final int _cursorIndexOfSincronizado = CursorUtil.getColumnIndexOrThrow(_cursor, "sincronizado");
          final List<Reporte> _result = new ArrayList<Reporte>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Reporte _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDescripcion;
            if (_cursor.isNull(_cursorIndexOfDescripcion)) {
              _tmpDescripcion = null;
            } else {
              _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
            }
            final String _tmpFechaHora;
            if (_cursor.isNull(_cursorIndexOfFechaHora)) {
              _tmpFechaHora = null;
            } else {
              _tmpFechaHora = _cursor.getString(_cursorIndexOfFechaHora);
            }
            final double _tmpLatitud;
            _tmpLatitud = _cursor.getDouble(_cursorIndexOfLatitud);
            final double _tmpLongitud;
            _tmpLongitud = _cursor.getDouble(_cursorIndexOfLongitud);
            final String _tmpRutaFoto;
            if (_cursor.isNull(_cursorIndexOfRutaFoto)) {
              _tmpRutaFoto = null;
            } else {
              _tmpRutaFoto = _cursor.getString(_cursorIndexOfRutaFoto);
            }
            final boolean _tmpSincronizado;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfSincronizado);
            _tmpSincronizado = _tmp != 0;
            _item = new Reporte(_tmpId,_tmpDescripcion,_tmpFechaHora,_tmpLatitud,_tmpLongitud,_tmpRutaFoto,_tmpSincronizado);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Reporte> getReporteById(final int id) {
    final String _sql = "SELECT * FROM reportes WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[] {"reportes"}, false, new Callable<Reporte>() {
      @Override
      @Nullable
      public Reporte call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDescripcion = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcion");
          final int _cursorIndexOfFechaHora = CursorUtil.getColumnIndexOrThrow(_cursor, "fechaHora");
          final int _cursorIndexOfLatitud = CursorUtil.getColumnIndexOrThrow(_cursor, "latitud");
          final int _cursorIndexOfLongitud = CursorUtil.getColumnIndexOrThrow(_cursor, "longitud");
          final int _cursorIndexOfRutaFoto = CursorUtil.getColumnIndexOrThrow(_cursor, "rutaFoto");
          final int _cursorIndexOfSincronizado = CursorUtil.getColumnIndexOrThrow(_cursor, "sincronizado");
          final Reporte _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDescripcion;
            if (_cursor.isNull(_cursorIndexOfDescripcion)) {
              _tmpDescripcion = null;
            } else {
              _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
            }
            final String _tmpFechaHora;
            if (_cursor.isNull(_cursorIndexOfFechaHora)) {
              _tmpFechaHora = null;
            } else {
              _tmpFechaHora = _cursor.getString(_cursorIndexOfFechaHora);
            }
            final double _tmpLatitud;
            _tmpLatitud = _cursor.getDouble(_cursorIndexOfLatitud);
            final double _tmpLongitud;
            _tmpLongitud = _cursor.getDouble(_cursorIndexOfLongitud);
            final String _tmpRutaFoto;
            if (_cursor.isNull(_cursorIndexOfRutaFoto)) {
              _tmpRutaFoto = null;
            } else {
              _tmpRutaFoto = _cursor.getString(_cursorIndexOfRutaFoto);
            }
            final boolean _tmpSincronizado;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfSincronizado);
            _tmpSincronizado = _tmp != 0;
            _result = new Reporte(_tmpId,_tmpDescripcion,_tmpFechaHora,_tmpLatitud,_tmpLongitud,_tmpRutaFoto,_tmpSincronizado);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
