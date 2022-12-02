package decorator;

public class Signal extends MensajeDecorador{
	
	public Signal (EnviarNotificacion en) {
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
	
	public void sendSignal() {
		System.out.println("Enviar signal");
	}
}
