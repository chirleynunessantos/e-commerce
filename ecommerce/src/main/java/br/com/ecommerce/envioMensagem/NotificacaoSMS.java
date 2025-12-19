package br.com.ecommerce.envioMensagem;

public class NotificacaoSMS implements Notificacao{

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando notificação por SMS");		
	}

}
