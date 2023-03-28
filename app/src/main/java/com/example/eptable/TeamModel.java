package com.example.eptable;

public class TeamModel {
    private int clubPosition, teamLogo, mp, w, d, l, gf, ga, gd, pts, last5_1, last5_2, last5_3, last5_4, last5_5;
    private String clubName;

    public TeamModel(int clubPosition, String clubName, int teamLogo, int mp, int w, int d, int l, int gf,
                     int ga, int gd, int pts, int last5_1, int last5_2, int last5_3, int last5_4, int last5_5) {
        this.clubPosition = clubPosition;
        this.clubName = clubName;
        this.teamLogo = teamLogo;
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
        this.clubPosition = 0;
        this.teamLogo = 0;
        this.clubName = "";
        this.mp = 0;
        this.w = 0;
        this.d = 0;
        this.l = 0;
        this.gf = 0;
        this.ga = 0;
        this.gd = 0;
        this.pts = 0;
        this.last5_1 = 0;
        this.last5_2 = 0;
        this.last5_3 = 0;
        this.last5_4 = 0;
        this.last5_5 = 0;
    }

    public int getClubPosition() {
//        clubPosition = 0;
//        clubPosition += 1;
        return clubPosition;
    }

    public void setClubPosition(int clubPosition) {
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

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getGa() {
        return ga;
    }

    public void setGa(int ga) {
        this.ga = ga;
    }

    public int getGd() {
        return getGf() - getGa();
    }

    public void setGd(int gd) {
        this.gd = gd;
    }

    public int getPts() {
        return (getW() * 3) + getD();
    }

    public void setPts(int pts) {
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
