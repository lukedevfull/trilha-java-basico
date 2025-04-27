package desafios.poo.desafio.dio.poo.iphone.model;
import java.util.Scanner;
public class IphoneModel implements MusicalPlayer{
    private String music;

    private Scanner scanner = new Scanner(System.in);

    
    @Override
    //Apesar de ter sido solicitado no TODO a implementação do método com a solicitação de um atributo declarado em codigo(music), optei por permitir que o usuário digite o nome da música, através do scanner, com isso, o método é implementado com a implementação do método abstrato.
    public void selectMusic() {
        System.out.println("Digite o nome da música: ");
        String music = scanner.nextLine();
        this.music = music;
    }
    
    @Override
    public void play() {
        System.out.println("Reproduzindo música: " + music);
    }

    @Override
    public void pause() {
        System.out.println("Música pausada");
    }

}
