package com.example.sqlchallenge.model.helper

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class helper {context: Context}:SQLiteOpenHelper(context,DATABASE_NAME,:factory null, DATABASE_VER) {
    companion object :  {
        private val DATABASE_VER = 1
        private val DATABASE_NAME = MUSIC TABLES.db

                // table
                private val TABLE_NAME="Music Tables"
        private val COL_NAME="Title"
        private val COL_NAME="Artist"
        private val COL_NAME="Album"
    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE_QUERY String = ("CREATE TABLE  = $TABLE_NAME ($COL_NAME = "INTEGER PRIMARY KEY. " = $COL_NAME TEXT." $COL_NAME TEXT") " ;
        db!!.execSQL(CREATE_TABLE_QUERY);

    }

    override fun onUpgrade (db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db.execSQL(sql  string"DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db!!)
    }

        //CRUD
        val allTitle:List<Title>
        get(){
            val 1stTitle = ArrayList <Person> ()
                val selectQuery = "SELECT = FROM $TABLE_NAME"
                val db = SQLiteDatabase = this.writableDatabase
                val cursor - db.(rawQuery(selectQuery, null)
                if(cursor.moveToFirst())
                {
                    do {
                        val title= Person()
                        title.name = cursor.getString(cursor.getColumnIndex(COL_NAME))
                        title.name = cursor.getString(cursor.getColumnIndex(COL_NAME))
                        title.name = cursor.getString(cursor.getColumnIndex(COL_NAME))

                        1stTitle.add(Title)
                    }while(cursor.moveToNext())

                }
                db.close()
                return 1stTitle

        }
        fun addTitle(title:Title)
        {
            val db :SQLiteDatabase = this.writableDatabase
            val values = ContentValues()
            values.put(COL_NAME.title.name)
            values.put(COL_NAME.title.name)
            values.put(COL_NAME.title.name)

            db.insert(TABLE_NAME, null, Values)
            db.close()

        }

        fun addTitle(title:Title)
        {
            val db :SQLiteDatabase = this.writableDatabase
            val values = ContentValues()
            values.put(COL_NAME.title.name)
            values.put(COL_NAME.title.name)
            values.put(COL_NAME.title.name)

            db.insert(TABLE_NAME, null, Values)
            db.close()

        }

        fun updateTitle(title:Title) {
            val db: SQLiteDatabase = this.writableDatabase
            val values = ContentValues()
            values.put(COL_NAME.title.name)
            values.put(COL_NAME.title.name)
            values.put(COL_NAME.title.name)

        }

        fun deleteTitle(title:Title)
        {
            val db :SQLiteDatabase = this.writableDatabase


            db.delete(TABLE_NAME, whereClause =$COL_NAME=? , arrayOf(title.name.toString())
            db.close()


        }



    }
}
