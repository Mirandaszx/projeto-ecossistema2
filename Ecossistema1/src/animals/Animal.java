package animals;

public class Animal{
    //atributos
    private String nome;
    private int forca;
    private int vida;
    private boolean carnivoro;
   private boolean faminto;
    private boolean herbivoro;
    private double Velocidade;

    public Animal(String nome, int forca, int vida, boolean carnivoro, boolean faminto,boolean herbivoro,double Velocidade) {
        this.nome = nome;
        this.forca = forca;
        this.vida = vida;
        this.carnivoro = carnivoro;
        this.faminto = faminto;
        this.herbivoro = herbivoro;
        this.Velocidade = Velocidade;

        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }

    public boolean isFaminto() {
        return faminto;
    }

    public void setFaminto(boolean faminto) {
        this.faminto = faminto;
    }

    public boolean isHerbivoro() {
        return herbivoro;
    }

    public void setHerbivoro(boolean herbivoro) {
        this.herbivoro = herbivoro;
    }

    public double getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(double velocidade) {
        Velocidade = velocidade;
    }
    // Metodos em comuns dos animais
  
    public void procurarcomida(){
        
            if (faminto) {
                System.out.println("Comida encontrada e comida!");
                faminto = false;
            } else {
                System.out.println("o animal, não precisa de comida.");
            }
        }

    
    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Força: " + forca);
        System.out.println("Vida: " + vida);
        System.out.println("Carnívoro: " + carnivoro);
        System.out.println("Faminto: " + faminto);
        System.out.println("Herbívoro: " + herbivoro);
        System.out.println("Velocidade: " + Velocidade);
    }
    public void  dormir (){
        System.out.println("o animal está cansado e acaba dormindo");

    }
    public void  acordar (){
        System.out.println(this.getNome() + " acordou ");
   
    }
   
}