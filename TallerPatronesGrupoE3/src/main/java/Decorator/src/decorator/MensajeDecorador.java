package decorator;

public abstract class MensajeDecorador implements EnviarNotificacion{
	
	//Se tiene como atributo un objeto de la interfaz
	public EnviarNotificacion notificacion;
	
	public MensajeDecorador(EnviarNotificacion en) {
		this.notificacion=en;
	}
	
	//Se sobreecriben los metodos
	@Override
	public void sendSMS() {
		this.notificacion.sendSMS();
		}
	
	@Override
	public void sendEmail() {
		this.notificacion.sendEmail();
	}
	
	
}
