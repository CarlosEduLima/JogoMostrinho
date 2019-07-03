package jogomonstro;
/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programa��o Orientada a Objetos.
 *
 */
public class Descansar extends Acao{
	
	public Descansar() {
		System.out.println("Hora do soninho!");
		this.saude = 1;
		this.forca = 1;
		this.energia = -1;
                this.moedas = 0;
	}
	

}
