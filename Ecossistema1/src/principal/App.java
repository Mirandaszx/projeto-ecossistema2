package principal;

import animals.Animal;
import animals.Gazela;
import animals.Leao;
import animals.Tigre;
import animals.Zebra;
import vegetacao.Arvore;
import vegetacao.Planta;


public class App {
    
    public static void main(String[] args )throws Exception {
        
        System.out.println("Bem vindo ao ecossistema");
       

        Leao leao = new Leao("Leão ", 10, 100, true, false, false, 20.0);
        Zebra zebra = new Zebra("Zebra ", 5, 80, false, false, true, 25.0);
        Tigre tigre = new Tigre("Tigre ", 9, 120, true, false, false, 18.0);
        Gazela gazela = new Gazela("Gazela ", 4, 70, false, false, true, 30.0);
        Arvore arvore = new Arvore("carvalho", 10);
        Planta planta= new Planta("Planta", 2);
        // resolvi criar uma especie de historia utilizando o ecossistema 
        realizarAtividadesDoDia(leao, zebra, tigre, gazela);
    }

    public static void realizarAtividadesDoDia(Animal... animais) {
        System.out.println("O dia amanhece na floresta e os animais despertam");

        for (Animal animal : animais) {
            animal.acordar();
        }

        System.out.println("Todos os animais acordam famintos e têm que ir atrás de comida");
        System.out.println("Os animais começam a procurar por comida");

        for (Animal animal : animais) {
            animal.setFaminto(true);
        }

        //  ações específicas de cada animal
        // a zebra aparecia duas vezes em vez do tigre aparecer ai fiz isso
        for (Animal animal : animais) {
            if (animal instanceof Zebra) {
                ((Zebra) animal).procurarcomida();
            } else if (animal instanceof Tigre) {
                ((Tigre) animal).procurarcomida();
            } else {
                animal.procurarcomida();
            }
        }
        

        encerrarDia(animais);
    }

    public static void encerrarDia(Animal... animais) {
        System.out.println("No fim do dia, todos os animais estão cansados e precisam dormir");

        for (Animal animal : animais) {
            animal.dormir();
        }

        
        
}
// não consegui usar a vegetação


 

}
