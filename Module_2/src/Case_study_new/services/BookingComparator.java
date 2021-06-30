package Case_study_new.services;

import Case_study_new.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if ((LocalDate.parse(o1.getStartDate(), formatter)).compareTo((LocalDate.parse(o2.getStartDate(), formatter))) > 0) {
            return 1;
        }else if ((LocalDate.parse(o1.getStartDate(), formatter)).compareTo((LocalDate.parse(o2.getStartDate(), formatter))) < 1){
            return -1;
        }else {
            return 1;
        }
    }
}

