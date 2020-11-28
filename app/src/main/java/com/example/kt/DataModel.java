package com.example.kt;

public class DataModel {
    int image;
    String name;
    String subcr;
    public DataModel() {
    }

    public DataModel(int image, String name,String subcr) {
        this.image = image;
        this.name = name;
        this.subcr = subcr;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getSubcr() {
        return subcr;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String songName) {
        this.name = songName;
    }


    public void setSubcr(String subcr) {
        this.subcr = subcr;
    }
}
