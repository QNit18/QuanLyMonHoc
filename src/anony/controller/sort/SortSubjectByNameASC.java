package anony.controller.sort;

import java.util.Comparator;
import anony.model.Subject;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class SortSubjectByNameASC implements Comparator<Subject> {

    @Override
    public int compare(Subject o1, Subject o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
