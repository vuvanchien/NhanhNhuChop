package com.chiendeptrai.vuvanchien.nhanhnhuchop.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.Helper.QuizContract.*;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Nhanhnhuchop.db";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase database;


    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        this.database = sqLiteDatabase;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTERGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTA + " TEXT, " +
                QuestionsTable.COLUMN_OPTB + " TEXT, " +
                QuestionsTable.COLUMN_OPTC + " TEXT, " +
                QuestionsTable.COLUMN_OPTD + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER + " TEXT" +
                ")";
        sqLiteDatabase.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    private void fillQuestionsTable() {
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
