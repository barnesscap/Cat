package com.igor.sch;

public class Cat {
    private String name;
    private String voice= "Meow-Meow";
    private int age;
    private double weight;
    private boolean sex;

    public Cat(){
    }

    public Cat(String name, int age, double weight,boolean sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String isSex() {
        if (sex) return "male";
        else return "female";
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return  "name - '" + name + '\'' +
                ", voice - '" + voice + '\'' +
                ", age - " + age +
                ", weight - " + weight +
                ", sex - " + isSex();
    }
}
