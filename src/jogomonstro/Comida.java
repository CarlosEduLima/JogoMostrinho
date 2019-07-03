package jogomonstro;

/**
 *
 * @author Heitor Barros
 *
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programa��o
 * Orientada a Objetos.
 *
 */
public class Comida extends Acao {

    public Comida() {
       
            System.out.println("1 - Comida (E +2 / F +0 / S +1 / M -2)");
            this.energia = 2;
            this.forca = 0;
            this.saude = 1;
            this.moedas = -2;
        

        }

    }


