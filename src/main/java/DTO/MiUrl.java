package DTO;

public class MiUrl {
	
	private String inicio;
	private String cuerpo;
	private String dominio;
	private String urlcompleta;
	
	
	public MiUrl(String urlcompleta){
		this.setUrlcompleta(urlcompleta);
	}
	
	
	public MiUrl(String inicio, String cuerpo, String dominio){
		this.inicio = inicio;
		this.cuerpo = cuerpo;
		this.dominio = dominio;
	}
	
	
	
	
	public String getInicio() {
		return inicio;
	}
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}


	public String getUrlcompleta() {
		return urlcompleta;
	}


	public void setUrlcompleta(String urlcompleta) {
		this.urlcompleta = urlcompleta;
	}

}
