package desafio27;

/**
 * @author Victor$
 * @date 4/30/2024$
 * Description:
 */
public class ErroDivisor extends Throwable {
    private String mensagem;
    public ErroDivisor(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
