package br.com.sprint3.estados.config.validacao;

public class ErroFormDto {
	private String campo;
	private String erro;

	public ErroFormDto(String campo, String erro) {
		this.campo = campo;
		this.erro = erro;
	}

	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return erro;
	}

}
