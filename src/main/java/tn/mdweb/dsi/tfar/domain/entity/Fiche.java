package tn.mdweb.dsi.tfar.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
import tn.mdweb.dsi.tfar.enumeration.Enum1;
import tn.mdweb.dsi.tfar.enumeration.Enum10;
import tn.mdweb.dsi.tfar.enumeration.Enum11;
import tn.mdweb.dsi.tfar.enumeration.Enum2;
import tn.mdweb.dsi.tfar.enumeration.Enum3;
import tn.mdweb.dsi.tfar.enumeration.Enum4;
import tn.mdweb.dsi.tfar.enumeration.Enum5;
import tn.mdweb.dsi.tfar.enumeration.Enum6;
import tn.mdweb.dsi.tfar.enumeration.Enum7;
import tn.mdweb.dsi.tfar.enumeration.Enum8;
import tn.mdweb.dsi.tfar.enumeration.Enum9;
import tn.mdweb.dsi.tfar.enumeration.Score;
import tn.mdweb.dsi.tfar.enumeration.Statut;
import tn.mdweb.dsi.tfar.enumeration.Toxicite;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode()
@ToString()
@Entity
@Table(name = "fiche")
public class Fiche {

	@Id
	@Column(name = "n_dossier_fiche", length = 10)
	private String nDossierFiche;

	@Column(name = "date_diagnostique")
	private Date dateDiagnostique;

	@Column(name = "date_enregistrement")
	private Date dateEnregistrement;

	@Column(name = "deg_Consang", length = 50)
	private String degConsang;

	@Column(name = "place_enfant")
	private Long placeEnfant;

	@Column(name = "nb_vivant")
	private Long nbVivant;

	@Column(name = "nb_mort")
	private Long nbMort;

	@Column(name = "mort_ne")
	private Long mortNe;

	@Column(name = "avortement")
	private Long avortement;

	@Column(name = "nb_cousin")
	private Long nbCousin;

	@Column(name = "nb_membre")
	private Long nbMembre;

	@Column(name = "arbre_genealogique", length = 100)
	private String arbreGenealogique;

	@Column(name = "arbre_genealogique_cancer", length = 100)
	private String arbreGenealogiqueCancer;

	@Column(name = "syndrome_anemique", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 syndromeAnemique;

	@Column(name = "syndrome_hem", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 syndromeHem;

	@Column(name = "syndrome_inf", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 syndromeInf;

	@Column(name = "decouverte_fort", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 decouverteFort;

	@Column(name = "enquete_fam", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 enqueteFam;

	@Column(name = "type_cancer", length = 30)
	private String typeCancer;

	@Column(name = "cancer", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 cancer;

	@Column(name = "taille_naiss")
	private Double tailleNaiss;

	@Column(name = "poids_naiss")
	private Double poidsNaiss;

	@Column(name = "hypotrophie", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 hypotrophie;

	@Column(name = "trouble_croi", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 troubleCroi;

	@Column(name = "a_age_ch_diag")
	private Long aAgeChDiag;

	@Column(name = "m_age_ch_diag")
	private Long mAgeChDiag;

	@Column(name = "a_age_oss_diag")
	private Long aAgeOssDiag;

	@Column(name = "m_age_oss_diag")
	private Long mAgeOssDiag;

	@Column(name = "age_retard")
	private Long ageRetard;

	@Column(name = "poids")
	private Double poids;

	@Column(name = "poids_ds", length = 20)
	private String poidsDS;

	@Column(name = "taille")
	private Double taille;

	@Column(name = "taille_ds", length = 20)
	private String tailleDS;

	@Column(name = "atteinte_cut", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 atteinteCut;

	@Column(name = "tache_caf", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 tacheCaf;

	@Column(name = "ventre", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 ventre;

	@Column(name = "membre_sup", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 membreSup;

	@Column(name = "membre_inf", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 membreInf;

	@Column(name = "visage", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 visage;

	@Column(name = "thorax", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 thorax;

	@Column(name = "dos", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 dos;

	@Column(name = "hyper_pig", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 hyperPig;

	@Column(name = "hypochromique", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 hypochromique;

	@Column(name = "couleur_peau", length = 10)
	private String couleurPeau;

	@Column(name = "autre_at_cut", length = 50)
	private String autreAtCut;

	@Column(name = "atteinte_tete", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 atteinteTete;

	@Column(name = "microcephalie", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 microcephalie;

	@Column(name = "microphtalmie", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 microphtalmie;

	@Column(name = "facie_trig", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 facieTrig;

	@Column(name = "traits_fin", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 traitsFin;

	@Column(name = "autre_at_tete", length = 100)
	private String autreAtTete;

	@Column(name = "empreinte_digitiforme", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 empreinteDigitiforme;

	@Column(name = "mal_uro", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 malUro;

	@Column(name = "uiv", length = 10)
	@Enumerated(EnumType.STRING)
	private Enum2 uiv;

	@Column(name = "echo", length = 10)
	@Enumerated(EnumType.STRING)
	private Enum2 echo;

	@Column(name = "rein_ectop", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 reinEctop;

	@Column(name = "siege_ectopie", length = 30)
	private String siegeEctopie;

	@Column(name = "rein_fer_chev", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 reinFerChev;

	@Column(name = "petit_rein", length = 15)
	private String petitRein;

	@Column(name = "rein_unique", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 reinUnique;

	@Column(name = "ectop_test", length = 10)
	private String ectopTest;

	@Column(name = "verge_insuf", length = 30)
	private String vergeInsuf;

	@Column(name = "autre_anom_verge", length = 30)
	private String autreAnomVerge;

	@Column(name = "retard_pubertaire", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 retardPubertaire;

	@Column(name = "m_tanner", length = 10)
	private String mTanner;

	@Column(name = "p_tanner", length = 10)
	private String pTanner;

	@Column(name = "t_tanner", length = 10)
	private String tTanner;

	@Column(name = "anom_urin", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 anomUrin;

	@Column(name = "type_anom_urin", length = 100)
	private String typeAnomUrin;

	@Column(name = "atteinte_oss", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 atteinteOss;

	@Column(name = "radios_faites", length = 50)
	private String radiosFaites;

	@Column(name = "anom_pouce", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 anomPouce;

	@Column(name = "surnumerarie", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 surnumerarie;

	@Column(name = "agenesie_pouce", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 agenesiePouce;

	@Column(name = "bifide", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 bifide;

	@Column(name = "hypoPouce", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 hypoPouce;

	@Column(name = "aspectPouce", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 aspectPouce;

	@Column(name = "hypo_eminence", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 hypoEminence;

	@Column(name = "absence_radial", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 absenceRadial;

	@Column(name = "pouce_bas", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 pouceBas;

	@Column(name = "autre_anom_pouce", length = 50)
	private String autreAnomPouce;

	@Column(name = "anom_aut_doigts", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 anomAutDoigts;

	@Column(name = "courts_trapus", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 courtsTrapus;

	@Column(name = "syndactylie", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 syndactylie;

	@Column(name = "autre_anom_doigts", length = 50)
	private String autreAnomDoigts;

	@Column(name = "anomalie_os", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 anomalieOs;

	@Column(name = "agenesie_radius", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 agenesieRadius;

	@Column(name = "autre_anomalie_membre_sup", length = 50)
	private String autreAnomalieMembreSup;

	@Column(name = "anom_orteil", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 anomOrteil;

	@Column(name = "precise_anom_ort", length = 50)
	private String preciseAnomOrt;

	@Column(name = "lch", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 lch;

	@Column(name = "autre_anomalie_membre_inf", length = 50)
	private String autreAnomalieMembreInf;

	@Column(name = "anom_rachis", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 anomRachis;

	@Column(name = "precise_anom_rac", length = 50)
	private String preciseAnomRac;

	@Column(name = "autre_anom_oss", length = 50)
	private String autreAnomOss;

	@Column(name = "anom_neuro", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 anomNeuro;

	@Column(name = "retard_ment", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 retardMent;

	@Column(name = "hypoacousie", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 hypoacousie;

	@Column(name = "strabisme", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 strabisme;

	@Column(name = "performance_scolaire", length = 13)
	@Enumerated(EnumType.STRING)
	private Enum3 performanceScolaire;

	@Column(name = "autre_anomalie_neurologique", length = 50)
	private String autreAnomalieNeurologique;

	@Column(name = "anom_card_vas", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 anomCardVas;

	@Column(name = "echo_coeur", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 echoCoeur;

	@Column(name = "precise_anom_cardio", length = 100)
	private String preciseAnomCardio;

	@Column(name = "anom_dig", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 anomDig;

	@Column(name = "precise_anom_dig", length = 50)
	private String preciseAnomDig;

	@Column(name = "endocrinopathie", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 endocrinopathie;

	@Column(name = "diabete", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 diabete;

	@Column(name = "insulino_dep", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 insulinoDep;

	@Column(name = "hypothyroidie", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 hypothyroidie;

	@Column(name = "age_decouverte")
	private Long ageDecouverte;

	@Column(name = "autre_endocrinopathie", length = 50)
	private String autreEndocrinopathie;

	@Column(name = "autre_anom_cong", length = 50)
	private String autreAnomCong;

	@Column(name = "date_num_sanguine")
	private Date dateNumSanguine;

	@Column(name = "age")
	private Long age;

	@Column(name = "hb")
	private Double hb;

	@Column(name = "vgm")
	private Double vgm;

	@Column(name = "retic")
	private Double retic;

	@Column(name = "Leuco")
	private Double leuco;

	@Column(name = "pnn")
	private Double pnn;

	@Column(name = "plq")
	private Double plq;

	@Column(name = "hb_inf", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 hbInf;

	@Column(name = "plq_inf", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 plq_inf;

	@Column(name = "pnn_inf", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 pnnInf;

	@Column(name = "electrophorese_hb", length = 10)
	@Enumerated(EnumType.STRING)
	private Enum2 electrophoreseHb;

	@Column(name = "hbf")
	private Double hbf;

	@Column(name = "myelogramme", length = 10)
	@Enumerated(EnumType.STRING)
	private Enum2 myelogramme;

	@Column(name = "cellularite", length = 10)
	@Enumerated(EnumType.STRING)
	private Enum4 cellularite;

	@Column(name = "erythroblaste")
	private Double erythroblaste;

	@Column(name = "morphologie_eryth", length = 11)
	@Enumerated(EnumType.STRING)
	private Enum5 morphologieEryth;

	@Column(name = "morphologie_gran", length = 11)
	@Enumerated(EnumType.STRING)
	private Enum5 morphologieGran;

	@Column(name = "morphologie_mega")
	@Enumerated(EnumType.STRING)
	private Enum5 morphologieMega;

	@Column(name = "granuleux")
	private Double granuleux;

	@Column(name = "dysmyelopoiese", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 dysmyelopoiese;

	@Column(name = "megacaryocytes", length = 10)
	@Enumerated(EnumType.STRING)
	private Enum4 megacaryocytes;

	@Column(name = "blaste")
	private Double blaste;

	@Column(name = "exces_blastes", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 excesBlastes;

	@Column(name = "bom", length = 12)
	@Enumerated(EnumType.STRING)
	private Enum6 bom;

	@Column(name = "adipocytes")
	private Double adipocytes;

	@Column(name = "ubiquitination", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 ubiquitination;

	@Column(name = "res_ubiquitination", length = 9)
	@Enumerated(EnumType.STRING)
	private Enum7 resUbiquitination;

	@Column(name = "group_comp", length = 50)
	private String groupComp;

	@Column(name = "mutation_FANC", length = 50)
	private String mutationFANC;

	@Column(name = "congelation_cellule", length = 10)
	@Enumerated(EnumType.STRING)
	private Enum2 congelationCellule;

	@Column(name = "labo", length = 30)
	private String labo;

	@Column(name = "type_prelevement", length = 30)
	private String typePrelevement;

	@Column(name = "score_clinique")
	private Long scoreClinique;

	@Column(name = "score_EBMT")
	private Long scoreEBMT;

	@Column(name = "score", length = 10)
	@Enumerated(EnumType.STRING)
	private Score score;

	@Column(name = "transfusion", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 transfusion;

	@Column(name = "age_transf")
	private Long ageTransf;

	@Column(name = "delai_diag")
	private Double delaiDiag;

	@Column(name = "NbCG", length = 15)
	@Enumerated(EnumType.STRING)
	private Enum8 nbCG;

	@Column(name = "nbCP", length = 15)
	@Enumerated(EnumType.STRING)
	private Enum8 nbCP;

	@Column(name = "chelation_fer", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 chelationFer;

	@Column(name = "chelateur", length = 30)
	private String chelateur;

	@Column(name = "nilevar", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 nilevar;

	@Column(name = "danatrol", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 danatrol;

	@Column(name = "oxynethadone", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 oxynethadone;

	@Column(name = "androtordyl", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 androtordyl;

	@Column(name = "autre_androgene", length = 50)
	private String autreAndrogene;

	@Column(name = "andro_debut")
	private Date androDebut;

	@Column(name = "andro_fin")
	private Date androFin;

	@Column(name = "observance", length = 30)
	private String observance;

	@Column(name = "Toxicite", length = 14)
	@Enumerated(EnumType.STRING)
	private Toxicite toxicite;

	@Column(name = "autre_toxicite", length = 50)
	private String autreToxicite;

	@Column(name = "enquete_HLA", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 enqueteHLA;

	@Column(name = "pourquoi_enq_HLA", length = 50)
	private String pourquoiEnqHLA;

	@Column(name = "nb_frat_typ")
	private Long nbFratTyp;

	@Column(name = "nb_frat_nTyp")
	private Long nbFratNTyp;

	@Column(name = "donneur_comp")
	private Long donneurComp;

	@Column(name = "precise_donneur", length = 30)
	private String preciseDonneur;

	@Column(name = "donneur", length = 20)
	private String donneur;

	@Column(name = "greffe_faite", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 greffeFaite;

	@Column(name = "delai_rapp_diag")
	private Double delaiRappDiag;

	@Column(name = "pourquoi_nfaite", length = 50)
	private String pourquoiNfaite;

	@Column(name = "cyclophosphamide", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 cyclophosphamide;

	@Column(name = "fludarabine", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 fludarabine;

	@Column(name = "busulfan", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 busulfan;

	@Column(name = "dose_cyclo")
	private Double doseCyclo;

	@Column(name = "dose_flu")
	private Double doseFlu;

	@Column(name = "dose_bus")
	private Double doseBus;

	@Column(name = "autre_conditionnement", length = 50)
	private String autreConditionnement;

	@Column(name = "irradiation", length = 30)
	private String irradiation;

	@Column(name = "dose_totale_irr")
	private Double doseTotaleIrr;

	@Column(name = "Serotherapie", length = 10)
	@Enumerated(EnumType.STRING)
	private Enum2 serotherapie;

	@Column(name = "sal", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 sal;

	@Column(name = "dose_SAL")
	private Double doseSAL;

	@Column(name = "source_cellule")
	private String sourceCellule;

	@Column(name = "sortie_aplasie")
	private Long sortieAplasie;

	@Column(name = "gradea_GvH", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum9 gradeaGvH;

	@Column(name = "cGvH", length = 11)
	@Enumerated(EnumType.STRING)
	private Enum10 cGvH;

	@Column(name = "mvo", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 mvo;

	@Column(name = "complication_pulmonaire", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 complicationPulmonaire;

	@Column(name = "precise_comp_pulm", length = 30)
	private String preciseCompPulm;

	@Column(name = "survieJ100", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 survieJ100;

	@Column(name = "smd", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 smd;

	@Column(name = "age_diag_SMD")
	private Long ageDiagSMD;

	@Column(name = "critere_diag_SMD", length = 30)
	private String critereDiagSMD;

	@Column(name = "traitement_SMD", length = 30)
	private String traitementSMD;

	@Column(name = "lam", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 lam;

	@Column(name = "critere_diag_LAM", length = 50)
	private String critereDiagLAM;

	@Column(name = "traitement_LAM", length = 50)
	private String traitementLAM;

	@Column(name = "autres_cancers", length = 50)
	private String autresCancers;

	@Column(name = "ddn")
	private Date ddn;

	@Column(name = "transformation_aigue", length = 17)
	@Enumerated(EnumType.STRING)
	private Enum11 transformationAigue;

	@Column(name = "age_diag_LA")
	private Long ageDiagLA;

	@Column(name = "traitement_LA", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 traitementLA;

	@Column(name = "cancerE", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 cancerE;

	@Column(name = "localisation", length = 30)
	private String localisation;

	@Column(name = "type_histologique", length = 30)
	private String typeHistologique;

	@Column(name = "traitement_cancer", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 traitementCancer;

	@Column(name = "precise_traitement", length = 100)
	private String preciseTraitement;

	@Column(name = "evolution_cyto", length = 7)
	@Enumerated(EnumType.STRING)
	private Enum1 evolution_cyto;

	@Column(name = "formule_chrom", length = 100)
	private String formuleChrom;

	@Column(name = "ageE")
	private Long ageE;

	@Column(name = "statut", length = 7)
	@Enumerated(EnumType.STRING)
	private Statut statut;

	@Column(name = "cause_deces", length = 50)
	private String causeDeces;

	@Column(name = "autre_cause_d", length = 300)
	private String autreCauseD;

	@Column(name = "survie_globale")
	private Double survieGlobale;

	@Column(name = "code")
	private Long code;

	@Column(name = "date_MAJ")
	private Date dateMAJ;

	@Column(name = "nombre_tache_cafe")
	private Long nombreTacheCafe;

	@Column(name = "nombre_tache_hypo")
	private Long nombreTacheHypo;

	@ManyToOne(optional = false)
	@JoinColumn(name = "code_user", referencedColumnName = "code")
	private User user;

	public Fiche(String nDossierFiche) {
		this.nDossierFiche = nDossierFiche;
	}

}