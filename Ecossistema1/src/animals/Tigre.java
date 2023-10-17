package animals;

public class Tigre extends Animal {
    public Tigre(String nome, int forca, int vida, boolean carnivoro, boolean faminto,boolean herbivoro,double Velocidade) {
        super("Tigre", forca, vida, carnivoro, faminto,herbivoro,Velocidade);
        
       }
       @Override
    public void procurarcomida() {
        System.out.println("O Tigre caça uma presa na selva.");
        
    }
}

