package br.com.alura.calculos;

import br.com.alura.modelos.Filme;

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
    public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }
}
