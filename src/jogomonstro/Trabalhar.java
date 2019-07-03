/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomonstro;

/**
 *
 * @author Allan
 */
public class Trabalhar extends Acao {

    public Trabalhar() {

        System.out.println("Hora de Trabalhar");
        this.energia = -2;
        this.forca = -1;
        this.saude = -1;
        this.moedas = +2;
    }

}
