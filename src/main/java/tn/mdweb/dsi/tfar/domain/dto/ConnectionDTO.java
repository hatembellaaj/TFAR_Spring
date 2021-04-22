package tn.mdweb.dsi.tfar.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class ConnectionDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@NotNull
	protected String bearer_token;

	public String getBearer_token() {
		return bearer_token;
	}

	public void setBearer_token(String bearer_token) {
		this.bearer_token = bearer_token;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ConnectionDTO [bearer_token=" + bearer_token + "]";
	}
	

}
