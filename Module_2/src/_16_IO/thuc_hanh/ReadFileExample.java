package _16_IO.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn để đọc dữ liệu ra");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample myFile = new ReadFileExample();
        myFile.readFile(path);
    }

    public void readFile(String file){
        try {
            File file1 = new File(file);
            if (!file1.exists()) throw new FileNotFoundException();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng là: " + sum);

        }catch (Exception ex){
            System.out.println("Có fault");
        }

        }
    }

