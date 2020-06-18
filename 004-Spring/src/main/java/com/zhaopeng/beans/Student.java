package com.zhaopeng.beans;

/**
 * @Author zhaopeng
 * @Date 2020/5/14
 */
public class Student {

    private int id;
    private String name;
    private int age;
    private String address;
    private School NAME;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public School getNAME() {
        return NAME;
    }

    public void setNAME(School NAME) {
        this.NAME = NAME;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", NAME=" + NAME +
                '}';
    }
}
