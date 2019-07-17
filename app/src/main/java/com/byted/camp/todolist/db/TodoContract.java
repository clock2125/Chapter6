package com.byted.camp.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量

    private TodoContract() { }
    public static class TodoEntry implements BaseColumns{
        public static final String TABLE_NAME= "Todo";
        public static final String MESSAGE =  "message";
        public static final String TIME =  "time";
        public static final String STATE = "state";
    }
    static final String SQL_CREAT_TODOS = "CREATE TABLE "+ TodoEntry.TABLE_NAME +
            " ( "+TodoEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + TodoEntry.MESSAGE + " TEXT , "
            +TodoEntry.TIME + " TEXT , "+TodoEntry.STATE+" LONG )" ;
    static final String SQL_DELETE_TODOENTRIES = "DROP TABLE IF EXISTS "+TodoEntry.TABLE_NAME;

}
