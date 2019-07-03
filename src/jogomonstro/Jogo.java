package jogomonstro;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Heitor Barros
 *
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programa��o
 * Orientada a Objetos.
 *
 */
public class Jogo {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Monstrinho monstrinho = new Monstrinho();
        Map<Integer, Acao> actions = new HashMap<>();
        
        actions.put(1, new Comida());
        actions.put(2, new Descansar());
        actions.put(3, new Malhacao());
        actions.put(4, new Trabalhar());
        int opcao, turno = 1;
        System.out.println("Seu Monstrinho nasceu! \nCuide dele com carinho!\nN�o deixe seus status chegarem a zero");
        //Mostra o status do seu monstrinho
        monstrinho.status();
        //executa a repeti��o do jogo enquanto seu monstrinho est� vivo
        while (monstrinho.estaVivo()) {
            //Mostra as op��es e espera o jogador digitar sua escolha
            System.out.println("\n\n### TURNO " + turno + " ###");
            System.out.println("Escolha uma ação: ");
            System.out.println("1- Comida (E+2 - F+0 - S+1 - M-1)");
            System.out.println("2- Descansar (E-1 - F+1 - S+1 - M+0)");
            System.out.println("3- Malhação (E-2 - F+2 - S+1 - M+0)");
            System.out.println("4- Trabalhar (E-2 - F-1 - S-1 - M+2)");
            opcao = teclado.nextInt();
            if(opcao > 4){
                System.out.println("Não exite essa Ação");
            }else{
                for(int i : actions.keySet()) {
                    if(opcao == i){
                        monstrinho.aplicarAcao(actions.get(i));
                    }
                }
            }
           

            //Revela o status do Monstrinho
            monstrinho.status();
            //Executa a a��o de passar turno onde o Monstrinho envelhece
            //monstrinho.passarTurno();
            //Revela o status do Monstrinho ap�s passar turno
            monstrinho.status();
            turno++;
        }

        //Os status do Monstrinho chegaram a zero
        System.out.println("Seu monstrinho Morreu...");
        System.out.println("Ele sobreviveu " + turno + " turnos");

        teclado.close();
    }

}
