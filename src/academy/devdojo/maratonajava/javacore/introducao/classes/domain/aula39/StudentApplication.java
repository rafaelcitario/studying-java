package academy.devdojo.maratonajava.javacore.introducao.classes.domain.aula39;

public class StudentApplication {

    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Monkey D. Luffy";
        student.age = 18;
        student.sex = 'M';

        String message =
                "Name: " + student.name + "\n" +
                        "Age: " + student.age + "\n" +
                        "Sex: " + student.sex + '\n';
        System.out.println(message);
    }
}
