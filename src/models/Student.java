package models;
import java.io.Serializable;

public class Student implements Serializable {
    String Id;
    String name;
    int age;
    String address;
    public Student(){

    }

    public Student(String id, String name, int age, String address) {
        Id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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
}
