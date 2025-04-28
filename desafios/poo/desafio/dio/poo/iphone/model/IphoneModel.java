package desafios.poo.desafio.dio.poo.iphone.model;
import java.util.Scanner;
import java.util.Random;

public class IphoneModel implements MusicalPlayer, TelephoneModel, BrowserModel {
	private String music;
	private Scanner scanner = new Scanner(System.in);
	private Random randomGen = new Random();

	@Override
	public void selectMusic() {
		System.out.println("Digite o nome da música: ");
		String music = scanner.nextLine();
		this.music = music;
			//Apesar de ter sido solicitado no #todo.md a implementação do método com a solicitação de um atributo declarado em codigo(music), optei por permitir que o usuário digite o nome da música, através do scanner, com isso, o método é implementado com maior nivel de interação com o usuário e abstração.
	}
	
	@Override
	public void play() {
		System.out.println("Reproduzindo música: " + music);
	}

	@Override
	public void pause() {
				System.out.println("Música pausada");
	}

	// Métodos da interface TelephoneModel

	private int randomNumber = randomGen.nextInt(10) + 1;
	private String number;
	public void call() {
		System.out.println("Digite o número de telefone: ");
		String number = scanner.nextLine();
		this.number = number;
		System.out.println("Ligando para o número: " + number);

		//VOICEMAIL
		// public void voiceMail() {
		String mensagem = randomNumber <= 5 ? "Caindo no Correio de voz" : "Chamando o número: " + number;
		System.out.println(mensagem);
		//} #Optei por não implementar o método voiceMail, pois vi logica na sua implementação isolada, ja que um correio de voz só existe mediante a tentativa de uma ligação.
	}

	public void listen() {
		System.out.println("Recebendo chamada");
	}

	// Métodos da interface InternetBrowser
	public void showPage() {
		System.out.println("Digite a URL: ");
		String url = scanner.nextLine();
		System.out.println("Exibindo página da URL: " + url);
	}
	public void addNewTab() {
		int i;
		System.out.println("Deseja adicionar novas abas? \n1 - Sim \n2 - Não");
		i = scanner.nextInt();
		if (i == 1) {
			System.out.println("Adicionando nova aba");
		}
	}

	public void refreshPage() {
		System.out.println("Atualizando página");
	}
}
