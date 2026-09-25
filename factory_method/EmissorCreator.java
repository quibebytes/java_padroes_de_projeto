package factory_method;

public class EmissorCreator {
    public static final int SMS = 0;
    public static final int EMAIL = 1;
    public static final int WHATSAPP = 2;

    public Emissor create(int tipoDeEmissor) {
        Emissor emissor = null;
        switch (tipoDeEmissor) {
            case SMS: {
                emissor = new EmissorSMS();
            } break;
            case EMAIL: {
                emissor = new EmissorEmail();
            } break;
            case WHATSAPP: {
                emissor = new EmissorWhatsapp();
            } break;
            default: {
                throw new IllegalArgumentException("Tipo deve ser SMS, EMAIL ou WHATSAPP");
            }
        }

        return emissor;
    }
}
