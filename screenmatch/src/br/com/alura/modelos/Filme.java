package br.com.alura.modelos;

import br.com.alura.calculos.Classficavel;

/**
 * @author Victor$
 * @date 4/7/2024$
 * Description:
 */
public class Filme extends Titulo implements Classficavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
         return (int) pegaMedia() / 2;
    }
}
