package academy.devdojo.maratonajava.javacore.introducao.metodos.dominio.aula54;

public class Pessoa {
    private String name;
    private int age;

    public void print() {
        System.out.printf("Nome: %s\nIdade: %s\n", name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Idade inválida, preencha os dados novamente!");
            return;
        }
        this.age = age;
    }

}
// coesão = numero de coisas que nossa classe faz.
// acoplamento = numero de informações que nosso metodo conhece.
// alta coesão = bom | quanto mais coeso nosso codigo é, menos coisas nossa classe faz.
// baixa coesão = ruim | quanto menos coeso nosso código é mais coisas nossa classe faz.
// alto acoplamento = ruim | quanto mais informações nossos metodos conhecerem, maiores as chances de erros.
// baixo acoplamento = bom | quanto menos informações nossos metodos conhecerem, menores as chances de erro.

// baixo acoplamento e alta coesão = código top!
// alto acoplamento e baixa coesão = código bosta!
