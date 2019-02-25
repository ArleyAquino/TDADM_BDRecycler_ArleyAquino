package mx.edu.ittepic.tdam_bdrecycler_arleymagnoliaaquinogarcia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class BaseDatos extends SQLiteOpenHelper {
    public BaseDatos( Context context,  String name,  SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE PROPIETARIO(IDP VARCHAR(200) PRIMARY KEY NOT NULL, NOMBRE VARCHAR(200), DOMICILIO VARCHAR(500), TELEFONO VARCHAR(50))");
        db.execSQL("INSERT INTO PROPIETARIO VALUES('1','arley','Valles de la cruz','321154545')");
        db.execSQL("INSERT INTO PROPIETARIO VALUES('2','magnolia','Buagmbilias','7996542')");
        db.execSQL("INSERT INTO PROPIETARIO VALUES('3','aquino','Cerro de la cruz','3232323025')");
        db.execSQL("INSERT INTO PROPIETARIO VALUES('4','garcia','Valle dorado','21215148')");
        db.execSQL("INSERT INTO PROPIETARIO VALUES('5','arley','Valle rojo','3333333')");
        db.execSQL("INSERT INTO PROPIETARIO VALUES('6','andrea','Mexico','222222')");
        db.execSQL("INSERT INTO PROPIETARIO VALUES('7','ramiro','Jacarandas','3111111')");
        db.execSQL("INSERT INTO PROPIETARIO VALUES('8','enrique','Emilio','555555')");
        db.execSQL("INSERT INTO PROPIETARIO VALUES('9','estrella','Guadalajara','5565666')");
        db.execSQL("INSERT INTO PROPIETARIO VALUES('10','david','Valles','666666')");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}