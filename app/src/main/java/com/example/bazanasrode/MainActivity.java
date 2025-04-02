package com.example.bazanasrode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private DataBaseAuta dataBaseAuta;
    private EditText marka;
    private EditText model;
    private EditText pojemnoscSilnika;
    private EditText moc;
    private EditText rocznik;
    private EditText przebieg;
    private Button button;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        marka = findViewById(R.id.editTextMarka);
        model = findViewById(R.id.editTextModel);
        pojemnoscSilnika = findViewById(R.id.editTextPojemnosc);
        moc = findViewById(R.id.editTextMoc);
        rocznik = findViewById(R.id.editTextRocznik);
        przebieg = findViewById(R.id.editTextPrzebieg);
        button = findViewById(R.id.button);
        listView = findViewById(R.id.listViewAuta);
        RoomDatabase.Callback mojCallBack = new RoomDatabase.Callback() {
            @Override
            public void onCreate(@NonNull SupportSQLiteDatabase db) {
                super.onCreate(db);
            }

            @Override
            public void onOpen(@NonNull SupportSQLiteDatabase db) {
                super.onOpen(db);
            }

        };
        dataBaseAuta = Room.databaseBuilder(
                getApplicationContext(),DataBaseAuta.class,"auta").addCallback(mojCallBack)
                .allowMainThreadQueries()
                .build();
        //TODO: Do zrobienia teraz dodawanie do bazy, wyświetlanie, update w liscie oraz usuwanie z bazy z listy, inspirowane z bazydanych (jest na git z środy 02.04.2025

    }

}