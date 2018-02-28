package br.com.fr.geekhunter.roboto.model;

import java.io.Serializable;

/**
 * @author Romeu Franzoia Jr
 *
 */
public class ResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer statusCode;
	private String mensagem;

	public ResponseDTO(Integer statusCode) {
		this(statusCode, "");
	}
	
	public ResponseDTO(Integer statusCode, String mensagem) {
		this.statusCode = statusCode;
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mensagem == null) ? 0 : mensagem.hashCode());
		result = prime * result + ((statusCode == null) ? 0 : statusCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseDTO other = (ResponseDTO) obj;
		if (mensagem == null) {
			if (other.getMensagem() != null)
				return false;
		} else if (!mensagem.equals(other.getMensagem()))
			return false;
		if (statusCode == null) {
			if (other.getStatusCode() != null)
				return false;
		} else if (!statusCode.equals(other.getStatusCode()))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "{\"statusCode\":" + statusCode + ", \"mensagem\":\"" + mensagem + "}";
	}

}