/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv.mvc;
import java.io.Serializable;
/**
 *
 * @author admin
 */
public class lecturer implements Serializable {
    private int id;
    private String name;
    private byte age;
    private String address;
    private String gmail;
    
public lecturer(int id, String name, byte age, 
         String address, float gpa) {
     super();
     this.id = id;
     this.name = name;
     this.age = age;
     this.address = address;
     this.gmail = gmail;
 }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
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

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}