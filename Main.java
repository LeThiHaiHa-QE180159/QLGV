/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlgv.mvc;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        lecturerManager lecturerManager = new lecturerManager();
        int lecturerId;
        // TODO code application logic here
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1":
                lecturerManager.add();
                break;
            case "2":
                lecturerId = lecturerManager.inputId();
                lecturerManager.edit(lecturerId);
                break;
            case "3":
                lecturerId = lecturerManager.inputId();
                lecturerManager.delete(lecturerId);
                break;
            case "4":
                lecturerManager.show();
                break;
            case "0":
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }
    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add lecturer.");
        System.out.println("2. Edit lecturer by id.");
        System.out.println("3. Delete lecturer by id.");
        System.out.println("4. Show lecturer.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
