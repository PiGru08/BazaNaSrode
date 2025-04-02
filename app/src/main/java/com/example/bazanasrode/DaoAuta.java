package com.example.bazanasrode;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface DaoAuta {
    @Insert
    public void dodajAuto(Auto auto);

    @Delete
    public void usunAuto(Auto auto);

    @Update
    public void zaktualizujDaneAuta(Auto auto);

    @Query("Select * from auta")
    public List<Auto> wypiszWszystkieAuta();
}
