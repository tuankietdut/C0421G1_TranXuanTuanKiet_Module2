package _17_IO_byte.thuc_hanh;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBinaryFile {
    public static void writeToFile(String filePath, List<Students> students){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream obj = new ObjectOutputStream(fileOutputStream);
            obj.writeObject(students);
            obj.close();
            fileOutputStream.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static List<Students> readToFile(String filePath){
        List<Students> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream obj = new ObjectInputStream(fileInputStream);
            students =(List<Students>)obj.readObject();
            obj.close();
            fileInputStream.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(1,"Xuân",15));
        students.add(new Students(2,"Hạ",15));
        students.add(new Students(3,"Thu",15));
        students.add(new Students(4,"Đông",15));
        students.add(new Students(5,"Xuân",15));
        writeToFile("src\\_17_IO_byte\\thuc_hanh\\data\\student.csv", students);

        List<Students> studentsList = readToFile("src\\_17_IO_byte\\thuc_hanh\\data\\student.csv");
        for (Students element: studentsList){
            System.out.println(element.toString());
        }
    }

}
