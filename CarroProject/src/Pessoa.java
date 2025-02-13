public class Pessoa {
    private String nome;
    private int idade;
    private Carro carro;

    public Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public Carro getCarro() {
        return carro;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0) return;
        this.idade = idade;
    }

    public void comprarCarro(Carro carro) {
        this.carro = carro;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Carro: " + this.carro);
    }
}
