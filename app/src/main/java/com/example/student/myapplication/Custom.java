package com.example.student.myapplication;

public class Custom {
    private int Avt;
    private String Ten;
    private String Age;
    private int Country;

    public Custom(int avt, String ten, String age, int country) {
        Avt = avt;
        Ten = ten;
        Age = age;
        Country = country;
    }

    public int getAvt() {
        return Avt;
    }

    public void setAvt(int avt) {
        Avt = avt;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public int getCountry() {
        return Country;
    }

    public void setCountry(int country) {
        Country = country;
    }

    @Override
    public String toString() {
        return this.Ten +"\n"+ this.Age;
    }
}
