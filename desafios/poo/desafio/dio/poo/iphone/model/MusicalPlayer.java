package desafios.poo.desafio.dio.poo.iphone.model;
@FunctionalInterface
public interface MusicalPlayer {
    void selectMusic();
    
    // Métodos default (com implementação) não contam para a regra de método único
    default void play() {
        System.out.println("Reproduzindo música");
    }
    
    default void pause() {
        System.out.println("Música pausada");
    }
}
        // 1. **Reprodutor Musical**
    // - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
    // - Atributos: `String musica` (representando a música atual) OK

