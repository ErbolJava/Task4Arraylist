import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
   /** Student деген класс ачыныз полелерин толтурунуз.
    Полелери аты, жашы,жынысы,акчасы,фамилиясы
    main ден класстын 10 объектин тузуп ArrayList ке салыныз
* 1 - аты А жана Б менен башталган студенттерди чыгарыныз.
            * 2 - жашы 15тен чон жана акчасы 2000 ден чон балдарды чыгарыныз.
            * 3 - эн коп акчасы бар студентти чыгарыныз.
            * 4 - эн акчасы коп кызды чыгарыныз.
* 5 - баардык студенттердин атын эле консолго чыгарыныз.
            * 6 - ар бир студеттин акчасына 1000 сомдон кошуп чыгарыныз.
* 7 - биринчи турган студентти чыгарыныз.
            * 8 - канча студент бар экен чыгарыныз(санын)
* 9 - балдарды жана кыздарды болуп группага салгыла.
    **/
    public static void main(String[] args) {
        List<Student>students = new ArrayList<>();
        students.add(new Student("Erbol","Ashirali uulu",19,Gender.MALE,2050));
        students.add(new Student("Eldan","Turgunbaev",12,Gender.MALE,1800));
        students.add(new Student("Keldibek","Omurzakov",11,Gender.MALE,2300));
        students.add(new Student("Ernazar","Tukunchuev",10,Gender.MALE,1650));
        students.add(new Student("Kairat","Otec Kairata",9,Gender.MALE,1780));
        students.add(new Student("Temirlan","Otec Temirlana",1,Gender.MALE,2600));
        students.add(new Student("Samat","Samat baikenin atasy",4,Gender.MALE,2400));
        students.add(new Student("Aizat","Duisheeva",14,Gender.FEMALE,1500));
        students.add(new Student("Oksana","Oksana ejenin atasy",4,Gender.FEMALE,1900));
        students.add(new Student("Sanjar","Sanjardyn atasy",2,Gender.MALE,2100));

        StudentsImpl studentsImpl = new StudentsImpl();
        studentsImpl.addMoney(students);
        System.out.println("Moneys are transferred\uD83D\uDC47");
        for (Student s:students) {
            System.out.print(s.getName()+" "+s.getAccount()+" ");
        }
        System.out.println();
        System.out.println("Student's names which starts with A or B ==> "+studentsImpl.findByFirstLetter(students));
        System.out.println("Student who is already 15 and with minimum 2000 money on account ==> "+studentsImpl.findByAgeAndAccount(students));
        System.out.print("Names of students ==> ");
        System.out.println(studentsImpl.printNames(students));
        System.out.println("The richest student is ==> "+studentsImpl.findRichStudent(students));
        System.out.println("First student in list ==> "+studentsImpl.firstStudent(students));
        System.out.println("Quantity of students = "+studentsImpl.quantityOfStudents(students));
        System.out.println("Rich girl = "+studentsImpl.findRichGirl(students));
        System.out.println(studentsImpl.boysGroup(students));
        System.out.println(studentsImpl.girlsGroup(students));
    }
}