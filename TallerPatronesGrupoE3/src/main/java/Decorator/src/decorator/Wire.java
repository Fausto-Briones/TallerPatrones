package decorator;

public class Wire extends MensajeDecorador{
	
	public Wire (EnviarNotificacion en) {
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
	
	public void sendWire() {
		System.out.println("Enviar Wire");
	}
}
