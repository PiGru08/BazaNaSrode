package com.example.bazanasrode;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "auta")
public class Auto {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_auta")
    private int idAuta;
    @ColumnInfo(name = "marka-auta")
    private String marka;
    private String model;
    private double pojemnoscSilnika;
    private int moc;
    private int rocznik;
    private double przebieg;

    public Auto(int idAuta, String marka, String model, double pojemnoscSilnika, int moc, int rocznik, double przebieg) {
        this.idAuta = 0;
        this.marka = marka;
        this.model = model;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.moc = moc;
        this.rocznik = rocznik;
        this.przebieg = przebieg;
    }

    public int getIdAuta() {
        return idAuta;
    }

    public void setIdAuta(int idAuta) {
        this.idAuta = idAuta;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public double getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(double przebieg) {
        this.przebieg = przebieg;
    }

}

