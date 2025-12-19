package br.com.ecommerce.envioMensagem;

public class NotificacaoEmail  implements Notificacao {

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando notificação por E-mail");		
	}

}
