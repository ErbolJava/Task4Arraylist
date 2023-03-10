import java.util.List;

public interface StudentInterface {
    Student findByFirstLetter (List<Student>students);
    Student findByAgeAndAccount (List<Student>students);
    Student findRichStudent(List<Student>students);
    Student findRichGirl(List<Student>students);
    List<String> printNames(List<Student>students);
    List<Integer> addMoney(List<Student>students);
    Student firstStudent(List<Student>students);
    int quantityOfStudents(List<Student>students);
    List<String> boysGroup(List<Student>students);
    List<String>girlsGroup(List<Student>students);

}
