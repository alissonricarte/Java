package Programacao_orientada_objeto.associacoes.Bigdirecional.main;

import Programacao_orientada_objeto.associacoes.Bigdirecional.dominio.Jogador;
import Programacao_orientada_objeto.associacoes.Bigdirecional.dominio.Time;

public class test {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("cafu");
        Jogador jogador1 = new Jogador("pelé");
        Time time = new Time("Brasil");
        Jogador [] jogadores = {jogador,jogador1};

        jogador.setTime(time);
        jogador1.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--Joagadores--");
        jogador.imprima();
        System.out.println("---Time--");
        time.imprima();
    }
}
