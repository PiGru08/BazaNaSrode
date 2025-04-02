package com.example.bazanasrode;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Auto.class}, version = 2, exportSchema = false)
    public abstract class DataBaseAuta extends RoomDatabase{
        public abstract DaoAuta getDaoAuta();
    }
