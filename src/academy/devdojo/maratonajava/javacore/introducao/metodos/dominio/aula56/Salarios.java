package academy.devdojo.maratonajava.javacore.introducao.metodos.dominio.aula56;

import java.text.NumberFormat;
import java.util.Locale;

public class Salarios {
    private double[] salarios;
    private double media = 0;
    private String mediaFormatada;

    public void setSalarios(double salario1, double salario2, double salario3) {
        this.salarios = new double[]{salario1, salario2, salario3};
    }

    private void mediaSalarios() {
        for (double salario : this.salarios) {
            media += salario;
        }
        media /= this.salarios.length;
        this.mediaFormatada = NumberFormat.getCurrencyInstance(new Locale("pt-BR", "BR")).format(media);
    }

    public void imprimeMediaFormatada() {
        this.mediaSalarios();
        System.out.println("Média sálarial: \t" + this.mediaFormatada);
    }


}
