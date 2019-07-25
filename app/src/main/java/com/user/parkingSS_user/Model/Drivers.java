package com.user.parkingSS_user.Model;

public class Drivers {

    private String name ;
    private String mobile ;
    private String e_mail ;
    private String location ;
    private String type ;
    private String vehicle_type ;
    private String charges ;
    private String img;
    private int img_demo;
    private String time;
    private String date;


    public Drivers(String name, String mobile, String e_mail,
                   String location, String type, String vehicle_type,
                   String charges, String img, int img_demo, String time, String date) {
        this.name = name;
        this.mobile = mobile;
        this.e_mail = e_mail;
        this.location = location;
        this.type = type;
        this.vehicle_type = vehicle_type;
        this.charges = charges;
        this.img = img;
        this.img_demo = img_demo;
        this.time = time;
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getImg_demo() {
        return img_demo;
    }

    public void setImg_demo(int img_demo) {
        this.img_demo = img_demo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }
}
