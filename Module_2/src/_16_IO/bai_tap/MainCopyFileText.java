package _16_IO.bai_tap;

public class MainCopyFileText {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        copyFileText.readFile("src\\_16_IO\\data\\number.csv");
        copyFileText.write("src\\_16_IO\\data\\result.csv");
    }
}
