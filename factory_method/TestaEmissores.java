package factory_method;

public class TestaEmissores {
    public static void main(String[] args) {
        EmissorCreator criador = new EmissorCreator();

        Emissor emissor_sms = criador.create(EmissorCreator.SMS);
        Emissor emissor_email = criador.create(EmissorCreator.EMAIL);
        Emissor emissor_whatsapp = criador.create(EmissorCreator.WHATSAPP);

        emissor_sms.envia("Ola");
        emissor_email.envia("Bom dia");
        emissor_whatsapp.envia("Como vai vc?");
    }
}
