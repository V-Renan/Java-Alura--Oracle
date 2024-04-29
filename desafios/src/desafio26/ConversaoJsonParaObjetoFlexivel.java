package desafio26;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Victor$
 * @date 4/29/2024$
 * Description:
 */
public class ConversaoJsonParaObjetoFlexivel {

    record Pessoa(String nome, int idade, String cidade) {}

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
