package com.example.eptable;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TeamModel teamModel = new TeamModel();
    List<TeamModel> team;
    TeamAdapter teamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("EPL Table as of 23rd Feb 2023");

        listView = findViewById(R.id.listview);
        teamArray();
        teamAdapter = new TeamAdapter(getApplicationContext(), team);
        listView.setAdapter(teamAdapter);
    }

    private void teamArray() {
        team = new ArrayList<>();
//public TeamModel(String clubPosition, int teamLogo, String clubName, String mp, String w, String d, String l, String gf, String ga, String gd, String pts, int last5_1, int last5_2, int last5_3, int last5_4, int last5_5)
        team.add(new TeamModel("1", R.drawable.mancity_logo,
                "Man City", "23", "16", "3", "4", "59", "23", "36", "51",
                R.drawable.baseline_win_24,R.drawable.baseline_win_24,R.drawable.baseline_lost_24,R.drawable.baseline_win_24,R.drawable.baseline_win_24));
//        team.add(new TeamModel("2", R.drawable.baseline_sports_baseball_24,
//                "Arsenal", "22", "16", "3", "3", "47", "21", "26", "51",
//                R.drawable.baseline_lost_24,R.drawable.baseline_draw_24,R.drawable.baseline_lost_24,R.drawable.baseline_win_24,R.drawable.baseline_win_24));

    }

//    @Override
//    public boolean onOptionsItemSelected(@androidx.annotation.NonNull MenuItem item) {
//
//        if (item.getItemId() == android.R.id.home) {
//            onBackPressed();
//        }
//        return super.onOptionsItemSelected(item);
//    }
}