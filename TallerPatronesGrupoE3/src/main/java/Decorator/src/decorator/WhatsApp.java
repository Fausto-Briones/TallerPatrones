package decorator;

public class WhatsApp extends MensajeDecorador{
	
	public WhatsApp (EnviarNotificacion en) {
		super(en);
	}
	
	//Se sobreescriben los metodos y se añade el correspondiente a cada componente
	
	@Override
	public void sendSMS() {
		super.sendSMS();
		}
	
	@Override
	public void sendEmail() {
		super.sendEmail();
	}
	
	
	public void sendWhatsApp() {
		System.out.println("Enviar WhatsApp");
	}

}
