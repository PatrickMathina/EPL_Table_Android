package com.example.eptable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TeamAdapter extends BaseAdapter {
    private Context context;
    private List<TeamModel> team;

    public TeamAdapter(Context context, List<TeamModel> team) {
        this.context = context;
        this.team = team;
    }

    @Override
    public int getCount() {
        return team.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.items_list, parent, false);

        ImageView imgV_clubLogo = convertView.findViewById(R.id.clublogo);
        ImageView imgV_last5_1 = convertView.findViewById(R.id.last5_1);
        ImageView imgV_last5_2 = convertView.findViewById(R.id.last5_2);
        ImageView imgV_last5_3 = convertView.findViewById(R.id.last5_3);
        ImageView imgV_last5_4 = convertView.findViewById(R.id.last5_4);
        ImageView imgV_last5_5 = convertView.findViewById(R.id.last5_5);

        TextView txtV_clubPosition = convertView.findViewById(R.id.clubPosition);
        TextView txtV_clubName = convertView.findViewById(R.id.clubName);
        TextView txtV_mp = convertView.findViewById(R.id.mp);
        TextView txtV_w = convertView.findViewById(R.id.w);
        TextView txtV_d = convertView.findViewById(R.id.d);
        TextView txtV_l = convertView.findViewById(R.id.l);
        TextView txtV_gf = convertView.findViewById(R.id.gf);
        TextView txtV_ga = convertView.findViewById(R.id.ga);
        TextView txtV_gd = convertView.findViewById(R.id.gd);
        TextView txtV_pts = convertView.findViewById(R.id.pts);

        imgV_clubLogo.setImageResource(team.get(position).getTeamLogo());
        imgV_last5_1.setImageResource(team.get(position).getLast5_1());
        imgV_last5_2.setImageResource(team.get(position).getLast5_2());
        imgV_last5_3.setImageResource(team.get(position).getLast5_3());
        imgV_last5_4.setImageResource(team.get(position).getLast5_4());
        imgV_last5_5.setImageResource(team.get(position).getLast5_5());

        txtV_clubPosition.setText(team.get(position).getClubPosition());
        txtV_clubName.setText(team.get(position).getClubName());
        txtV_mp.setText(team.get(position).getMp());
        txtV_w.setText(team.get(position).getW());
        txtV_d.setText(team.get(position).getD());
        txtV_l.setText(team.get(position).getL());
        txtV_gf.setText(team.get(position).getGf());
        txtV_ga.setText(team.get(position).getGa());
        txtV_gd.setText(team.get(position).getGd());
        txtV_pts.setText(team.get(position).getPts());

        return convertView;
    }
}
