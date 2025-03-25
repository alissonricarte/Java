package Programacao_orientada_objeto.associacoes.Unidirecional.main.test01;

import Programacao_orientada_objeto.associacoes.Unidirecional.dominio.jogador;

public class test {
    public static void main(String[] args) {
        jogador jogador1 = new jogador("pelé");
        jogador jogador2 = new jogador("romário");
        jogador jogador3 = new jogador("Cristiano ronaldo");
        jogador[] jogadores = new jogador[]{jogador1,jogador2,jogador3};
        for(jogador jogador : jogadores){
            jogador.imprima();
        }
    }
}
