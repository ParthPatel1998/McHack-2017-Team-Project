package team.mchack.duno;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Created by JT-MAC on 2017-01-28. */


public class subjects {
    // implement a data structure using java set
    Set subjectSet= new HashSet();

    public subjects(){
        // empty contructor
    }

    // add a String to the
    public void addSubject(String subjects){
        subjectSet.add(subjects);
    }
    // check if the set is empty.
    public boolean isEmpty(){
        return subjectSet.isEmpty();
    }
    // to check if the a user entered subject has been defined
    public boolean checkSubject(String subject){
        return subjectSet.contains(subject);
    }
    // to search and return the indicator of the
    public int searchSubject(String subject) {
        Iterator<String> iterator = subjectSet.iterator();
        while (iterator.hasNext()) {
            String returnedSubject = iterator.next();
            if (returnedSubject.equals(subject)) {

            }
        }
        return 6;
    }

    public void removeSubject(String subject){
        subjectSet.remove(subject);
    }

}
