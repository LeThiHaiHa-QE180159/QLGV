/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv.mvc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 */
public class lecturerDoc {
    private static final String LECTURER_FILE_NAME = "Lecturer.txt";

/*
save list lecturer to file
*/
public void write(List<Lecturer> lecturerList, String LECTURER_FILE_NAME) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(LECTURER_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(LecturerList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
/*
read list lecturer from file
*/
public List<Lecturer> read(String LECTURER_FILE_NAME, List<Lecturer> lecturerList) {
        List<Lecturer> lecturerList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(LECTURER_FILE_NAME));
            ois = new ObjectInputStream(fis);
            lecturerList = (List<Lecturer>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return lecturerList;
    }
/*
close input stream
*/
    private void closeStream(InputStream is) {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
/*
close output stream
*/
private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Lecturer {

        public Lecturer() {
        }
    }

}
