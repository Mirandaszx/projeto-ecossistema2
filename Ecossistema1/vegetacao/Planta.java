package Ecossistema1.vegetacao;

public class Planta extends Vegetacao {
    

    public Planta(String nome, int altura) {
        super(nome, altura);
        
    }
        

    @Override
    public void morrer(){
        System.out.println("a planta cresce");
    }
}
    

