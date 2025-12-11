package com.ciudad.reportes.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ReporteDao _reporteDao;

  private volatile LogEventoDao _logEventoDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `reportes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `descripcion` TEXT NOT NULL, `fechaHora` TEXT NOT NULL, `latitud` REAL NOT NULL, `longitud` REAL NOT NULL, `rutaFoto` TEXT, `sincronizado` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `logs_evento` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `evento` TEXT NOT NULL, `detalle` TEXT NOT NULL, `fechaHora` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '66a0088d0544f33141f6c3f8e4907a62')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `reportes`");
        db.execSQL("DROP TABLE IF EXISTS `logs_evento`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsReportes = new HashMap<String, TableInfo.Column>(7);
        _columnsReportes.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReportes.put("descripcion", new TableInfo.Column("descripcion", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReportes.put("fechaHora", new TableInfo.Column("fechaHora", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReportes.put("latitud", new TableInfo.Column("latitud", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReportes.put("longitud", new TableInfo.Column("longitud", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReportes.put("rutaFoto", new TableInfo.Column("rutaFoto", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReportes.put("sincronizado", new TableInfo.Column("sincronizado", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysReportes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesReportes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoReportes = new TableInfo("reportes", _columnsReportes, _foreignKeysReportes, _indicesReportes);
        final TableInfo _existingReportes = TableInfo.read(db, "reportes");
        if (!_infoReportes.equals(_existingReportes)) {
          return new RoomOpenHelper.ValidationResult(false, "reportes(com.ciudad.reportes.data.model.Reporte).\n"
                  + " Expected:\n" + _infoReportes + "\n"
                  + " Found:\n" + _existingReportes);
        }
        final HashMap<String, TableInfo.Column> _columnsLogsEvento = new HashMap<String, TableInfo.Column>(4);
        _columnsLogsEvento.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLogsEvento.put("evento", new TableInfo.Column("evento", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLogsEvento.put("detalle", new TableInfo.Column("detalle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLogsEvento.put("fechaHora", new TableInfo.Column("fechaHora", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLogsEvento = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLogsEvento = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLogsEvento = new TableInfo("logs_evento", _columnsLogsEvento, _foreignKeysLogsEvento, _indicesLogsEvento);
        final TableInfo _existingLogsEvento = TableInfo.read(db, "logs_evento");
        if (!_infoLogsEvento.equals(_existingLogsEvento)) {
          return new RoomOpenHelper.ValidationResult(false, "logs_evento(com.ciudad.reportes.data.model.LogEvento).\n"
                  + " Expected:\n" + _infoLogsEvento + "\n"
                  + " Found:\n" + _existingLogsEvento);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "66a0088d0544f33141f6c3f8e4907a62", "7f5ea4eacdacc8d94e8a20171ed0feeb");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "reportes","logs_evento");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `reportes`");
      _db.execSQL("DELETE FROM `logs_evento`");
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
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ReporteDao.class, ReporteDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(LogEventoDao.class, LogEventoDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public ReporteDao reporteDao() {
    if (_reporteDao != null) {
      return _reporteDao;
    } else {
      synchronized(this) {
        if(_reporteDao == null) {
          _reporteDao = new ReporteDao_Impl(this);
        }
        return _reporteDao;
      }
    }
  }

  @Override
  public LogEventoDao logEventoDao() {
    if (_logEventoDao != null) {
      return _logEventoDao;
    } else {
      synchronized(this) {
        if(_logEventoDao == null) {
          _logEventoDao = new LogEventoDao_Impl(this);
        }
        return _logEventoDao;
      }
    }
  }
}
