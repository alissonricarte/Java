package Programacao_orientada_objeto.associacoes.main.test02;

import Programacao_orientada_objeto.associacoes.dominio.Time;
import Programacao_orientada_objeto.associacoes.dominio.jogador;

public class test {
    public static void main(String[] args) {
        jogador jogador1 = new jogador("CR7");
        Time time =  new Time("Real madri");
        jogador1.setTime(time);
        jogador1.imprima();
    }
}
