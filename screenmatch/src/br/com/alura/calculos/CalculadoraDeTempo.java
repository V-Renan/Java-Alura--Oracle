package br.com.alura.calculos;

import br.com.alura.modelos.Titulo;

/**
 * @author Victor$
 * @date 4/10/2024$
 * Description:
 */
public class CalculadoraDeTempo {
    private int tempoTotal;
    public int getTempoTotal() {
        return tempoTotal;
    }
//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo titulo) {
        this.tempoTotal+= titulo.getDuracaoEmMinutos();
    }
}
