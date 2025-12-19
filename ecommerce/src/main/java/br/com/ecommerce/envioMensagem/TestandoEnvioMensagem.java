package br.com.ecommerce.envioMensagem;

public class TestandoEnvioMensagem {

	public static void main(String[] args) {
		
		Notificacao enviar = NotificacaoFactory.objectFactory(TipoNotificacao.EMAIL);
		enviar.enviarMensagem();
	}
}
