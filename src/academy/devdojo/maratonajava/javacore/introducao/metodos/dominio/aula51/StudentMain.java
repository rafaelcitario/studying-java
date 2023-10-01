package academy.devdojo.maratonajava.javacore.introducao.metodos.dominio.aula51;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.nome = "Rafael";
        student.idade = 27;
        student.sexo = 'M';


        student.imprime();
    }
}
