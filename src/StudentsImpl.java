import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsImpl implements StudentInterface {
    List<Student> students = new ArrayList<>();

    @Override
    public Student findByFirstLetter(List<Student> students) {
        for (Student s : students) {
            if (s.getName().toUpperCase().startsWith("A") || s.getName().toUpperCase().startsWith("B")) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Student findByAgeAndAccount(List<Student> students) {
        for (Student s : students) {
            if (s.getAge() > 15 && s.getAccount() > 2000) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Student findRichStudent(List<Student> students) {
        int j = students.get(0).getAccount();
        for (int i = 1; i <= students.size() - 1; i++) {
            if (j < students.get(i).getAccount()) {
                j = students.get(i).getAccount();
            }
        }
        for (Student s : students) {
            if (j == s.getAccount()) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Student findRichGirl(List<Student> students) {
        List<Student> richGirl = new ArrayList<>();
        for (Student s : students) {
            if (s.getGender() == Gender.FEMALE) {
                richGirl.add(s);
            }
            int j = 0;
            for (int i = 1; i <= richGirl.size()-1; i++) {
                if (j<richGirl.get(i).getAccount()){
                    j = richGirl.get(i).getAccount();
                }
            }
            for (Student ss: richGirl) {
                if (j == ss.getAccount()){
                    return ss;
                }
            }
        }
        return null;
    }

    @Override
    public List<String> printNames(List<Student> students) {
        List<String> allNames = new ArrayList<>();
        for (Student s : students) {
            allNames.add(s.getName());
        }
        return allNames;
    }

    @Override
    public List<Integer> addMoney(List<Student> students) {
        List<Integer> getMoney = new ArrayList<>();
        for (Student s : students) {
            s.setAccount(s.getAccount() + 1000);
            getMoney.add(s.getAccount());
        }
        return getMoney;
    }

    @Override
    public Student firstStudent(List<Student> students) {
        return students.get(0);
    }

    @Override
    public int quantityOfStudents(List<Student> students) {
        return students.size();
    }

    @Override
    public List<String> boysGroup(List<Student> students) {
        List<String>boys = new ArrayList<>();
        List<String>girls = new ArrayList<>();
        for (Student s:students) {
            if (s.getGender()==Gender.MALE){
                boys.add(s.getName());
            }
        }
        return Collections.singletonList("Boys ==> "+boys);
    }

    @Override
    public List<String> girlsGroup(List<Student> students) {
        List<String>girls = new ArrayList<>();
        for (Student s:students) {
            if (s.getGender()==Gender.FEMALE){
                girls.add(s.getName());
            }
        }
        return Collections.singletonList("Girls ==> " + girls);
    }
}
