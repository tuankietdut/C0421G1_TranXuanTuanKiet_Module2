package _11_Stack_Queue.optional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class TestEmployment {
    public static void main(String[] args) {

        ArrayList<Employment> employArray = new ArrayList<>();

        Employment employmentOne = new Employment("Trung","Female","21/12/2013");
        Employment employmentTwo = new Employment("Thu","Male","21/01/2017");
        Employment employmentThree = new Employment("Đông","Female","21/01/2015");
        Employment employmentFour = new Employment("Hạ","Male","21/01/2013");

        employArray.add(employmentOne);
        employArray.add(employmentTwo);
        employArray.add(employmentThree);
        employArray.add(employmentFour);
        System.out.println("Pre-sort");
        for (Employment element: employArray){
            System.out.println(element);
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Collections.sort(employArray,(s1,s2) -> LocalDate.parse(s1.getDateOfBirth(),formatter).compareTo(LocalDate.parse(s2.getDateOfBirth(), formatter)));

        System.out.println("After-sort");
        for (Employment element: employArray){
            System.out.println(element);
        }

        PriorityQueue<Employment> myQueue = new PriorityQueue();

       for (int i=0; i<employArray.size(); i++){
           if (employArray.get(i).getSex().equals("Male"))
           myQueue.add(employArray.get(i));
       }

        System.out.println("Output");

        for (Employment element: myQueue){
            System.out.println(element);
            }
        }

    }


