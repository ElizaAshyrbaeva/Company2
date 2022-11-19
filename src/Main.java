import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(2222L, "Eliza Ashyrbaeva", 18, 'F', 12000);
        Student student2 = new Student(444L, "Nuriza Muratova", 17, 'M', 12000);
        Student student3= new Student(555L, "Aiperi Ibraimov", 27, 'F', 12000);
        Student [] students={student1,student2,student3};



        Group[] groups = {new Group("Java", students, LocalDate.of(2020, 8, 7)),
                new Group("JavaScript", students, LocalDate.of(2022, 11, 19))};

        Instructor instructor = new Instructor(444L, "Aijamal Asangazieva", 24, 'F', 35000);

        Mentor mentor1 = new Mentor(666L, "Rahim Kurbanov", 22, 'M', 30000);
        Mentor mentor2= new Mentor(8888L, "Maksat Akyl", 35, 'M', 30000);
        Mentor [] mentors ={mentor1,mentor2};

        Course[] courses = {new Course("Java", groups, instructor, mentors)};

        Person [] people={student2,student2,student3,mentor1,mentor2,instructor};

        PeakSoftHouse peakSoftHouse = new PeakSoftHouse("PeakSoft","Vostok-5",courses,"Kyrgyz");
        ItAcademy itAcademy=new ItAcademy("ItAcademy","Vostok-5",courses,"Kyrgyz");

        System.out.println(Company.income(students));
        System.out.println(student1.period(groups));
        System.out.println(instructor.period(groups));
        System.out.println(mentor1.period(groups));

        mentor1.sortAge(people);

    }

}
