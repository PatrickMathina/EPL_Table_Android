package com.example.eptable;

public class TeamModel {
    private int teamLogo, last5_1, last5_2, last5_3, last5_4, last5_5;
    private String clubPosition, clubName, mp, w, d, l, gf, ga, gd, pts;

    public TeamModel(String clubPosition, int teamLogo, String clubName, String mp, String w, String d,
                     String l, String gf, String ga, String gd, String pts, int last5_1, int last5_2,
                     int last5_3, int last5_4, int last5_5) {
        this.clubPosition = clubPosition;
        this.teamLogo = teamLogo;
        this.clubName = clubName;
        this.mp = mp;
        this.w = w;
        this.d = d;
        this.l = l;
        this.gf = gf;
        this.ga = ga;
        this.gd = gd;
        this.pts = pts;
        this.last5_1 = last5_1;
        this.last5_2 = last5_2;
        this.last5_3 = last5_3;
        this.last5_4 = last5_4;
        this.last5_5 = last5_5;
    }

    public TeamModel() {
        this.clubPosition = "";
        this.teamLogo = 0;
        this.clubName = "";
        this.mp = "";
        this.w = "";
        this.d = "";
        this.l = "";
        this.gf = "";
        this.ga = "";
        this.gd = "";
        this.pts = "";
        this.last5_1 = 0;
        this.last5_2 = 0;
        this.last5_3 = 0;
        this.last5_4 = 0;
        this.last5_5 = 0;
    }

    public String getClubPosition() {
        return clubPosition;
    }

    public void setClubPosition(String clubPosition) {
        this.clubPosition = clubPosition;
    }

    public int getTeamLogo() {
        return teamLogo;
    }

    public void setTeamLogo(int teamLogo) {
        this.teamLogo = teamLogo;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp;
    }

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getGf() {
        return gf;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    public String getGa() {
        return ga;
    }

    public void setGa(String ga) {
        this.ga = ga;
    }

    public String getGd() {
        return gd;
    }

    public void setGd(String gd) {
        this.gd = gd;
    }

    public String getPts() {
        return pts;
    }

    public void setPts(String pts) {
        this.pts = pts;
    }

    public int getLast5_1() {
        return last5_1;
    }

    public void setLast5_1(int last5_1) {
        this.last5_1 = last5_1;
    }

    public int getLast5_2() {
        return last5_2;
    }

    public void setLast5_2(int last5_2) {
        this.last5_2 = last5_2;
    }

    public int getLast5_3() {
        return last5_3;
    }

    public void setLast5_3(int last5_3) {
        this.last5_3 = last5_3;
    }

    public int getLast5_4() {
        return last5_4;
    }

    public void setLast5_4(int last5_4) {
        this.last5_4 = last5_4;
    }

    public int getLast5_5() {
        return last5_5;
    }

    public void setLast5_5(int last5_5) {
        this.last5_5 = last5_5;
    }
}
