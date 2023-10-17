package animals;

public class Zebra extends Animal {
    public Zebra(String nome, int forca, int vida, boolean carnivoro, boolean faminto,boolean herbivoro,double Velocidade) {
        super(nome,forca,vida,carnivoro,faminto,herbivoro,Velocidade);
    }
      
        @Override
    public void procurarcomida() {
        System.out.println("A Zebra pasta na grama.");
       
    }
        
}

