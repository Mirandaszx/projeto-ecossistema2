package animals;

public class Leao extends Animal {
    public Leao(String nome, int forca, int vida, boolean carnivoro, boolean faminto, boolean herbivoro,double Velocidade) {
        super("Leao", forca, vida, carnivoro, faminto,herbivoro,Velocidade);
    }

// metodos leao sobreposicao
@Override
    public void procurarcomida() {
        System.out.println("O Leão caça uma presa.");
       
    }


    
}
    
      




