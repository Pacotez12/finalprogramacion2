package com.ciudad.reportes.data.local;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ciudad.reportes.data.model.LogEvento;
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
public final class LogEventoDao_Impl implements LogEventoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LogEvento> __insertionAdapterOfLogEvento;

  public LogEventoDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLogEvento = new EntityInsertionAdapter<LogEvento>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `logs_evento` (`id`,`evento`,`detalle`,`fechaHora`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final LogEvento entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getEvento() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getEvento());
        }
        if (entity.getDetalle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDetalle());
        }
        if (entity.getFechaHora() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getFechaHora());
        }
      }
    };
  }

  @Override
  public Object insertLog(final LogEvento log, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfLogEvento.insert(log);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<List<LogEvento>> getLogs() {
    final String _sql = "SELECT * FROM logs_evento ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"logs_evento"}, false, new Callable<List<LogEvento>>() {
      @Override
      @Nullable
      public List<LogEvento> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEvento = CursorUtil.getColumnIndexOrThrow(_cursor, "evento");
          final int _cursorIndexOfDetalle = CursorUtil.getColumnIndexOrThrow(_cursor, "detalle");
          final int _cursorIndexOfFechaHora = CursorUtil.getColumnIndexOrThrow(_cursor, "fechaHora");
          final List<LogEvento> _result = new ArrayList<LogEvento>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final LogEvento _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpEvento;
            if (_cursor.isNull(_cursorIndexOfEvento)) {
              _tmpEvento = null;
            } else {
              _tmpEvento = _cursor.getString(_cursorIndexOfEvento);
            }
            final String _tmpDetalle;
            if (_cursor.isNull(_cursorIndexOfDetalle)) {
              _tmpDetalle = null;
            } else {
              _tmpDetalle = _cursor.getString(_cursorIndexOfDetalle);
            }
            final String _tmpFechaHora;
            if (_cursor.isNull(_cursorIndexOfFechaHora)) {
              _tmpFechaHora = null;
            } else {
              _tmpFechaHora = _cursor.getString(_cursorIndexOfFechaHora);
            }
            _item = new LogEvento(_tmpId,_tmpEvento,_tmpDetalle,_tmpFechaHora);
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
