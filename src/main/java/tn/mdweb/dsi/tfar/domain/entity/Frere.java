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
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tn.mdweb.dsi.tfar.enumeration.Atteint;
import tn.mdweb.dsi.tfar.enumeration.PlaceFraterie;
import tn.mdweb.dsi.tfar.enumeration.Sexe;
import tn.mdweb.dsi.tfar.enumeration.Decedes;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode()
@ToString()
@Entity
@Table(name = "frere")
public class Frere {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "frere_id")
	private Long frereId;

	@Column(name = "nom", length = 50)
	private String nom;

	@Column(name = "prenom", length = 50)
	private String prenom;

	@Column(name = "atteint", length = 5)
	@Enumerated(EnumType.STRING)
	private Atteint atteint;

	@Column(name = "place_fratrie", length = 12)
	@Enumerated(EnumType.STRING)
	private PlaceFraterie placeFratrie;

	@Column(name = "sexe", length = 4)
	@Enumerated(EnumType.STRING)
	private Sexe sexe;

	@Column(name = "decedes", length = 5)
	@Enumerated(EnumType.STRING)
	private Decedes decedes;

	@Column(name = "age")
	private Long age;

	@ManyToOne(optional = false)
	@JoinColumn(name = "n_dossier_fiche", referencedColumnName = "n_dossier_fiche")
	private Fiche fiche;

}
