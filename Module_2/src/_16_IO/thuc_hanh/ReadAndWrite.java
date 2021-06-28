package _16_IO.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void main(String[] args) {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        List<Integer> myArr = readAndWrite.readFile("E:\\Slack\\number.txt");
        for (int element: myArr){
            System.out.println(element);
        }
        int index = readAndWrite.findMax(myArr);
        readAndWrite.writeFile("E:\\Slack\\result.txt", index);
    }
    public List<Integer> readFile(String filepath){
        List<Integer> myList = new ArrayList<>();
        try {
            File file = new File(filepath);
            if (!file.exists()) throw new FileNotFoundException();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                myList.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (IOException ex){
            System.out.println("Lỗi do IO");
        }catch (Exception ex){
            System.out.println("Lỗi do Exception");
        }
        return myList;
    }

    public  int findMax(List<Integer> myList){
        int indexMax = myList.get(0);
        for (byte i=1; i< myList.size(); i++){
            if (myList.get(i) > indexMax){
                indexMax = myList.get(i);
            }
        }
        return indexMax;
    }

    public void writeFile(String filepath, int max){
        try {
            FileWriter fileWriter = new FileWriter(filepath, true);
            BufferedWriter bufferedReader = new BufferedWriter(fileWriter);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
