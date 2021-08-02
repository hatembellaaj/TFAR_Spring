package tn.mdweb.dsi.tfar.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tn.mdweb.dsi.tfar.enumeration.Mois;
import tn.mdweb.dsi.tfar.enumeration.Reponse;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode()
@ToString()
@Entity
@Table(name = "androgene")
public class Androgene {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@NotNull
	@Column(name = "mois", length = 15)
	@Enumerated(EnumType.STRING)
	private Mois mois;

	@Column(name = "reponse")
	@Enumerated(EnumType.STRING)
	private Reponse reponse;

	@ManyToOne(optional = false)
	@JoinColumn(name = "id_fiche", referencedColumnName = "id_fiche")
	private Fiche fiche;

	public Androgene(@NotNull Mois mois, Reponse reponse, Fiche fiche) {
		this.mois = mois;
		this.reponse = reponse;
		this.fiche = fiche;
	}
	
	

}
