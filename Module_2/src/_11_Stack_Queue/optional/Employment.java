package _11_Stack_Queue.optional;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employment implements Comparable<Employment> {
    private String name;
    private String sex;
    private String dateOfBirth;
//    public DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Employment() {
    }

    public Employment(String name, String sex, String dayOfBirth) {
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dayOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public int compareTo(Employment o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Employment{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
