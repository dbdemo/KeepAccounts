package db.keep.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by zdb on 2016/7/28.
 * 数据库版本管理
 */
public class DbHelper extends SQLiteOpenHelper {

    public static final String databaseName = "keep";
    public static final int databaseVersion = 4;


    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        this(context, name, factory, version, null);
    }

    public DbHelper(Context context) {
        this(context, databaseName, null, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      /*  String create_db_sql = "";
        db.execSQL(create_db_sql);*/
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        System.out.println("oldVersionL: " + oldVersion + "   oldVersion" + newVersion);
    }
}
