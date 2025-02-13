public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private Combustivel combustivel;

    public Carro(String marca, String modelo, int ano, Combustivel combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
        this.setAno(ano);
        this.combustivel = combustivel;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setAno(int ano) {
        if(ano < 1886) return;
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public void acelerar(double incremento) {
        if(incremento < 0) return;
        this.velocidadeAtual += incremento;
    }

    public void frear(double decremento) {
        if(decremento < 0) return;
        this.velocidadeAtual -= decremento;

        if(this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + " - Modelo: " + this.modelo + " - Ano: " + this.ano +
        " - Velocidade atual (km): " + this.velocidadeAtual + " - Combustível: " + this.combustivel;
    }

    public void exibirDetalhes() {
        System.out.println(this.toString());
    }
}
