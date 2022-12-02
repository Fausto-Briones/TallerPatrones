package decorator;

public class Telegram extends MensajeDecorador{
	
	public Telegram (EnviarNotificacion en) {
		super(en);
	}
	
	@Override
	public void sendSMS() {
		super.sendSMS();
		}
	
	@Override
	public void sendEmail() {
		super.sendEmail();
	}
	
	public void sendTelegram() {
		System.out.println("Enviar Telegram");
	}
}