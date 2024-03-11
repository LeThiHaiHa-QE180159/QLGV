/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv.mvc;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Manager {
    public static Scanner scanner = new Scanner(System.in);
    private List<lecturer> lecturerList;
    private LecturerDoc lecturerDoc;
/**
     * init LecturerDoc object and
     * read list lecturer when init lecturerManager object
     */   
    public LecturerManager() {
        lecturerDoc = new LecturerDoc();
        lecturerList = lecturerDoc.read();
    }
     /**
     * add lecturer to lecturerList
     */
    public void add() {
        int id = (lecturerList.size() > 0) ? (lecturerList.size() + 1) : 1;
        System.out.println("lecturer id = " + id);
        String name = inputName();
        byte age = inputAge();
        String address = inputAddress();
        String gmail = inputGmail();
        Lecturer lecturer = new Lecturer(id, name, age, address,gmail);
        lecturerList.add(lecturer);
        lecturerDao.write(lecturerList);
    }
/*
  edit lecturer by id
**/

public void edit(int id) {
    boolean isExisted = false;
    int size = lecturerList.size();
    for (int i=0; i< size; i++) {
        if (lecturerList.get(i).getId()==id){
            isExisted = true;
            lecturerList.get(i).setName(inputName());
            lecturerList.get(i).setAge(inputAge());
            lecturerList.get(i).setAddress(inputAddress());
            lecturerList.get(i).setGpa(inputGmail());
            break;
        }
}
    if (!isExisted) {
        System.out.print("id = %d not existed. \n", id);
    } else {
        lectuereDoc.write(lectuereList);
    }
}
/*
delete lecturer by id
*/
public void delete(int id) {
    Lecturer lecturer = null;
    int size = lecturerList.size();
    for (int i = 0; i < size; i++) {
        if (lecturerList.get(i),getId() == id) {
            lecturer = lecturerList.get(i);
            break;
    }
    }
    if (lecturer != null) {
        lecturerList.remove(lecturer);
        lecturerDoc.write(lecturerList);
    }else {
        System.out.print("id = %d not existed. \n", id);
    }
}
/*
show list lecturer to screen
*/
public void show() {
    for (Lecturer lecturer : lecturerList) {
        System.out.format("%5d | ", lecturer.getId());
        System.out.format("%20s | ", lecturer.getName());
        System.out.format("%5d | ", lecturer.getAge());
        System.out.format("%20s | ", lecturer.getAddress);
        System.out.format("%20s | ", lecturer.getGmail);
    }
}
/*
input lecturer id
*/
public int inputId() {
    System.out.print("Input lecturer id: ");
    while (true) {
        try {
            int id = Integer.parseInt((scanner.nextLine()));
            return id;
        }catch (NumberFormatException ex) {
            System.out.print("invalid! Input lecturer id again: ");
        }
    }
}
private String inputName() {
        System.out.print("Input lecturer name: ");
        return scanner.nextLine();
    }
 
    /**
     * input lecturer address
    
     */
    private String inputAddress() {
        System.out.print("Input lecturer address: ");
        return scanner.nextLine();
    }
 
    /**
     * input lecturer age
    
     */
    private byte inputAge() {
        System.out.print("Input lecturer age: ");
        while (true) {
            try {
                byte age = Byte.parseByte((scanner.nextLine()));
                if (age < 0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input lecturer id again: ");
            }
        }
    }
     /**
     * input lecturer gmail
    
     */
    private String inputGmail() {
        System.out.print("Input lecturer gmail: ");
        return scanner.nextLine();
    }
    
// getter && setter
    public List<Lecturer> getLecturerList() {
        return lecturerList;
    }
 
    public void setLecturerList(List<Lecturer> lecturerList) {
        this.lecturerList = lecturerList;
    }
}