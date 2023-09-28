package academy.devdojo.maratonajava.javacore.introducao.classes.domain.aula39;

public class StudantApplication {

    public static void main(String[] args) {
        Studant studant = new Studant();

        studant.name = "Monkey D. Luffy";
        studant.age = 18;
        studant.sex = 'M';

        String message =
                "Name: " + studant.name + "\n" +
                        "Age: " + studant.age + "\n" +
                        "Sex: " + studant.sex + '\n';
        System.out.println(message);
    }
}
