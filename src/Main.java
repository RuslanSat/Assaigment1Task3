public class Main {
    public static void main(String[] args) {
        School school = new School();

        Student student1 = new Student("Ron Qeasley", 20); //78 89 75 63 82
        student1.addGrade(78);
        student1.addGrade(89);
        student1.addGrade(75);
        student1.addGrade(63);
        student1.addGrade(82);

        Student student2 = new Student("Hermione Granger", 19); //100 99 95 98 100 96 97
        student2.addGrade(100);
        student2.addGrade(99);
        student2.addGrade(95);
        student2.addGrade(98);
        student2.addGrade(100);
        student2.addGrade(96);
        student2.addGrade(97);

        Teacher teacher1 = new Teacher("Severus Snape", 51, "Math", 7, 800000);
        Teacher teacher2 = new Teacher("Sirius Black", 49, "Physics", 9, 750000);

        school.addMember(student1);
        school.addMember(student2);
        school.addMember(teacher1);
        school.addMember(teacher2);

        System.out.println(school);
    }
}