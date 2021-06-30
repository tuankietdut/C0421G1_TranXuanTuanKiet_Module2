package _16_IO.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    private List<String> myList = new ArrayList<>();
    public void readFile(String stringPath){
        try {
            FileReader fileReader = new FileReader(stringPath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                myList.add(line);
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String stringPath){
        try {
            FileWriter fileWriter = new FileWriter(stringPath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (byte i=0; i< myList.size(); i++){
                String line = myList.get(i) + "\n";
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
