package br.com.alura.calculos;

/**
 * @author Victor$
 * @date 4/16/2024$
 * Description:
 */
public class FiltroRecomendacao {
    private String recomendacao;
    public void filtra(Classficavel classficavel) {
        if (classficavel.getClassificacao() >= 4) {
            System.out.println("\nEsta entre os preferidos do momento!");
        } else if (classficavel.getClassificacao() >= 2) {
            System.out.println("\nMuito bem avaliado no momento!");
        } else {
            System.out.println("\nColoque na sua lista para assistir depois.");
        }
    }
}
