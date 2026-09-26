package decorator;
public abstract class EmissorDecorator implements Emissor {
    private Emissor emissor;

    public EmissorDecorator(Emissor emissor) {
        this.emissor = emissor;
    }

    public Emissor getEmissor() {
        return this.emissor;
    }

    public abstract void envia(String mensagem);
}