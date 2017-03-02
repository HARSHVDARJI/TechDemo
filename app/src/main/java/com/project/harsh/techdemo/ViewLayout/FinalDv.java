package com.project.harsh.techdemo.ViewLayout;

/**
 * Created by harsh on 1/3/17.
 */
public class FinalDv {
    public FinalDv(String title, String lolcation, String detail, String time, Integer img) {
        this.img = img;
        this.title = title;
        this.lolcation = lolcation;
        this.time = time;
        this.detail = detail;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLolcation() {
        return lolcation;
    }

    public void setLolcation(String lolcation) {
        this.lolcation = lolcation;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    int img;
    String title;
    String lolcation;
    String time;
    String detail;
    
}
