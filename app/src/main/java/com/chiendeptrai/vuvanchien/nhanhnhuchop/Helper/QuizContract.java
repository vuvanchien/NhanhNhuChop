package com.chiendeptrai.vuvanchien.nhanhnhuchop.Helper;

import android.content.Context;
import android.provider.BaseColumns;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.Mode.Quiz;

public final class QuizContract {

private QuizContract(){

}

    public static class QuestionsTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COLUMN_QUESTION = "QUESTION";
        public static final String COLUMN_OPTA = "OPTA";
        public static final String COLUMN_OPTB = "OPTB";
        public static final String COLUMN_OPTC = "OPTC";
        public static final String COLUMN_OPTD = "OPTD";
        public static final String COLUMN_ANSWER = "ANSWER";

    }
}
