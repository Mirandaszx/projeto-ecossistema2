package vegetacao;

public class Vegetacao {
    String nome;
    int altura;

    public Vegetacao(String nome, int altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public void morrer() {
        System.out.println(nome + " está crescendo.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
