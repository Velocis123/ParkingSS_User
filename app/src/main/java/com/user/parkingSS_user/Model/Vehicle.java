package com.user.parkingSS_user.Model;

public class Vehicle {

    private String v_image;
    private String v_name;
    private String v_id;
    private String v_num;

    public String getV_image() {
        return v_image;
    }

    public void setV_image(String v_image) {
        this.v_image = v_image;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public String getV_id() {
        return v_id;
    }

    public void setV_id(String v_id) {
        this.v_id = v_id;
    }

    public String getV_num() {
        return v_num;
    }

    public void setV_num(String v_num) {
        this.v_num = v_num;
    }

    public Vehicle(String v_image, String v_name, String v_id, String v_num) {
        this.v_image = v_image;
        this.v_name = v_name;
        this.v_id = v_id;
        this.v_num = v_num;
    }
}
