package com.raminarmanfar.personalgermanlearning

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHandler(constext: Context, name: String, factory: SQLiteDatabase.CursorFactory, version: Int):
        SQLiteOpenHelper(constext, DATABASE_NAME, factory, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "MyData.db"
        private const val DATABASE_VERSION = 1
        // HP = Herr Professor
        const val HP_TABLE_NAME = "HerrProfessor"
        const val COL_HP_ID = "hpId"
        const val COL_HP_VERB_NAME = "verbName"
        const val COL_HP_TRANSLATION = "translation"
        const val COL_HP_IS_REFLEXIVE = "isReflexive"
        const val COL_HP_VERB_CASE = "verbCase"
        const val COL_HP_YOUTUBE_LINK = "youtubeLink"
        const val COL_HP_IMAGE = "image"
        const val COL_HP_ICH = "ich"
        const val COL_HP_DU = "du"
        const val COL_HP_ER_SIE_ES = "erSieEs"
        const val COL_HP_WIR = "wir"
        const val COL_HP_IHR = "ihr"
        const val COL_HP_SIE = "sie"
        const val COL_HP_PRESENT_PERFECT = "presentPerfect"
        const val COL_HP_IMP_DU = "impDu"
        const val COL_HP_IMP_WIR = "impWir"
        const val COL_HP_IMP_IHR = "impIhr"
        const val COL_HP_IMP_SIE = "impSie"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_HP_TABLE: String = ("CREATE TABLE $HP_TABLE_NAME (" +
                "$COL_HP_ID INTEGER PRIMARY KEY AUTOINCREMENT" +
                "$COL_HP_VERB_NAME TEXT" +
                "$COL_HP_TRANSLATION TEXT" +
                "$COL_HP_IS_REFLEXIVE BOOLEAN DEFAULT FALSE" +
                "$COL_HP_VERB_CASE TEXT" +
                "$COL_HP_YOUTUBE_LINK TEXT" +
                "$COL_HP_IMAGE TEXT" +
                "$COL_HP_ICH TEXT" +
                "$COL_HP_DU TEXT" +
                "$COL_HP_ER_SIE_ES TEXT" +
                "$COL_HP_WIR TEXT" +
                "$COL_HP_IHR TEXT" +
                "$COL_HP_SIE TEXT" +
                "$COL_HP_PRESENT_PERFECT TEXT" +
                "$COL_HP_IMP_DU TEXT" +
                "$COL_HP_IMP_WIR TEXT" +
                "$COL_HP_IMP_IHR TEXT" +
                "$COL_HP_IMP_SIE TEXT")
        db?.execSQL(CREATE_HP_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

}