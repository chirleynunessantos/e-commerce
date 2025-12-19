package br.com.ecommerce.envioMensagem;

public class NotificacaoWhats implements Notificacao {

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando notificação por Whats");
	}

}
