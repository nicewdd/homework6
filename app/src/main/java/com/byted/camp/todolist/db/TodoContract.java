package com.byted.camp.todolist.db;

import java.util.Date;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量

    private TodoContract() {

    }
    public static class FeedEntry{
        public static final String TABLE_NAME = "todolist";
        public static final String _ID = "_id";
        public static final String COLUMN_CONTENT = "content";
        public static final String COLUMN_STATE = "state";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_PRIORITY = "priority";
    }

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + FeedEntry.TABLE_NAME + "(" +
                    FeedEntry._ID + " INTEGER PRIMARY KEY, " +
                    FeedEntry.COLUMN_CONTENT + " TEXT, " +
                    FeedEntry.COLUMN_STATE + " TINYINT, " +
                    FeedEntry.COLUMN_DATE + " BIGINT)";
    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;

}
