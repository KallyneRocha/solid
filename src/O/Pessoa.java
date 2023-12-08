package O;

public class Pessoa {
    private String nome;
    private CalculadoraSalario calculadoraSalario;

    public Pessoa(String nome, CalculadoraSalario calculadoraSalario) {
        this.nome = nome;
        this.calculadoraSalario = calculadoraSalario;
    }

    public double calcularSalario() {
        return calculadoraSalario.calcularSalario();
    }

    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + calcularSalario());
    }
}