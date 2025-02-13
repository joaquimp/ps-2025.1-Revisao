public class App2 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 25);
        Carro carro1 = new Carro("Honda", "Civic", 2019, Combustivel.GASOLINA);
        pessoa1.comprarCarro(carro1);
        pessoa1.exibirDados();
    }
}
