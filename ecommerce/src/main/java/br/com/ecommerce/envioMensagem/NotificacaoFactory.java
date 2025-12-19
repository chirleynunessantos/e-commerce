package br.com.ecommerce.envioMensagem;

public class NotificacaoFactory {

	public static Notificacao objectFactory(TipoNotificacao tipo) {
		if(tipo.equals(TipoNotificacao.EMAIL)) {
			return new NotificacaoEmail();
		}
		if(tipo.equals(TipoNotificacao.SMS)) {
			return new NotificacaoSMS();
		}
		if(tipo.equals(TipoNotificacao.WHTAS)) {
			return new NotificacaoWhats();
		}
		return null;
	}
}
