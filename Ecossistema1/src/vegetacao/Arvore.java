package Ecossistema1.vegetacao;

public class Arvore  extends Vegetacao{
    public Arvore(String nome, int altura) {
        super(nome, altura);
    }

   
    
    @Override
    public void morrer(){
        System.out.println("arvore cresce");
    }
    
}
