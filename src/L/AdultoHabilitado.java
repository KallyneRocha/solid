package L;
// Classe derivada AdultoHabilitado
class AdultoHabilitado extends Pessoa implements Motorista {
    AdultoHabilitado(String nome) {
        super(nome);
    }

    @Override
    public void dirigir() {
        System.out.println(nome + " está dirigindo.");
    }
}

