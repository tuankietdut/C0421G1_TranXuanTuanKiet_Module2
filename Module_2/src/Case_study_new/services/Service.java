package Case_study_new.services;

import Case_study_new.libs.CatchAgeException;
import Case_study_new.utils.ReadAndWrite;

public interface Service {
     void display();
     void add(CatchAgeException catchAgeException);
     void edit(CatchAgeException catchAgeException);
}
