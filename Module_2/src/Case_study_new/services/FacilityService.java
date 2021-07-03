package Case_study_new.services;

import java.util.List;
import java.util.Map;

public interface FacilityService<T> extends Service {
    void displayFacMaintain();
    Map<T,Integer> getList();
}
