package com.mygdx.game;



import java.io.Serializable;

public class Phong implements Serializable {
    private int id;
    private String name;
    private  int songuoi;
    private String mota;

    public Phong(int id, String name, int songuoi, String mota) {
        this.id = id;
        this.name = name;
        this.songuoi = songuoi;
        this.mota = mota;
    }

    public Phong(String name, int songuoi, String mota) {
        this.name = name;
        this.songuoi = songuoi;
        this.mota = mota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSonguoi() {
        return songuoi;
    }

    public void setSonguoi(int songuoi) {
        this.songuoi = songuoi;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }



    @Override
    public String toString() {
        return
                 + id +
                " \t" + name  +
                "\t" + songuoi +
                "\t'" + mota
                ;
    }
}
