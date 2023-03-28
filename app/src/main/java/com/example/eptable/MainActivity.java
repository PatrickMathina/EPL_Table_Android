package com.example.eptable;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    //    TeamModel teamModel = new TeamModel();
    List<TeamModel> teamModelList;
//    TeamAdapter teamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("EPL Table as of 22nd May 2023");

        listView = findViewById(R.id.listview);
        teamArray();
        listView.setAdapter(new TeamAdapter(getApplicationContext(), teamModelList));
        // i.e
//        teamAdapter = new TeamAdapter(getApplicationContext(), teamModelList);
//        listView.setAdapter(teamAdapter);

        // Write a message to the database
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//
//        myRef.setValue("Hello, World!");

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("teams");

        databaseReference.setValue("details");


    }

    private void teamArray() {
        teamModelList = new ArrayList<>();

        teamModelList.add(new TeamModel(1, "Arsenal", R.drawable.arsenal, 28,
                22, 3, 3, 66, 26, 0, 0, R.drawable.baseline_win_24, R.drawable.baseline_win_24,
                R.drawable.baseline_win_24, R.drawable.baseline_win_24, R.drawable.baseline_win_24));

        teamModelList.add(new TeamModel(2, "Man City", R.drawable.mancity_logo, 27,
                19, 4, 4, 67, 25, 0, 0, R.drawable.baseline_win_24, R.drawable.baseline_win_24,
                R.drawable.baseline_win_24, R.drawable.baseline_draw_24, R.drawable.baseline_win_24));

        teamModelList.add(new TeamModel(3, "Man United", R.drawable.man_u, 26,
                15, 5, 6, 41, 35, 0, 0, R.drawable.baseline_draw_24, R.drawable.baseline_lost_24,
                R.drawable.baseline_win_24, R.drawable.baseline_win_24, R.drawable.baseline_draw_24));

        teamModelList.add(new TeamModel(4, "Tottenham", R.drawable.totte, 28,
                15, 4, 9, 52, 40, 0, 0, R.drawable.baseline_draw_24, R.drawable.baseline_win_24,
                R.drawable.baseline_lost_24, R.drawable.baseline_win_24, R.drawable.baseline_win_24));

        teamModelList.add(new TeamModel(5, "Newcastle", R.drawable.newcastle, 26,
                12, 11, 3, 39, 19, 0, 0, R.drawable.baseline_win_24, R.drawable.baseline_win_24,
                R.drawable.baseline_lost_24, R.drawable.baseline_lost_24, R.drawable.baseline_draw_24));

        teamModelList.add(new TeamModel(6, "Liverpool", R.drawable.liverpool, 26,
                12, 6, 8, 47, 29, 0, 0, R.drawable.baseline_lost_24, R.drawable.baseline_win_24,
                R.drawable.baseline_win_24, R.drawable.baseline_lost_24, R.drawable.baseline_win_24));

        teamModelList.add(new TeamModel(7, "Brighton", R.drawable.brighton, 25,
                12, 6, 7, 46, 31, 0, 0, R.drawable.baseline_win_24, R.drawable.baseline_draw_24,
                R.drawable.baseline_win_24, R.drawable.baseline_lost_24, R.drawable.baseline_draw_24));

        teamModelList.add(new TeamModel(8, "Brentford", R.drawable.brentford, 27,
                10, 12, 5, 43, 34, 0, 0, R.drawable.baseline_draw_24, R.drawable.baseline_win_24,
                R.drawable.baseline_lost_24, R.drawable.baseline_win_24, R.drawable.baseline_draw_24));

        teamModelList.add(new TeamModel(9, "Fulham", R.drawable.fulham, 27,
                11, 6, 10, 38, 37, 0, 0, R.drawable.baseline_lost_24, R.drawable.baseline_lost_24,
                R.drawable.baseline_draw_24, R.drawable.baseline_win_24, R.drawable.baseline_win_24));

        teamModelList.add(new TeamModel(10, "Chelsea", R.drawable.chelsea, 27,
                10, 8, 9, 29, 28, 0, 0, R.drawable.baseline_draw_24, R.drawable.baseline_win_24,
                R.drawable.baseline_win_24, R.drawable.baseline_lost_24, R.drawable.baseline_lost_24));

        teamModelList.add(new TeamModel(11, "Aston Villa", R.drawable.aston, 27,
                11, 5, 11, 35, 39, 0, 0, R.drawable.baseline_win_24, R.drawable.baseline_draw_24,
                R.drawable.baseline_win_24, R.drawable.baseline_win_24, R.drawable.baseline_lost_24));

        teamModelList.add(new TeamModel(12, "Crystal Palace", R.drawable.crystal, 28,
                6, 9, 13, 22, 38, 0, 0, R.drawable.baseline_lost_24, R.drawable.baseline_lost_24,
                R.drawable.baseline_lost_24, R.drawable.baseline_lost_24, R.drawable.baseline_draw_24));

        teamModelList.add(new TeamModel(13, "Wolves", R.drawable.wolves, 28,
                7, 6, 15, 22, 41, 0, 0, R.drawable.baseline_lost_24, R.drawable.baseline_lost_24,
                R.drawable.baseline_win_24, R.drawable.baseline_lost_24, R.drawable.baseline_draw_24));
    }
}