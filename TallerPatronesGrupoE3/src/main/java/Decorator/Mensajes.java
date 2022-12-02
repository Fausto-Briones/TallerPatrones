package decorator;

public class Mensajes implements EnviarNotificacion {

	//Se sobreescriben los metodos de la interfaz en la clase concreta
	
	@Override
	public void sendSMS() {
		System.out.println("Envia SMS");
		}
	
	@Override
	public void sendEmail() {
		System.out.println("Envia Email");
	}
}
