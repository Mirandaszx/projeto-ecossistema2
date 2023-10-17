package animals;

public class Gazela extends Animal{
    public Gazela(String nome, int forca, int vida, boolean carnivoro, boolean faminto,boolean herbivoro,double Velocidade) {
        super(nome, forca, vida, carnivoro, faminto,herbivoro,Velocidade);
    }
    @Override
    public void procurarcomida() {
        System.out.println("A Gazela pasta na savana.");
        // Implemente a lógica específica da gazela para procurar comida aqui
    }
       
}

