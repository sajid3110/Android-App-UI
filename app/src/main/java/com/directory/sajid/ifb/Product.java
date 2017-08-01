package com.directory.sajid.ifb;

/**
 * Created by sajid on 1/8/17.
 */

public class Product {
    String model_no , time ;

    public Product(String model_no, String time) {
        this.model_no = model_no;
        this.time = time;
    }

    public String getModel_no() {
        return model_no;
    }

    public void setModel_no(String model_no) {
        this.model_no = model_no;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
