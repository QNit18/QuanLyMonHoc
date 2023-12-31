package anony.controller.sort;

import java.util.Comparator;
import anony.model.Subject;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class SortSubjectByNumOfLessonDESC implements Comparator<Subject> {

    @Override
    public int compare(Subject o1, Subject o2) {
        return o2.getNumOfLesson() - o1.getNumOfLesson();
    }

}
