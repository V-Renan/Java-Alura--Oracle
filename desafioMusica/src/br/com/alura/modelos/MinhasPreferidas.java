package br.com.alura.modelos;

/**
 * @author Victor$
 * @date 4/19/2024$
 * Description:
 */
public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto, preferencia total!");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos sucessos mais tocados!");
        }
    }
}
