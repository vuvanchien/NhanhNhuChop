package com.chiendeptrai.vuvanchien.nhanhnhuchop.Helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.Mode.FastQuestion;

import java.util.ArrayList;
import java.util.List;

public class FastQuestionHelper extends SQLiteOpenHelper {
    private Context context;
    private static final String DB_NAME = "NhanhNhuChop.db";
    private static final int DB_VERSION = 3;
    private static final String TABLE_NAME = "TQ";
    private static final String UID = "_UID";
    private static final String QUESTION = "QUESTION";
    private static final String OPTA = "OPTA";
    private static final String OPTB = "OPTB";
    private static final String OPTC = "OPTC";
    private static final String OPTD = "OPTD";
    private static final String ANSWER = "ANSWER";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " +
            "" + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " +
            "" + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), " +
            "" + OPTD + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";

    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public FastQuestionHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);

    }
    public void allQuestion(){
        ArrayList<FastQuestion> fastQuestionArrayList = new ArrayList<>();
        fastQuestionArrayList.add(new FastQuestion("Ronaldo là người nước nào?", "A. Tây Ban Nha", "B. Bồ Đào Nha", "C. Pháp", "D. Anh", "B. Bồ Đào Nha"));
        fastQuestionArrayList.add(new FastQuestion("Tôi luôn mang giày đi ngủ. Tôi là ai?", "A. Con người", "B. Con ngựa  ", "C. Con mèo ", "D. Con chim ", "B. Con ngựa  "));
        fastQuestionArrayList.add(new FastQuestion("Bạn làm việc gì đầu tiên mỗi buổi sáng?", "A. Đánh răng", "B. Mở mắt", "C. Thức dậy", "D. Cầm điện thoại", "B. Mở mắt"));
        fastQuestionArrayList.add(new FastQuestion("Có một đàn vịt, cho biết 1 con đi trước thì có 2 con đi sau, 1 con đi sau thì có 2 con đi trước, 1 con đi giữa thì có 2 con đi 2 bên. Hỏi đàn vịt đó có mấy con?","A. 1", "B. 2", "C. 3", "D. 4", "C. 3"));
        fastQuestionArrayList.add(new FastQuestion("Sở thú bị cháy, con gì chạy ra đầu tiên?", "A. Bỏ cuộc", "B. Cho tôi qua đi mà", "C. Không thể qua ", "D. Câu này khó quá", "A. Bỏ cuộc"));
this.addAllQuestion(fastQuestionArrayList);
    }

    private void addAllQuestion(ArrayList<FastQuestion> questionArrayLists) {
        SQLiteDatabase database = this.getWritableDatabase();
        database.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            for (FastQuestion question: questionArrayLists){
                values.put(QUESTION, question.getQuestion());
                values.put(OPTA, question.getOpta());
                values.put(OPTB, question.getOptb());
                values.put(OPTC, question.getOptc());
                values.put(OPTD, question.getOptd());
                values.put(ANSWER, question.getAnswer());
                database.insert(TABLE_NAME, null, values);
            }
            database.setTransactionSuccessful();

        }finally {
            database.endTransaction();
            database.close();
        }
    }
public List<FastQuestion> getAllofTheQuestion(){
        List<FastQuestion> questionList = new ArrayList<>();
        SQLiteDatabase database = this.getWritableDatabase();
        database.beginTransaction();
        String coloumn[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER};
    Cursor cursor = database.query(TABLE_NAME, coloumn, null, null, null, null, null);
    while (cursor.moveToNext()){
        FastQuestion fastQuestion = new FastQuestion();
        fastQuestion.setId(cursor.getInt(0));
        fastQuestion.setQuestion(cursor.getString(1));
        fastQuestion.setOpta(cursor.getString(2));
        fastQuestion.setOptb(cursor.getString(3));
        fastQuestion.setOptc(cursor.getString(4));
        fastQuestion.setOptd(cursor.getString(5));
        fastQuestion.setAnswer(cursor.getString(6));
        questionList.add(fastQuestion);
    }
    database.setTransactionSuccessful();
    database.endTransaction();
    cursor.close();
    database.close();
    return questionList;
}
}
