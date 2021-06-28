package _16_IO.bai_tap;


import java.io.*;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

public class NationManagement  {
    private final String SRC= "src\\_16_IO\\data\\number.csv";
    private final String HEAD = "Id, Code, Name";
    private final String SEPARATE = ",";
    private final String nextLine = "\n";

    public void writerFile(Nation nation){
        File file = new File(SRC);
        checkFile(file);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fileWriter);
            String line = nation.getId() + SEPARATE + nation.getCode() + SEPARATE + nation.getName() + nextLine;
            br.write(line);
            br.flush();
            br.close();
//            fileWriter.append(String.valueOf(nation.getId()));
//            fileWriter.append(SEPARATE);
//            fileWriter.append(nation.getCode());
//            fileWriter.append(SEPARATE);
//            fileWriter.append(nation.getName());
//            fileWriter.append(nextLine);
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }

    public List<Nation> readFile(){
        List<Nation> list = new ArrayList<>();
        File file = new File(SRC);
        checkFile(file);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            int nextLoopOne = 0;
            while ((line= br.readLine())!= null){
                if (nextLoopOne == 0){
                    nextLoopOne++;
                    continue;
                }
                String[] result = line.split(SEPARATE);
                int id = Integer.parseInt(result[0]);
                String code = result[1];
                String name = result[2];
                list.add(new Nation(id, code, name));
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                fileReader.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
        return list;
    }

    public void checkFile(File file) {
        FileWriter fileWriter = null;
        if (!file.exists()){
            try {
                file.createNewFile();
                fileWriter = new FileWriter(file, true);
                BufferedWriter br = new BufferedWriter(fileWriter);
                br.write(HEAD);
                br.write(nextLine);
            }catch (Exception ex){
                ex.printStackTrace();
            }finally {
                try {
                    fileWriter.close();
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }

    }
}
