package com.screenmatch;

import com.screenmatch.modelos.Filme;

public class Main {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("super choque");
        meuFilme.setAnoDeLacamento(2026);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(10);



        meuFilme.exibeFichaTecnica();

    }

}