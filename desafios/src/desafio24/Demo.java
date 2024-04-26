package desafio24;

import java.util.Collections;

/**
 * @author Victor$
 * @date 4/26/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Titulo titulo = new Titulo();
        titulo.adicionarTitulo("Moonfal");
        titulo.adicionarTitulo("Assassinos da Lua das Flores");
        titulo.adicionarTitulo("Batem à Porta");

        titulo.exbirLista();
        titulo.exibirListaOrdenada();
    }
}
