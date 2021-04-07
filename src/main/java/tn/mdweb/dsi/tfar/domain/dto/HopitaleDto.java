package tn.mdweb.dsi.tfar.domain.dto;


public class HopitaleDto {
	
	
	
	private Long Code_hopitale;
	
	private String Nom_Hopitale;

	public HopitaleDto() {
	}

	public HopitaleDto(String nom_Hopitale) {
		Nom_Hopitale = nom_Hopitale;
	}

	public HopitaleDto(Long code_hopitale, String nom_Hopitale) {
		Code_hopitale = code_hopitale;
		Nom_Hopitale = nom_Hopitale;
	}

	public Long getCode_hopitale() {
		return Code_hopitale;
	}

	public void setCode_hopitale(Long code_hopitale) {
		Code_hopitale = code_hopitale;
	}

	public String getNom_Hopitale() {
		return Nom_Hopitale;
	}

	public void setNom_Hopitale(String nom_Hopitale) {
		Nom_Hopitale = nom_Hopitale;
	}

	@Override
	public String toString() {
		return "HopitaleDto [Code_hopitale=" + Code_hopitale + ", Nom_Hopitale=" + Nom_Hopitale + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Code_hopitale == null) ? 0 : Code_hopitale.hashCode());
		result = prime * result + ((Nom_Hopitale == null) ? 0 : Nom_Hopitale.hashCode());
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
		HopitaleDto other = (HopitaleDto) obj;
		if (Code_hopitale == null) {
			if (other.Code_hopitale != null)
				return false;
		} else if (!Code_hopitale.equals(other.Code_hopitale))
			return false;
		if (Nom_Hopitale == null) {
			if (other.Nom_Hopitale != null)
				return false;
		} else if (!Nom_Hopitale.equals(other.Nom_Hopitale))
			return false;
		return true;
	}
	
	

}
