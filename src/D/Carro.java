package D;

// Classe de alto nível
class Carro {
    private Motor motor;

    // Injeção de dependência através do construtor
    public Carro(Motor motor) {
        this.motor = motor;
    }

    public void ligarCarro() {
        motor.ligar();
        System.out.println("Carro ligado");
    }
}