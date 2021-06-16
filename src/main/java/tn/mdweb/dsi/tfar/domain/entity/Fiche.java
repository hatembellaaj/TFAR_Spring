package tn.mdweb.dsi.tfar.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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

	@OneToOne(optional = false)
	@JoinColumns({ @JoinColumn(name = "numero_dossier_patient", referencedColumnName = "n_dossier_p"),
			@JoinColumn(name = "id_patient", referencedColumnName = "id_p") })
	private Patient patient;

	public Fiche() {
	}

	public Fiche(String nDossierFiche, Date dateDiagnostique, Date dateEnregistrement, String degConsang,
			Long placeEnfant, Long nbVivant, Long nbMort, Long mortNe, Long avortement, Long nbCousin, Long nbMembre,
			String arbreGenealogique, String arbreGenealogiqueCancer, Enum1 syndromeAnemique, Enum1 syndromeHem,
			Enum1 syndromeInf, Enum1 decouverteFort, Enum1 enqueteFam, String typeCancer, Enum1 cancer,
			Double tailleNaiss, Double poidsNaiss, Enum1 hypotrophie, Enum1 troubleCroi, Long aAgeChDiag,
			Long mAgeChDiag, Long aAgeOssDiag, Long mAgeOssDiag, Long ageRetard, Double poids, String poidsDS,
			Double taille, String tailleDS, Enum1 atteinteCut, Enum1 tacheCaf, Enum1 ventre, Enum1 membreSup,
			Enum1 membreInf, Enum1 visage, Enum1 thorax, Enum1 dos, Enum1 hyperPig, Enum1 hypochromique,
			String couleurPeau, String autreAtCut, Enum1 atteinteTete, Enum1 microcephalie, Enum1 microphtalmie,
			Enum1 facieTrig, Enum1 traitsFin, String autreAtTete, Enum1 empreinteDigitiforme, Enum1 malUro, Enum2 uiv,
			Enum2 echo, Enum1 reinEctop, String siegeEctopie, Enum1 reinFerChev, String petitRein, Enum1 reinUnique,
			String ectopTest, String vergeInsuf, String autreAnomVerge, Enum1 retardPubertaire, String mTanner,
			String pTanner, String tTanner, Enum1 anomUrin, String typeAnomUrin, Enum1 atteinteOss, String radiosFaites,
			Enum1 anomPouce, Enum1 surnumerarie, Enum1 agenesiePouce, Enum1 bifide, Enum1 hypoPouce, Enum1 aspectPouce,
			Enum1 hypoEminence, Enum1 absenceRadial, Enum1 pouceBas, String autreAnomPouce, Enum1 anomAutDoigts,
			Enum1 courtsTrapus, Enum1 syndactylie, String autreAnomDoigts, Enum1 anomalieOs, Enum1 agenesieRadius,
			String autreAnomalieMembreSup, Enum1 anomOrteil, String preciseAnomOrt, Enum1 lch,
			String autreAnomalieMembreInf, Enum1 anomRachis, String preciseAnomRac, String autreAnomOss,
			Enum1 anomNeuro, Enum1 retardMent, Enum1 hypoacousie, Enum1 strabisme, Enum3 performanceScolaire,
			String autreAnomalieNeurologique, Enum1 anomCardVas, Enum1 echoCoeur, String preciseAnomCardio,
			Enum1 anomDig, String preciseAnomDig, Enum1 endocrinopathie, Enum1 diabete, Enum1 insulinoDep,
			Enum1 hypothyroidie, Long ageDecouverte, String autreEndocrinopathie, String autreAnomCong,
			Date dateNumSanguine, Long age, Double hb, Double vgm, Double retic, Double leuco, Double pnn, Double plq,
			Enum1 hbInf, Enum1 plq_inf, Enum1 pnnInf, Enum2 electrophoreseHb, Double hbf, Enum2 myelogramme,
			Enum4 cellularite, Double erythroblaste, Enum5 morphologieEryth, Enum5 morphologieGran,
			Enum5 morphologieMega, Double granuleux, Enum1 dysmyelopoiese, Enum4 megacaryocytes, Double blaste,
			Enum1 excesBlastes, Enum6 bom, Double adipocytes, Enum1 ubiquitination, Enum7 resUbiquitination,
			String groupComp, String mutationFANC, Enum2 congelationCellule, String labo, String typePrelevement,
			Long scoreClinique, Long scoreEBMT, Score score, Enum1 transfusion, Long ageTransf, Double delaiDiag,
			Enum8 nbCG, Enum8 nbCP, Enum1 chelationFer, String chelateur, Enum1 nilevar, Enum1 danatrol,
			Enum1 oxynethadone, Enum1 androtordyl, String autreAndrogene, Date androDebut, Date androFin,
			String observance, Toxicite toxicite, String autreToxicite, Enum1 enqueteHLA, String pourquoiEnqHLA,
			Long nbFratTyp, Long nbFratNTyp, Long donneurComp, String preciseDonneur, String donneur, Enum1 greffeFaite,
			Double delaiRappDiag, String pourquoiNfaite, Enum1 cyclophosphamide, Enum1 fludarabine, Enum1 busulfan,
			Double doseCyclo, Double doseFlu, Double doseBus, String autreConditionnement, String irradiation,
			Double doseTotaleIrr, Enum2 serotherapie, Enum1 sal, Double doseSAL, String sourceCellule,
			Long sortieAplasie, Enum9 gradeaGvH, Enum10 cGvH, Enum1 mvo, Enum1 complicationPulmonaire,
			String preciseCompPulm, Enum1 survieJ100, Enum1 smd, Long ageDiagSMD, String critereDiagSMD,
			String traitementSMD, Enum1 lam, String critereDiagLAM, String traitementLAM, String autresCancers,
			Date ddn, Enum11 transformationAigue, Long ageDiagLA, Enum1 traitementLA, Enum1 cancerE,
			String localisation, String typeHistologique, Enum1 traitementCancer, String preciseTraitement,
			Enum1 evolution_cyto, String formuleChrom, Long ageE, Statut statut, String causeDeces, String autreCauseD,
			Double survieGlobale, Long code, Date dateMAJ, Long nombreTacheCafe, Long nombreTacheHypo, User user,
			Patient patient) {
		this.nDossierFiche = nDossierFiche;
		this.dateDiagnostique = dateDiagnostique;
		this.dateEnregistrement = dateEnregistrement;
		this.degConsang = degConsang;
		this.placeEnfant = placeEnfant;
		this.nbVivant = nbVivant;
		this.nbMort = nbMort;
		this.mortNe = mortNe;
		this.avortement = avortement;
		this.nbCousin = nbCousin;
		this.nbMembre = nbMembre;
		this.arbreGenealogique = arbreGenealogique;
		this.arbreGenealogiqueCancer = arbreGenealogiqueCancer;
		this.syndromeAnemique = syndromeAnemique;
		this.syndromeHem = syndromeHem;
		this.syndromeInf = syndromeInf;
		this.decouverteFort = decouverteFort;
		this.enqueteFam = enqueteFam;
		this.typeCancer = typeCancer;
		this.cancer = cancer;
		this.tailleNaiss = tailleNaiss;
		this.poidsNaiss = poidsNaiss;
		this.hypotrophie = hypotrophie;
		this.troubleCroi = troubleCroi;
		this.aAgeChDiag = aAgeChDiag;
		this.mAgeChDiag = mAgeChDiag;
		this.aAgeOssDiag = aAgeOssDiag;
		this.mAgeOssDiag = mAgeOssDiag;
		this.ageRetard = ageRetard;
		this.poids = poids;
		this.poidsDS = poidsDS;
		this.taille = taille;
		this.tailleDS = tailleDS;
		this.atteinteCut = atteinteCut;
		this.tacheCaf = tacheCaf;
		this.ventre = ventre;
		this.membreSup = membreSup;
		this.membreInf = membreInf;
		this.visage = visage;
		this.thorax = thorax;
		this.dos = dos;
		this.hyperPig = hyperPig;
		this.hypochromique = hypochromique;
		this.couleurPeau = couleurPeau;
		this.autreAtCut = autreAtCut;
		this.atteinteTete = atteinteTete;
		this.microcephalie = microcephalie;
		this.microphtalmie = microphtalmie;
		this.facieTrig = facieTrig;
		this.traitsFin = traitsFin;
		this.autreAtTete = autreAtTete;
		this.empreinteDigitiforme = empreinteDigitiforme;
		this.malUro = malUro;
		this.uiv = uiv;
		this.echo = echo;
		this.reinEctop = reinEctop;
		this.siegeEctopie = siegeEctopie;
		this.reinFerChev = reinFerChev;
		this.petitRein = petitRein;
		this.reinUnique = reinUnique;
		this.ectopTest = ectopTest;
		this.vergeInsuf = vergeInsuf;
		this.autreAnomVerge = autreAnomVerge;
		this.retardPubertaire = retardPubertaire;
		this.mTanner = mTanner;
		this.pTanner = pTanner;
		this.tTanner = tTanner;
		this.anomUrin = anomUrin;
		this.typeAnomUrin = typeAnomUrin;
		this.atteinteOss = atteinteOss;
		this.radiosFaites = radiosFaites;
		this.anomPouce = anomPouce;
		this.surnumerarie = surnumerarie;
		this.agenesiePouce = agenesiePouce;
		this.bifide = bifide;
		this.hypoPouce = hypoPouce;
		this.aspectPouce = aspectPouce;
		this.hypoEminence = hypoEminence;
		this.absenceRadial = absenceRadial;
		this.pouceBas = pouceBas;
		this.autreAnomPouce = autreAnomPouce;
		this.anomAutDoigts = anomAutDoigts;
		this.courtsTrapus = courtsTrapus;
		this.syndactylie = syndactylie;
		this.autreAnomDoigts = autreAnomDoigts;
		this.anomalieOs = anomalieOs;
		this.agenesieRadius = agenesieRadius;
		this.autreAnomalieMembreSup = autreAnomalieMembreSup;
		this.anomOrteil = anomOrteil;
		this.preciseAnomOrt = preciseAnomOrt;
		this.lch = lch;
		this.autreAnomalieMembreInf = autreAnomalieMembreInf;
		this.anomRachis = anomRachis;
		this.preciseAnomRac = preciseAnomRac;
		this.autreAnomOss = autreAnomOss;
		this.anomNeuro = anomNeuro;
		this.retardMent = retardMent;
		this.hypoacousie = hypoacousie;
		this.strabisme = strabisme;
		this.performanceScolaire = performanceScolaire;
		this.autreAnomalieNeurologique = autreAnomalieNeurologique;
		this.anomCardVas = anomCardVas;
		this.echoCoeur = echoCoeur;
		this.preciseAnomCardio = preciseAnomCardio;
		this.anomDig = anomDig;
		this.preciseAnomDig = preciseAnomDig;
		this.endocrinopathie = endocrinopathie;
		this.diabete = diabete;
		this.insulinoDep = insulinoDep;
		this.hypothyroidie = hypothyroidie;
		this.ageDecouverte = ageDecouverte;
		this.autreEndocrinopathie = autreEndocrinopathie;
		this.autreAnomCong = autreAnomCong;
		this.dateNumSanguine = dateNumSanguine;
		this.age = age;
		this.hb = hb;
		this.vgm = vgm;
		this.retic = retic;
		this.leuco = leuco;
		this.pnn = pnn;
		this.plq = plq;
		this.hbInf = hbInf;
		this.plq_inf = plq_inf;
		this.pnnInf = pnnInf;
		this.electrophoreseHb = electrophoreseHb;
		this.hbf = hbf;
		this.myelogramme = myelogramme;
		this.cellularite = cellularite;
		this.erythroblaste = erythroblaste;
		this.morphologieEryth = morphologieEryth;
		this.morphologieGran = morphologieGran;
		this.morphologieMega = morphologieMega;
		this.granuleux = granuleux;
		this.dysmyelopoiese = dysmyelopoiese;
		this.megacaryocytes = megacaryocytes;
		this.blaste = blaste;
		this.excesBlastes = excesBlastes;
		this.bom = bom;
		this.adipocytes = adipocytes;
		this.ubiquitination = ubiquitination;
		this.resUbiquitination = resUbiquitination;
		this.groupComp = groupComp;
		this.mutationFANC = mutationFANC;
		this.congelationCellule = congelationCellule;
		this.labo = labo;
		this.typePrelevement = typePrelevement;
		this.scoreClinique = scoreClinique;
		this.scoreEBMT = scoreEBMT;
		this.score = score;
		this.transfusion = transfusion;
		this.ageTransf = ageTransf;
		this.delaiDiag = delaiDiag;
		this.nbCG = nbCG;
		this.nbCP = nbCP;
		this.chelationFer = chelationFer;
		this.chelateur = chelateur;
		this.nilevar = nilevar;
		this.danatrol = danatrol;
		this.oxynethadone = oxynethadone;
		this.androtordyl = androtordyl;
		this.autreAndrogene = autreAndrogene;
		this.androDebut = androDebut;
		this.androFin = androFin;
		this.observance = observance;
		this.toxicite = toxicite;
		this.autreToxicite = autreToxicite;
		this.enqueteHLA = enqueteHLA;
		this.pourquoiEnqHLA = pourquoiEnqHLA;
		this.nbFratTyp = nbFratTyp;
		this.nbFratNTyp = nbFratNTyp;
		this.donneurComp = donneurComp;
		this.preciseDonneur = preciseDonneur;
		this.donneur = donneur;
		this.greffeFaite = greffeFaite;
		this.delaiRappDiag = delaiRappDiag;
		this.pourquoiNfaite = pourquoiNfaite;
		this.cyclophosphamide = cyclophosphamide;
		this.fludarabine = fludarabine;
		this.busulfan = busulfan;
		this.doseCyclo = doseCyclo;
		this.doseFlu = doseFlu;
		this.doseBus = doseBus;
		this.autreConditionnement = autreConditionnement;
		this.irradiation = irradiation;
		this.doseTotaleIrr = doseTotaleIrr;
		this.serotherapie = serotherapie;
		this.sal = sal;
		this.doseSAL = doseSAL;
		this.sourceCellule = sourceCellule;
		this.sortieAplasie = sortieAplasie;
		this.gradeaGvH = gradeaGvH;
		this.cGvH = cGvH;
		this.mvo = mvo;
		this.complicationPulmonaire = complicationPulmonaire;
		this.preciseCompPulm = preciseCompPulm;
		this.survieJ100 = survieJ100;
		this.smd = smd;
		this.ageDiagSMD = ageDiagSMD;
		this.critereDiagSMD = critereDiagSMD;
		this.traitementSMD = traitementSMD;
		this.lam = lam;
		this.critereDiagLAM = critereDiagLAM;
		this.traitementLAM = traitementLAM;
		this.autresCancers = autresCancers;
		this.ddn = ddn;
		this.transformationAigue = transformationAigue;
		this.ageDiagLA = ageDiagLA;
		this.traitementLA = traitementLA;
		this.cancerE = cancerE;
		this.localisation = localisation;
		this.typeHistologique = typeHistologique;
		this.traitementCancer = traitementCancer;
		this.preciseTraitement = preciseTraitement;
		this.evolution_cyto = evolution_cyto;
		this.formuleChrom = formuleChrom;
		this.ageE = ageE;
		this.statut = statut;
		this.causeDeces = causeDeces;
		this.autreCauseD = autreCauseD;
		this.survieGlobale = survieGlobale;
		this.code = code;
		this.dateMAJ = dateMAJ;
		this.nombreTacheCafe = nombreTacheCafe;
		this.nombreTacheHypo = nombreTacheHypo;
		this.user = user;
		this.patient = patient;
	}

	public String getnDossierFiche() {
		return nDossierFiche;
	}

	public void setnDossierFiche(String nDossierFiche) {
		this.nDossierFiche = nDossierFiche;
	}

	public Date getDateDiagnostique() {
		return dateDiagnostique;
	}

	public void setDateDiagnostique(Date dateDiagnostique) {
		this.dateDiagnostique = dateDiagnostique;
	}

	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public String getDegConsang() {
		return degConsang;
	}

	public void setDegConsang(String degConsang) {
		this.degConsang = degConsang;
	}

	public Long getPlaceEnfant() {
		return placeEnfant;
	}

	public void setPlaceEnfant(Long placeEnfant) {
		this.placeEnfant = placeEnfant;
	}

	public Long getNbVivant() {
		return nbVivant;
	}

	public void setNbVivant(Long nbVivant) {
		this.nbVivant = nbVivant;
	}

	public Long getNbMort() {
		return nbMort;
	}

	public void setNbMort(Long nbMort) {
		this.nbMort = nbMort;
	}

	public Long getMortNe() {
		return mortNe;
	}

	public void setMortNe(Long mortNe) {
		this.mortNe = mortNe;
	}

	public Long getAvortement() {
		return avortement;
	}

	public void setAvortement(Long avortement) {
		this.avortement = avortement;
	}

	public Long getNbCousin() {
		return nbCousin;
	}

	public void setNbCousin(Long nbCousin) {
		this.nbCousin = nbCousin;
	}

	public Long getNbMembre() {
		return nbMembre;
	}

	public void setNbMembre(Long nbMembre) {
		this.nbMembre = nbMembre;
	}

	public String getArbreGenealogique() {
		return arbreGenealogique;
	}

	public void setArbreGenealogique(String arbreGenealogique) {
		this.arbreGenealogique = arbreGenealogique;
	}

	public String getArbreGenealogiqueCancer() {
		return arbreGenealogiqueCancer;
	}

	public void setArbreGenealogiqueCancer(String arbreGenealogiqueCancer) {
		this.arbreGenealogiqueCancer = arbreGenealogiqueCancer;
	}

	public Enum1 getSyndromeAnemique() {
		return syndromeAnemique;
	}

	public void setSyndromeAnemique(Enum1 syndromeAnemique) {
		this.syndromeAnemique = syndromeAnemique;
	}

	public Enum1 getSyndromeHem() {
		return syndromeHem;
	}

	public void setSyndromeHem(Enum1 syndromeHem) {
		this.syndromeHem = syndromeHem;
	}

	public Enum1 getSyndromeInf() {
		return syndromeInf;
	}

	public void setSyndromeInf(Enum1 syndromeInf) {
		this.syndromeInf = syndromeInf;
	}

	public Enum1 getDecouverteFort() {
		return decouverteFort;
	}

	public void setDecouverteFort(Enum1 decouverteFort) {
		this.decouverteFort = decouverteFort;
	}

	public Enum1 getEnqueteFam() {
		return enqueteFam;
	}

	public void setEnqueteFam(Enum1 enqueteFam) {
		this.enqueteFam = enqueteFam;
	}

	public String getTypeCancer() {
		return typeCancer;
	}

	public void setTypeCancer(String typeCancer) {
		this.typeCancer = typeCancer;
	}

	public Enum1 getCancer() {
		return cancer;
	}

	public void setCancer(Enum1 cancer) {
		this.cancer = cancer;
	}

	public Double getTailleNaiss() {
		return tailleNaiss;
	}

	public void setTailleNaiss(Double tailleNaiss) {
		this.tailleNaiss = tailleNaiss;
	}

	public Double getPoidsNaiss() {
		return poidsNaiss;
	}

	public void setPoidsNaiss(Double poidsNaiss) {
		this.poidsNaiss = poidsNaiss;
	}

	public Enum1 getHypotrophie() {
		return hypotrophie;
	}

	public void setHypotrophie(Enum1 hypotrophie) {
		this.hypotrophie = hypotrophie;
	}

	public Enum1 getTroubleCroi() {
		return troubleCroi;
	}

	public void setTroubleCroi(Enum1 troubleCroi) {
		this.troubleCroi = troubleCroi;
	}

	public Long getaAgeChDiag() {
		return aAgeChDiag;
	}

	public void setaAgeChDiag(Long aAgeChDiag) {
		this.aAgeChDiag = aAgeChDiag;
	}

	public Long getmAgeChDiag() {
		return mAgeChDiag;
	}

	public void setmAgeChDiag(Long mAgeChDiag) {
		this.mAgeChDiag = mAgeChDiag;
	}

	public Long getaAgeOssDiag() {
		return aAgeOssDiag;
	}

	public void setaAgeOssDiag(Long aAgeOssDiag) {
		this.aAgeOssDiag = aAgeOssDiag;
	}

	public Long getmAgeOssDiag() {
		return mAgeOssDiag;
	}

	public void setmAgeOssDiag(Long mAgeOssDiag) {
		this.mAgeOssDiag = mAgeOssDiag;
	}

	public Long getAgeRetard() {
		return ageRetard;
	}

	public void setAgeRetard(Long ageRetard) {
		this.ageRetard = ageRetard;
	}

	public Double getPoids() {
		return poids;
	}

	public void setPoids(Double poids) {
		this.poids = poids;
	}

	public String getPoidsDS() {
		return poidsDS;
	}

	public void setPoidsDS(String poidsDS) {
		this.poidsDS = poidsDS;
	}

	public Double getTaille() {
		return taille;
	}

	public void setTaille(Double taille) {
		this.taille = taille;
	}

	public String getTailleDS() {
		return tailleDS;
	}

	public void setTailleDS(String tailleDS) {
		this.tailleDS = tailleDS;
	}

	public Enum1 getAtteinteCut() {
		return atteinteCut;
	}

	public void setAtteinteCut(Enum1 atteinteCut) {
		this.atteinteCut = atteinteCut;
	}

	public Enum1 getTacheCaf() {
		return tacheCaf;
	}

	public void setTacheCaf(Enum1 tacheCaf) {
		this.tacheCaf = tacheCaf;
	}

	public Enum1 getVentre() {
		return ventre;
	}

	public void setVentre(Enum1 ventre) {
		this.ventre = ventre;
	}

	public Enum1 getMembreSup() {
		return membreSup;
	}

	public void setMembreSup(Enum1 membreSup) {
		this.membreSup = membreSup;
	}

	public Enum1 getMembreInf() {
		return membreInf;
	}

	public void setMembreInf(Enum1 membreInf) {
		this.membreInf = membreInf;
	}

	public Enum1 getVisage() {
		return visage;
	}

	public void setVisage(Enum1 visage) {
		this.visage = visage;
	}

	public Enum1 getThorax() {
		return thorax;
	}

	public void setThorax(Enum1 thorax) {
		this.thorax = thorax;
	}

	public Enum1 getDos() {
		return dos;
	}

	public void setDos(Enum1 dos) {
		this.dos = dos;
	}

	public Enum1 getHyperPig() {
		return hyperPig;
	}

	public void setHyperPig(Enum1 hyperPig) {
		this.hyperPig = hyperPig;
	}

	public Enum1 getHypochromique() {
		return hypochromique;
	}

	public void setHypochromique(Enum1 hypochromique) {
		this.hypochromique = hypochromique;
	}

	public String getCouleurPeau() {
		return couleurPeau;
	}

	public void setCouleurPeau(String couleurPeau) {
		this.couleurPeau = couleurPeau;
	}

	public String getAutreAtCut() {
		return autreAtCut;
	}

	public void setAutreAtCut(String autreAtCut) {
		this.autreAtCut = autreAtCut;
	}

	public Enum1 getAtteinteTete() {
		return atteinteTete;
	}

	public void setAtteinteTete(Enum1 atteinteTete) {
		this.atteinteTete = atteinteTete;
	}

	public Enum1 getMicrocephalie() {
		return microcephalie;
	}

	public void setMicrocephalie(Enum1 microcephalie) {
		this.microcephalie = microcephalie;
	}

	public Enum1 getMicrophtalmie() {
		return microphtalmie;
	}

	public void setMicrophtalmie(Enum1 microphtalmie) {
		this.microphtalmie = microphtalmie;
	}

	public Enum1 getFacieTrig() {
		return facieTrig;
	}

	public void setFacieTrig(Enum1 facieTrig) {
		this.facieTrig = facieTrig;
	}

	public Enum1 getTraitsFin() {
		return traitsFin;
	}

	public void setTraitsFin(Enum1 traitsFin) {
		this.traitsFin = traitsFin;
	}

	public String getAutreAtTete() {
		return autreAtTete;
	}

	public void setAutreAtTete(String autreAtTete) {
		this.autreAtTete = autreAtTete;
	}

	public Enum1 getEmpreinteDigitiforme() {
		return empreinteDigitiforme;
	}

	public void setEmpreinteDigitiforme(Enum1 empreinteDigitiforme) {
		this.empreinteDigitiforme = empreinteDigitiforme;
	}

	public Enum1 getMalUro() {
		return malUro;
	}

	public void setMalUro(Enum1 malUro) {
		this.malUro = malUro;
	}

	public Enum2 getUiv() {
		return uiv;
	}

	public void setUiv(Enum2 uiv) {
		this.uiv = uiv;
	}

	public Enum2 getEcho() {
		return echo;
	}

	public void setEcho(Enum2 echo) {
		this.echo = echo;
	}

	public Enum1 getReinEctop() {
		return reinEctop;
	}

	public void setReinEctop(Enum1 reinEctop) {
		this.reinEctop = reinEctop;
	}

	public String getSiegeEctopie() {
		return siegeEctopie;
	}

	public void setSiegeEctopie(String siegeEctopie) {
		this.siegeEctopie = siegeEctopie;
	}

	public Enum1 getReinFerChev() {
		return reinFerChev;
	}

	public void setReinFerChev(Enum1 reinFerChev) {
		this.reinFerChev = reinFerChev;
	}

	public String getPetitRein() {
		return petitRein;
	}

	public void setPetitRein(String petitRein) {
		this.petitRein = petitRein;
	}

	public Enum1 getReinUnique() {
		return reinUnique;
	}

	public void setReinUnique(Enum1 reinUnique) {
		this.reinUnique = reinUnique;
	}

	public String getEctopTest() {
		return ectopTest;
	}

	public void setEctopTest(String ectopTest) {
		this.ectopTest = ectopTest;
	}

	public String getVergeInsuf() {
		return vergeInsuf;
	}

	public void setVergeInsuf(String vergeInsuf) {
		this.vergeInsuf = vergeInsuf;
	}

	public String getAutreAnomVerge() {
		return autreAnomVerge;
	}

	public void setAutreAnomVerge(String autreAnomVerge) {
		this.autreAnomVerge = autreAnomVerge;
	}

	public Enum1 getRetardPubertaire() {
		return retardPubertaire;
	}

	public void setRetardPubertaire(Enum1 retardPubertaire) {
		this.retardPubertaire = retardPubertaire;
	}

	public String getmTanner() {
		return mTanner;
	}

	public void setmTanner(String mTanner) {
		this.mTanner = mTanner;
	}

	public String getpTanner() {
		return pTanner;
	}

	public void setpTanner(String pTanner) {
		this.pTanner = pTanner;
	}

	public String gettTanner() {
		return tTanner;
	}

	public void settTanner(String tTanner) {
		this.tTanner = tTanner;
	}

	public Enum1 getAnomUrin() {
		return anomUrin;
	}

	public void setAnomUrin(Enum1 anomUrin) {
		this.anomUrin = anomUrin;
	}

	public String getTypeAnomUrin() {
		return typeAnomUrin;
	}

	public void setTypeAnomUrin(String typeAnomUrin) {
		this.typeAnomUrin = typeAnomUrin;
	}

	public Enum1 getAtteinteOss() {
		return atteinteOss;
	}

	public void setAtteinteOss(Enum1 atteinteOss) {
		this.atteinteOss = atteinteOss;
	}

	public String getRadiosFaites() {
		return radiosFaites;
	}

	public void setRadiosFaites(String radiosFaites) {
		this.radiosFaites = radiosFaites;
	}

	public Enum1 getAnomPouce() {
		return anomPouce;
	}

	public void setAnomPouce(Enum1 anomPouce) {
		this.anomPouce = anomPouce;
	}

	public Enum1 getSurnumerarie() {
		return surnumerarie;
	}

	public void setSurnumerarie(Enum1 surnumerarie) {
		this.surnumerarie = surnumerarie;
	}

	public Enum1 getAgenesiePouce() {
		return agenesiePouce;
	}

	public void setAgenesiePouce(Enum1 agenesiePouce) {
		this.agenesiePouce = agenesiePouce;
	}

	public Enum1 getBifide() {
		return bifide;
	}

	public void setBifide(Enum1 bifide) {
		this.bifide = bifide;
	}

	public Enum1 getHypoPouce() {
		return hypoPouce;
	}

	public void setHypoPouce(Enum1 hypoPouce) {
		this.hypoPouce = hypoPouce;
	}

	public Enum1 getAspectPouce() {
		return aspectPouce;
	}

	public void setAspectPouce(Enum1 aspectPouce) {
		this.aspectPouce = aspectPouce;
	}

	public Enum1 getHypoEminence() {
		return hypoEminence;
	}

	public void setHypoEminence(Enum1 hypoEminence) {
		this.hypoEminence = hypoEminence;
	}

	public Enum1 getAbsenceRadial() {
		return absenceRadial;
	}

	public void setAbsenceRadial(Enum1 absenceRadial) {
		this.absenceRadial = absenceRadial;
	}

	public Enum1 getPouceBas() {
		return pouceBas;
	}

	public void setPouceBas(Enum1 pouceBas) {
		this.pouceBas = pouceBas;
	}

	public String getAutreAnomPouce() {
		return autreAnomPouce;
	}

	public void setAutreAnomPouce(String autreAnomPouce) {
		this.autreAnomPouce = autreAnomPouce;
	}

	public Enum1 getAnomAutDoigts() {
		return anomAutDoigts;
	}

	public void setAnomAutDoigts(Enum1 anomAutDoigts) {
		this.anomAutDoigts = anomAutDoigts;
	}

	public Enum1 getCourtsTrapus() {
		return courtsTrapus;
	}

	public void setCourtsTrapus(Enum1 courtsTrapus) {
		this.courtsTrapus = courtsTrapus;
	}

	public Enum1 getSyndactylie() {
		return syndactylie;
	}

	public void setSyndactylie(Enum1 syndactylie) {
		this.syndactylie = syndactylie;
	}

	public String getAutreAnomDoigts() {
		return autreAnomDoigts;
	}

	public void setAutreAnomDoigts(String autreAnomDoigts) {
		this.autreAnomDoigts = autreAnomDoigts;
	}

	public Enum1 getAnomalieOs() {
		return anomalieOs;
	}

	public void setAnomalieOs(Enum1 anomalieOs) {
		this.anomalieOs = anomalieOs;
	}

	public Enum1 getAgenesieRadius() {
		return agenesieRadius;
	}

	public void setAgenesieRadius(Enum1 agenesieRadius) {
		this.agenesieRadius = agenesieRadius;
	}

	public String getAutreAnomalieMembreSup() {
		return autreAnomalieMembreSup;
	}

	public void setAutreAnomalieMembreSup(String autreAnomalieMembreSup) {
		this.autreAnomalieMembreSup = autreAnomalieMembreSup;
	}

	public Enum1 getAnomOrteil() {
		return anomOrteil;
	}

	public void setAnomOrteil(Enum1 anomOrteil) {
		this.anomOrteil = anomOrteil;
	}

	public String getPreciseAnomOrt() {
		return preciseAnomOrt;
	}

	public void setPreciseAnomOrt(String preciseAnomOrt) {
		this.preciseAnomOrt = preciseAnomOrt;
	}

	public Enum1 getLch() {
		return lch;
	}

	public void setLch(Enum1 lch) {
		this.lch = lch;
	}

	public String getAutreAnomalieMembreInf() {
		return autreAnomalieMembreInf;
	}

	public void setAutreAnomalieMembreInf(String autreAnomalieMembreInf) {
		this.autreAnomalieMembreInf = autreAnomalieMembreInf;
	}

	public Enum1 getAnomRachis() {
		return anomRachis;
	}

	public void setAnomRachis(Enum1 anomRachis) {
		this.anomRachis = anomRachis;
	}

	public String getPreciseAnomRac() {
		return preciseAnomRac;
	}

	public void setPreciseAnomRac(String preciseAnomRac) {
		this.preciseAnomRac = preciseAnomRac;
	}

	public String getAutreAnomOss() {
		return autreAnomOss;
	}

	public void setAutreAnomOss(String autreAnomOss) {
		this.autreAnomOss = autreAnomOss;
	}

	public Enum1 getAnomNeuro() {
		return anomNeuro;
	}

	public void setAnomNeuro(Enum1 anomNeuro) {
		this.anomNeuro = anomNeuro;
	}

	public Enum1 getRetardMent() {
		return retardMent;
	}

	public void setRetardMent(Enum1 retardMent) {
		this.retardMent = retardMent;
	}

	public Enum1 getHypoacousie() {
		return hypoacousie;
	}

	public void setHypoacousie(Enum1 hypoacousie) {
		this.hypoacousie = hypoacousie;
	}

	public Enum1 getStrabisme() {
		return strabisme;
	}

	public void setStrabisme(Enum1 strabisme) {
		this.strabisme = strabisme;
	}

	public Enum3 getPerformanceScolaire() {
		return performanceScolaire;
	}

	public void setPerformanceScolaire(Enum3 performanceScolaire) {
		this.performanceScolaire = performanceScolaire;
	}

	public String getAutreAnomalieNeurologique() {
		return autreAnomalieNeurologique;
	}

	public void setAutreAnomalieNeurologique(String autreAnomalieNeurologique) {
		this.autreAnomalieNeurologique = autreAnomalieNeurologique;
	}

	public Enum1 getAnomCardVas() {
		return anomCardVas;
	}

	public void setAnomCardVas(Enum1 anomCardVas) {
		this.anomCardVas = anomCardVas;
	}

	public Enum1 getEchoCoeur() {
		return echoCoeur;
	}

	public void setEchoCoeur(Enum1 echoCoeur) {
		this.echoCoeur = echoCoeur;
	}

	public String getPreciseAnomCardio() {
		return preciseAnomCardio;
	}

	public void setPreciseAnomCardio(String preciseAnomCardio) {
		this.preciseAnomCardio = preciseAnomCardio;
	}

	public Enum1 getAnomDig() {
		return anomDig;
	}

	public void setAnomDig(Enum1 anomDig) {
		this.anomDig = anomDig;
	}

	public String getPreciseAnomDig() {
		return preciseAnomDig;
	}

	public void setPreciseAnomDig(String preciseAnomDig) {
		this.preciseAnomDig = preciseAnomDig;
	}

	public Enum1 getEndocrinopathie() {
		return endocrinopathie;
	}

	public void setEndocrinopathie(Enum1 endocrinopathie) {
		this.endocrinopathie = endocrinopathie;
	}

	public Enum1 getDiabete() {
		return diabete;
	}

	public void setDiabete(Enum1 diabete) {
		this.diabete = diabete;
	}

	public Enum1 getInsulinoDep() {
		return insulinoDep;
	}

	public void setInsulinoDep(Enum1 insulinoDep) {
		this.insulinoDep = insulinoDep;
	}

	public Enum1 getHypothyroidie() {
		return hypothyroidie;
	}

	public void setHypothyroidie(Enum1 hypothyroidie) {
		this.hypothyroidie = hypothyroidie;
	}

	public Long getAgeDecouverte() {
		return ageDecouverte;
	}

	public void setAgeDecouverte(Long ageDecouverte) {
		this.ageDecouverte = ageDecouverte;
	}

	public String getAutreEndocrinopathie() {
		return autreEndocrinopathie;
	}

	public void setAutreEndocrinopathie(String autreEndocrinopathie) {
		this.autreEndocrinopathie = autreEndocrinopathie;
	}

	public String getAutreAnomCong() {
		return autreAnomCong;
	}

	public void setAutreAnomCong(String autreAnomCong) {
		this.autreAnomCong = autreAnomCong;
	}

	public Date getDateNumSanguine() {
		return dateNumSanguine;
	}

	public void setDateNumSanguine(Date dateNumSanguine) {
		this.dateNumSanguine = dateNumSanguine;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Double getHb() {
		return hb;
	}

	public void setHb(Double hb) {
		this.hb = hb;
	}

	public Double getVgm() {
		return vgm;
	}

	public void setVgm(Double vgm) {
		this.vgm = vgm;
	}

	public Double getRetic() {
		return retic;
	}

	public void setRetic(Double retic) {
		this.retic = retic;
	}

	public Double getLeuco() {
		return leuco;
	}

	public void setLeuco(Double leuco) {
		this.leuco = leuco;
	}

	public Double getPnn() {
		return pnn;
	}

	public void setPnn(Double pnn) {
		this.pnn = pnn;
	}

	public Double getPlq() {
		return plq;
	}

	public void setPlq(Double plq) {
		this.plq = plq;
	}

	public Enum1 getHbInf() {
		return hbInf;
	}

	public void setHbInf(Enum1 hbInf) {
		this.hbInf = hbInf;
	}

	public Enum1 getPlq_inf() {
		return plq_inf;
	}

	public void setPlq_inf(Enum1 plq_inf) {
		this.plq_inf = plq_inf;
	}

	public Enum1 getPnnInf() {
		return pnnInf;
	}

	public void setPnnInf(Enum1 pnnInf) {
		this.pnnInf = pnnInf;
	}

	public Enum2 getElectrophoreseHb() {
		return electrophoreseHb;
	}

	public void setElectrophoreseHb(Enum2 electrophoreseHb) {
		this.electrophoreseHb = electrophoreseHb;
	}

	public Double getHbf() {
		return hbf;
	}

	public void setHbf(Double hbf) {
		this.hbf = hbf;
	}

	public Enum2 getMyelogramme() {
		return myelogramme;
	}

	public void setMyelogramme(Enum2 myelogramme) {
		this.myelogramme = myelogramme;
	}

	public Enum4 getCellularite() {
		return cellularite;
	}

	public void setCellularite(Enum4 cellularite) {
		this.cellularite = cellularite;
	}

	public Double getErythroblaste() {
		return erythroblaste;
	}

	public void setErythroblaste(Double erythroblaste) {
		this.erythroblaste = erythroblaste;
	}

	public Enum5 getMorphologieEryth() {
		return morphologieEryth;
	}

	public void setMorphologieEryth(Enum5 morphologieEryth) {
		this.morphologieEryth = morphologieEryth;
	}

	public Enum5 getMorphologieGran() {
		return morphologieGran;
	}

	public void setMorphologieGran(Enum5 morphologieGran) {
		this.morphologieGran = morphologieGran;
	}

	public Enum5 getMorphologieMega() {
		return morphologieMega;
	}

	public void setMorphologieMega(Enum5 morphologieMega) {
		this.morphologieMega = morphologieMega;
	}

	public Double getGranuleux() {
		return granuleux;
	}

	public void setGranuleux(Double granuleux) {
		this.granuleux = granuleux;
	}

	public Enum1 getDysmyelopoiese() {
		return dysmyelopoiese;
	}

	public void setDysmyelopoiese(Enum1 dysmyelopoiese) {
		this.dysmyelopoiese = dysmyelopoiese;
	}

	public Enum4 getMegacaryocytes() {
		return megacaryocytes;
	}

	public void setMegacaryocytes(Enum4 megacaryocytes) {
		this.megacaryocytes = megacaryocytes;
	}

	public Double getBlaste() {
		return blaste;
	}

	public void setBlaste(Double blaste) {
		this.blaste = blaste;
	}

	public Enum1 getExcesBlastes() {
		return excesBlastes;
	}

	public void setExcesBlastes(Enum1 excesBlastes) {
		this.excesBlastes = excesBlastes;
	}

	public Enum6 getBom() {
		return bom;
	}

	public void setBom(Enum6 bom) {
		this.bom = bom;
	}

	public Double getAdipocytes() {
		return adipocytes;
	}

	public void setAdipocytes(Double adipocytes) {
		this.adipocytes = adipocytes;
	}

	public Enum1 getUbiquitination() {
		return ubiquitination;
	}

	public void setUbiquitination(Enum1 ubiquitination) {
		this.ubiquitination = ubiquitination;
	}

	public Enum7 getResUbiquitination() {
		return resUbiquitination;
	}

	public void setResUbiquitination(Enum7 resUbiquitination) {
		this.resUbiquitination = resUbiquitination;
	}

	public String getGroupComp() {
		return groupComp;
	}

	public void setGroupComp(String groupComp) {
		this.groupComp = groupComp;
	}

	public String getMutationFANC() {
		return mutationFANC;
	}

	public void setMutationFANC(String mutationFANC) {
		this.mutationFANC = mutationFANC;
	}

	public Enum2 getCongelationCellule() {
		return congelationCellule;
	}

	public void setCongelationCellule(Enum2 congelationCellule) {
		this.congelationCellule = congelationCellule;
	}

	public String getLabo() {
		return labo;
	}

	public void setLabo(String labo) {
		this.labo = labo;
	}

	public String getTypePrelevement() {
		return typePrelevement;
	}

	public void setTypePrelevement(String typePrelevement) {
		this.typePrelevement = typePrelevement;
	}

	public Long getScoreClinique() {
		return scoreClinique;
	}

	public void setScoreClinique(Long scoreClinique) {
		this.scoreClinique = scoreClinique;
	}

	public Long getScoreEBMT() {
		return scoreEBMT;
	}

	public void setScoreEBMT(Long scoreEBMT) {
		this.scoreEBMT = scoreEBMT;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public Enum1 getTransfusion() {
		return transfusion;
	}

	public void setTransfusion(Enum1 transfusion) {
		this.transfusion = transfusion;
	}

	public Long getAgeTransf() {
		return ageTransf;
	}

	public void setAgeTransf(Long ageTransf) {
		this.ageTransf = ageTransf;
	}

	public Double getDelaiDiag() {
		return delaiDiag;
	}

	public void setDelaiDiag(Double delaiDiag) {
		this.delaiDiag = delaiDiag;
	}

	public Enum8 getNbCG() {
		return nbCG;
	}

	public void setNbCG(Enum8 nbCG) {
		this.nbCG = nbCG;
	}

	public Enum8 getNbCP() {
		return nbCP;
	}

	public void setNbCP(Enum8 nbCP) {
		this.nbCP = nbCP;
	}

	public Enum1 getChelationFer() {
		return chelationFer;
	}

	public void setChelationFer(Enum1 chelationFer) {
		this.chelationFer = chelationFer;
	}

	public String getChelateur() {
		return chelateur;
	}

	public void setChelateur(String chelateur) {
		this.chelateur = chelateur;
	}

	public Enum1 getNilevar() {
		return nilevar;
	}

	public void setNilevar(Enum1 nilevar) {
		this.nilevar = nilevar;
	}

	public Enum1 getDanatrol() {
		return danatrol;
	}

	public void setDanatrol(Enum1 danatrol) {
		this.danatrol = danatrol;
	}

	public Enum1 getOxynethadone() {
		return oxynethadone;
	}

	public void setOxynethadone(Enum1 oxynethadone) {
		this.oxynethadone = oxynethadone;
	}

	public Enum1 getAndrotordyl() {
		return androtordyl;
	}

	public void setAndrotordyl(Enum1 androtordyl) {
		this.androtordyl = androtordyl;
	}

	public String getAutreAndrogene() {
		return autreAndrogene;
	}

	public void setAutreAndrogene(String autreAndrogene) {
		this.autreAndrogene = autreAndrogene;
	}

	public Date getAndroDebut() {
		return androDebut;
	}

	public void setAndroDebut(Date androDebut) {
		this.androDebut = androDebut;
	}

	public Date getAndroFin() {
		return androFin;
	}

	public void setAndroFin(Date androFin) {
		this.androFin = androFin;
	}

	public String getObservance() {
		return observance;
	}

	public void setObservance(String observance) {
		this.observance = observance;
	}

	public Toxicite getToxicite() {
		return toxicite;
	}

	public void setToxicite(Toxicite toxicite) {
		this.toxicite = toxicite;
	}

	public String getAutreToxicite() {
		return autreToxicite;
	}

	public void setAutreToxicite(String autreToxicite) {
		this.autreToxicite = autreToxicite;
	}

	public Enum1 getEnqueteHLA() {
		return enqueteHLA;
	}

	public void setEnqueteHLA(Enum1 enqueteHLA) {
		this.enqueteHLA = enqueteHLA;
	}

	public String getPourquoiEnqHLA() {
		return pourquoiEnqHLA;
	}

	public void setPourquoiEnqHLA(String pourquoiEnqHLA) {
		this.pourquoiEnqHLA = pourquoiEnqHLA;
	}

	public Long getNbFratTyp() {
		return nbFratTyp;
	}

	public void setNbFratTyp(Long nbFratTyp) {
		this.nbFratTyp = nbFratTyp;
	}

	public Long getNbFratNTyp() {
		return nbFratNTyp;
	}

	public void setNbFratNTyp(Long nbFratNTyp) {
		this.nbFratNTyp = nbFratNTyp;
	}

	public Long getDonneurComp() {
		return donneurComp;
	}

	public void setDonneurComp(Long donneurComp) {
		this.donneurComp = donneurComp;
	}

	public String getPreciseDonneur() {
		return preciseDonneur;
	}

	public void setPreciseDonneur(String preciseDonneur) {
		this.preciseDonneur = preciseDonneur;
	}

	public String getDonneur() {
		return donneur;
	}

	public void setDonneur(String donneur) {
		this.donneur = donneur;
	}

	public Enum1 getGreffeFaite() {
		return greffeFaite;
	}

	public void setGreffeFaite(Enum1 greffeFaite) {
		this.greffeFaite = greffeFaite;
	}

	public Double getDelaiRappDiag() {
		return delaiRappDiag;
	}

	public void setDelaiRappDiag(Double delaiRappDiag) {
		this.delaiRappDiag = delaiRappDiag;
	}

	public String getPourquoiNfaite() {
		return pourquoiNfaite;
	}

	public void setPourquoiNfaite(String pourquoiNfaite) {
		this.pourquoiNfaite = pourquoiNfaite;
	}

	public Enum1 getCyclophosphamide() {
		return cyclophosphamide;
	}

	public void setCyclophosphamide(Enum1 cyclophosphamide) {
		this.cyclophosphamide = cyclophosphamide;
	}

	public Enum1 getFludarabine() {
		return fludarabine;
	}

	public void setFludarabine(Enum1 fludarabine) {
		this.fludarabine = fludarabine;
	}

	public Enum1 getBusulfan() {
		return busulfan;
	}

	public void setBusulfan(Enum1 busulfan) {
		this.busulfan = busulfan;
	}

	public Double getDoseCyclo() {
		return doseCyclo;
	}

	public void setDoseCyclo(Double doseCyclo) {
		this.doseCyclo = doseCyclo;
	}

	public Double getDoseFlu() {
		return doseFlu;
	}

	public void setDoseFlu(Double doseFlu) {
		this.doseFlu = doseFlu;
	}

	public Double getDoseBus() {
		return doseBus;
	}

	public void setDoseBus(Double doseBus) {
		this.doseBus = doseBus;
	}

	public String getAutreConditionnement() {
		return autreConditionnement;
	}

	public void setAutreConditionnement(String autreConditionnement) {
		this.autreConditionnement = autreConditionnement;
	}

	public String getIrradiation() {
		return irradiation;
	}

	public void setIrradiation(String irradiation) {
		this.irradiation = irradiation;
	}

	public Double getDoseTotaleIrr() {
		return doseTotaleIrr;
	}

	public void setDoseTotaleIrr(Double doseTotaleIrr) {
		this.doseTotaleIrr = doseTotaleIrr;
	}

	public Enum2 getSerotherapie() {
		return serotherapie;
	}

	public void setSerotherapie(Enum2 serotherapie) {
		this.serotherapie = serotherapie;
	}

	public Enum1 getSal() {
		return sal;
	}

	public void setSal(Enum1 sal) {
		this.sal = sal;
	}

	public Double getDoseSAL() {
		return doseSAL;
	}

	public void setDoseSAL(Double doseSAL) {
		this.doseSAL = doseSAL;
	}

	public String getSourceCellule() {
		return sourceCellule;
	}

	public void setSourceCellule(String sourceCellule) {
		this.sourceCellule = sourceCellule;
	}

	public Long getSortieAplasie() {
		return sortieAplasie;
	}

	public void setSortieAplasie(Long sortieAplasie) {
		this.sortieAplasie = sortieAplasie;
	}

	public Enum9 getGradeaGvH() {
		return gradeaGvH;
	}

	public void setGradeaGvH(Enum9 gradeaGvH) {
		this.gradeaGvH = gradeaGvH;
	}

	public Enum10 getcGvH() {
		return cGvH;
	}

	public void setcGvH(Enum10 cGvH) {
		this.cGvH = cGvH;
	}

	public Enum1 getMvo() {
		return mvo;
	}

	public void setMvo(Enum1 mvo) {
		this.mvo = mvo;
	}

	public Enum1 getComplicationPulmonaire() {
		return complicationPulmonaire;
	}

	public void setComplicationPulmonaire(Enum1 complicationPulmonaire) {
		this.complicationPulmonaire = complicationPulmonaire;
	}

	public String getPreciseCompPulm() {
		return preciseCompPulm;
	}

	public void setPreciseCompPulm(String preciseCompPulm) {
		this.preciseCompPulm = preciseCompPulm;
	}

	public Enum1 getSurvieJ100() {
		return survieJ100;
	}

	public void setSurvieJ100(Enum1 survieJ100) {
		this.survieJ100 = survieJ100;
	}

	public Enum1 getSmd() {
		return smd;
	}

	public void setSmd(Enum1 smd) {
		this.smd = smd;
	}

	public Long getAgeDiagSMD() {
		return ageDiagSMD;
	}

	public void setAgeDiagSMD(Long ageDiagSMD) {
		this.ageDiagSMD = ageDiagSMD;
	}

	public String getCritereDiagSMD() {
		return critereDiagSMD;
	}

	public void setCritereDiagSMD(String critereDiagSMD) {
		this.critereDiagSMD = critereDiagSMD;
	}

	public String getTraitementSMD() {
		return traitementSMD;
	}

	public void setTraitementSMD(String traitementSMD) {
		this.traitementSMD = traitementSMD;
	}

	public Enum1 getLam() {
		return lam;
	}

	public void setLam(Enum1 lam) {
		this.lam = lam;
	}

	public String getCritereDiagLAM() {
		return critereDiagLAM;
	}

	public void setCritereDiagLAM(String critereDiagLAM) {
		this.critereDiagLAM = critereDiagLAM;
	}

	public String getTraitementLAM() {
		return traitementLAM;
	}

	public void setTraitementLAM(String traitementLAM) {
		this.traitementLAM = traitementLAM;
	}

	public String getAutresCancers() {
		return autresCancers;
	}

	public void setAutresCancers(String autresCancers) {
		this.autresCancers = autresCancers;
	}

	public Date getDdn() {
		return ddn;
	}

	public void setDdn(Date ddn) {
		this.ddn = ddn;
	}

	public Enum11 getTransformationAigue() {
		return transformationAigue;
	}

	public void setTransformationAigue(Enum11 transformationAigue) {
		this.transformationAigue = transformationAigue;
	}

	public Long getAgeDiagLA() {
		return ageDiagLA;
	}

	public void setAgeDiagLA(Long ageDiagLA) {
		this.ageDiagLA = ageDiagLA;
	}

	public Enum1 getTraitementLA() {
		return traitementLA;
	}

	public void setTraitementLA(Enum1 traitementLA) {
		this.traitementLA = traitementLA;
	}

	public Enum1 getCancerE() {
		return cancerE;
	}

	public void setCancerE(Enum1 cancerE) {
		this.cancerE = cancerE;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public String getTypeHistologique() {
		return typeHistologique;
	}

	public void setTypeHistologique(String typeHistologique) {
		this.typeHistologique = typeHistologique;
	}

	public Enum1 getTraitementCancer() {
		return traitementCancer;
	}

	public void setTraitementCancer(Enum1 traitementCancer) {
		this.traitementCancer = traitementCancer;
	}

	public String getPreciseTraitement() {
		return preciseTraitement;
	}

	public void setPreciseTraitement(String preciseTraitement) {
		this.preciseTraitement = preciseTraitement;
	}

	public Enum1 getEvolution_cyto() {
		return evolution_cyto;
	}

	public void setEvolution_cyto(Enum1 evolution_cyto) {
		this.evolution_cyto = evolution_cyto;
	}

	public String getFormuleChrom() {
		return formuleChrom;
	}

	public void setFormuleChrom(String formuleChrom) {
		this.formuleChrom = formuleChrom;
	}

	public Long getAgeE() {
		return ageE;
	}

	public void setAgeE(Long ageE) {
		this.ageE = ageE;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public String getCauseDeces() {
		return causeDeces;
	}

	public void setCauseDeces(String causeDeces) {
		this.causeDeces = causeDeces;
	}

	public String getAutreCauseD() {
		return autreCauseD;
	}

	public void setAutreCauseD(String autreCauseD) {
		this.autreCauseD = autreCauseD;
	}

	public Double getSurvieGlobale() {
		return survieGlobale;
	}

	public void setSurvieGlobale(Double survieGlobale) {
		this.survieGlobale = survieGlobale;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public Date getDateMAJ() {
		return dateMAJ;
	}

	public void setDateMAJ(Date dateMAJ) {
		this.dateMAJ = dateMAJ;
	}

	public Long getNombreTacheCafe() {
		return nombreTacheCafe;
	}

	public void setNombreTacheCafe(Long nombreTacheCafe) {
		this.nombreTacheCafe = nombreTacheCafe;
	}

	public Long getNombreTacheHypo() {
		return nombreTacheHypo;
	}

	public void setNombreTacheHypo(Long nombreTacheHypo) {
		this.nombreTacheHypo = nombreTacheHypo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Fiche [nDossierFiche=" + nDossierFiche + ", dateDiagnostique=" + dateDiagnostique
				+ ", dateEnregistrement=" + dateEnregistrement + ", degConsang=" + degConsang + ", placeEnfant="
				+ placeEnfant + ", nbVivant=" + nbVivant + ", nbMort=" + nbMort + ", mortNe=" + mortNe + ", avortement="
				+ avortement + ", nbCousin=" + nbCousin + ", nbMembre=" + nbMembre + ", arbreGenealogique="
				+ arbreGenealogique + ", arbreGenealogiqueCancer=" + arbreGenealogiqueCancer + ", syndromeAnemique="
				+ syndromeAnemique + ", syndromeHem=" + syndromeHem + ", syndromeInf=" + syndromeInf
				+ ", decouverteFort=" + decouverteFort + ", enqueteFam=" + enqueteFam + ", typeCancer=" + typeCancer
				+ ", cancer=" + cancer + ", tailleNaiss=" + tailleNaiss + ", poidsNaiss=" + poidsNaiss
				+ ", hypotrophie=" + hypotrophie + ", troubleCroi=" + troubleCroi + ", aAgeChDiag=" + aAgeChDiag
				+ ", mAgeChDiag=" + mAgeChDiag + ", aAgeOssDiag=" + aAgeOssDiag + ", mAgeOssDiag=" + mAgeOssDiag
				+ ", ageRetard=" + ageRetard + ", poids=" + poids + ", poidsDS=" + poidsDS + ", taille=" + taille
				+ ", tailleDS=" + tailleDS + ", atteinteCut=" + atteinteCut + ", tacheCaf=" + tacheCaf + ", ventre="
				+ ventre + ", membreSup=" + membreSup + ", membreInf=" + membreInf + ", visage=" + visage + ", thorax="
				+ thorax + ", dos=" + dos + ", hyperPig=" + hyperPig + ", hypochromique=" + hypochromique
				+ ", couleurPeau=" + couleurPeau + ", autreAtCut=" + autreAtCut + ", atteinteTete=" + atteinteTete
				+ ", microcephalie=" + microcephalie + ", microphtalmie=" + microphtalmie + ", facieTrig=" + facieTrig
				+ ", traitsFin=" + traitsFin + ", autreAtTete=" + autreAtTete + ", empreinteDigitiforme="
				+ empreinteDigitiforme + ", malUro=" + malUro + ", uiv=" + uiv + ", echo=" + echo + ", reinEctop="
				+ reinEctop + ", siegeEctopie=" + siegeEctopie + ", reinFerChev=" + reinFerChev + ", petitRein="
				+ petitRein + ", reinUnique=" + reinUnique + ", ectopTest=" + ectopTest + ", vergeInsuf=" + vergeInsuf
				+ ", autreAnomVerge=" + autreAnomVerge + ", retardPubertaire=" + retardPubertaire + ", mTanner="
				+ mTanner + ", pTanner=" + pTanner + ", tTanner=" + tTanner + ", anomUrin=" + anomUrin
				+ ", typeAnomUrin=" + typeAnomUrin + ", atteinteOss=" + atteinteOss + ", radiosFaites=" + radiosFaites
				+ ", anomPouce=" + anomPouce + ", surnumerarie=" + surnumerarie + ", agenesiePouce=" + agenesiePouce
				+ ", bifide=" + bifide + ", hypoPouce=" + hypoPouce + ", aspectPouce=" + aspectPouce + ", hypoEminence="
				+ hypoEminence + ", absenceRadial=" + absenceRadial + ", pouceBas=" + pouceBas + ", autreAnomPouce="
				+ autreAnomPouce + ", anomAutDoigts=" + anomAutDoigts + ", courtsTrapus=" + courtsTrapus
				+ ", syndactylie=" + syndactylie + ", autreAnomDoigts=" + autreAnomDoigts + ", anomalieOs=" + anomalieOs
				+ ", agenesieRadius=" + agenesieRadius + ", autreAnomalieMembreSup=" + autreAnomalieMembreSup
				+ ", anomOrteil=" + anomOrteil + ", preciseAnomOrt=" + preciseAnomOrt + ", lch=" + lch
				+ ", autreAnomalieMembreInf=" + autreAnomalieMembreInf + ", anomRachis=" + anomRachis
				+ ", preciseAnomRac=" + preciseAnomRac + ", autreAnomOss=" + autreAnomOss + ", anomNeuro=" + anomNeuro
				+ ", retardMent=" + retardMent + ", hypoacousie=" + hypoacousie + ", strabisme=" + strabisme
				+ ", performanceScolaire=" + performanceScolaire + ", autreAnomalieNeurologique="
				+ autreAnomalieNeurologique + ", anomCardVas=" + anomCardVas + ", echoCoeur=" + echoCoeur
				+ ", preciseAnomCardio=" + preciseAnomCardio + ", anomDig=" + anomDig + ", preciseAnomDig="
				+ preciseAnomDig + ", endocrinopathie=" + endocrinopathie + ", diabete=" + diabete + ", insulinoDep="
				+ insulinoDep + ", hypothyroidie=" + hypothyroidie + ", ageDecouverte=" + ageDecouverte
				+ ", autreEndocrinopathie=" + autreEndocrinopathie + ", autreAnomCong=" + autreAnomCong
				+ ", dateNumSanguine=" + dateNumSanguine + ", age=" + age + ", hb=" + hb + ", vgm=" + vgm + ", retic="
				+ retic + ", leuco=" + leuco + ", pnn=" + pnn + ", plq=" + plq + ", hbInf=" + hbInf + ", plq_inf="
				+ plq_inf + ", pnnInf=" + pnnInf + ", electrophoreseHb=" + electrophoreseHb + ", hbf=" + hbf
				+ ", myelogramme=" + myelogramme + ", cellularite=" + cellularite + ", erythroblaste=" + erythroblaste
				+ ", morphologieEryth=" + morphologieEryth + ", morphologieGran=" + morphologieGran
				+ ", morphologieMega=" + morphologieMega + ", granuleux=" + granuleux + ", dysmyelopoiese="
				+ dysmyelopoiese + ", megacaryocytes=" + megacaryocytes + ", blaste=" + blaste + ", excesBlastes="
				+ excesBlastes + ", bom=" + bom + ", adipocytes=" + adipocytes + ", ubiquitination=" + ubiquitination
				+ ", resUbiquitination=" + resUbiquitination + ", groupComp=" + groupComp + ", mutationFANC="
				+ mutationFANC + ", congelationCellule=" + congelationCellule + ", labo=" + labo + ", typePrelevement="
				+ typePrelevement + ", scoreClinique=" + scoreClinique + ", scoreEBMT=" + scoreEBMT + ", score=" + score
				+ ", transfusion=" + transfusion + ", ageTransf=" + ageTransf + ", delaiDiag=" + delaiDiag + ", nbCG="
				+ nbCG + ", nbCP=" + nbCP + ", chelationFer=" + chelationFer + ", chelateur=" + chelateur + ", nilevar="
				+ nilevar + ", danatrol=" + danatrol + ", oxynethadone=" + oxynethadone + ", androtordyl=" + androtordyl
				+ ", autreAndrogene=" + autreAndrogene + ", androDebut=" + androDebut + ", androFin=" + androFin
				+ ", observance=" + observance + ", toxicite=" + toxicite + ", autreToxicite=" + autreToxicite
				+ ", enqueteHLA=" + enqueteHLA + ", pourquoiEnqHLA=" + pourquoiEnqHLA + ", nbFratTyp=" + nbFratTyp
				+ ", nbFratNTyp=" + nbFratNTyp + ", donneurComp=" + donneurComp + ", preciseDonneur=" + preciseDonneur
				+ ", donneur=" + donneur + ", greffeFaite=" + greffeFaite + ", delaiRappDiag=" + delaiRappDiag
				+ ", pourquoiNfaite=" + pourquoiNfaite + ", cyclophosphamide=" + cyclophosphamide + ", fludarabine="
				+ fludarabine + ", busulfan=" + busulfan + ", doseCyclo=" + doseCyclo + ", doseFlu=" + doseFlu
				+ ", doseBus=" + doseBus + ", autreConditionnement=" + autreConditionnement + ", irradiation="
				+ irradiation + ", doseTotaleIrr=" + doseTotaleIrr + ", serotherapie=" + serotherapie + ", sal=" + sal
				+ ", doseSAL=" + doseSAL + ", sourceCellule=" + sourceCellule + ", sortieAplasie=" + sortieAplasie
				+ ", gradeaGvH=" + gradeaGvH + ", cGvH=" + cGvH + ", mvo=" + mvo + ", complicationPulmonaire="
				+ complicationPulmonaire + ", preciseCompPulm=" + preciseCompPulm + ", survieJ100=" + survieJ100
				+ ", smd=" + smd + ", ageDiagSMD=" + ageDiagSMD + ", critereDiagSMD=" + critereDiagSMD
				+ ", traitementSMD=" + traitementSMD + ", lam=" + lam + ", critereDiagLAM=" + critereDiagLAM
				+ ", traitementLAM=" + traitementLAM + ", autresCancers=" + autresCancers + ", ddn=" + ddn
				+ ", transformationAigue=" + transformationAigue + ", ageDiagLA=" + ageDiagLA + ", traitementLA="
				+ traitementLA + ", cancerE=" + cancerE + ", localisation=" + localisation + ", typeHistologique="
				+ typeHistologique + ", traitementCancer=" + traitementCancer + ", preciseTraitement="
				+ preciseTraitement + ", evolution_cyto=" + evolution_cyto + ", formuleChrom=" + formuleChrom
				+ ", ageE=" + ageE + ", statut=" + statut + ", causeDeces=" + causeDeces + ", autreCauseD="
				+ autreCauseD + ", survieGlobale=" + survieGlobale + ", code=" + code + ", dateMAJ=" + dateMAJ
				+ ", nombreTacheCafe=" + nombreTacheCafe + ", nombreTacheHypo=" + nombreTacheHypo + ", user=" + user
				+ ", patient=" + patient + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aAgeChDiag == null) ? 0 : aAgeChDiag.hashCode());
		result = prime * result + ((aAgeOssDiag == null) ? 0 : aAgeOssDiag.hashCode());
		result = prime * result + ((absenceRadial == null) ? 0 : absenceRadial.hashCode());
		result = prime * result + ((adipocytes == null) ? 0 : adipocytes.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((ageDecouverte == null) ? 0 : ageDecouverte.hashCode());
		result = prime * result + ((ageDiagLA == null) ? 0 : ageDiagLA.hashCode());
		result = prime * result + ((ageDiagSMD == null) ? 0 : ageDiagSMD.hashCode());
		result = prime * result + ((ageE == null) ? 0 : ageE.hashCode());
		result = prime * result + ((ageRetard == null) ? 0 : ageRetard.hashCode());
		result = prime * result + ((ageTransf == null) ? 0 : ageTransf.hashCode());
		result = prime * result + ((agenesiePouce == null) ? 0 : agenesiePouce.hashCode());
		result = prime * result + ((agenesieRadius == null) ? 0 : agenesieRadius.hashCode());
		result = prime * result + ((androDebut == null) ? 0 : androDebut.hashCode());
		result = prime * result + ((androFin == null) ? 0 : androFin.hashCode());
		result = prime * result + ((androtordyl == null) ? 0 : androtordyl.hashCode());
		result = prime * result + ((anomAutDoigts == null) ? 0 : anomAutDoigts.hashCode());
		result = prime * result + ((anomCardVas == null) ? 0 : anomCardVas.hashCode());
		result = prime * result + ((anomDig == null) ? 0 : anomDig.hashCode());
		result = prime * result + ((anomNeuro == null) ? 0 : anomNeuro.hashCode());
		result = prime * result + ((anomOrteil == null) ? 0 : anomOrteil.hashCode());
		result = prime * result + ((anomPouce == null) ? 0 : anomPouce.hashCode());
		result = prime * result + ((anomRachis == null) ? 0 : anomRachis.hashCode());
		result = prime * result + ((anomUrin == null) ? 0 : anomUrin.hashCode());
		result = prime * result + ((anomalieOs == null) ? 0 : anomalieOs.hashCode());
		result = prime * result + ((arbreGenealogique == null) ? 0 : arbreGenealogique.hashCode());
		result = prime * result + ((arbreGenealogiqueCancer == null) ? 0 : arbreGenealogiqueCancer.hashCode());
		result = prime * result + ((aspectPouce == null) ? 0 : aspectPouce.hashCode());
		result = prime * result + ((atteinteCut == null) ? 0 : atteinteCut.hashCode());
		result = prime * result + ((atteinteOss == null) ? 0 : atteinteOss.hashCode());
		result = prime * result + ((atteinteTete == null) ? 0 : atteinteTete.hashCode());
		result = prime * result + ((autreAndrogene == null) ? 0 : autreAndrogene.hashCode());
		result = prime * result + ((autreAnomCong == null) ? 0 : autreAnomCong.hashCode());
		result = prime * result + ((autreAnomDoigts == null) ? 0 : autreAnomDoigts.hashCode());
		result = prime * result + ((autreAnomOss == null) ? 0 : autreAnomOss.hashCode());
		result = prime * result + ((autreAnomPouce == null) ? 0 : autreAnomPouce.hashCode());
		result = prime * result + ((autreAnomVerge == null) ? 0 : autreAnomVerge.hashCode());
		result = prime * result + ((autreAnomalieMembreInf == null) ? 0 : autreAnomalieMembreInf.hashCode());
		result = prime * result + ((autreAnomalieMembreSup == null) ? 0 : autreAnomalieMembreSup.hashCode());
		result = prime * result + ((autreAnomalieNeurologique == null) ? 0 : autreAnomalieNeurologique.hashCode());
		result = prime * result + ((autreAtCut == null) ? 0 : autreAtCut.hashCode());
		result = prime * result + ((autreAtTete == null) ? 0 : autreAtTete.hashCode());
		result = prime * result + ((autreCauseD == null) ? 0 : autreCauseD.hashCode());
		result = prime * result + ((autreConditionnement == null) ? 0 : autreConditionnement.hashCode());
		result = prime * result + ((autreEndocrinopathie == null) ? 0 : autreEndocrinopathie.hashCode());
		result = prime * result + ((autreToxicite == null) ? 0 : autreToxicite.hashCode());
		result = prime * result + ((autresCancers == null) ? 0 : autresCancers.hashCode());
		result = prime * result + ((avortement == null) ? 0 : avortement.hashCode());
		result = prime * result + ((bifide == null) ? 0 : bifide.hashCode());
		result = prime * result + ((blaste == null) ? 0 : blaste.hashCode());
		result = prime * result + ((bom == null) ? 0 : bom.hashCode());
		result = prime * result + ((busulfan == null) ? 0 : busulfan.hashCode());
		result = prime * result + ((cGvH == null) ? 0 : cGvH.hashCode());
		result = prime * result + ((cancer == null) ? 0 : cancer.hashCode());
		result = prime * result + ((cancerE == null) ? 0 : cancerE.hashCode());
		result = prime * result + ((causeDeces == null) ? 0 : causeDeces.hashCode());
		result = prime * result + ((cellularite == null) ? 0 : cellularite.hashCode());
		result = prime * result + ((chelateur == null) ? 0 : chelateur.hashCode());
		result = prime * result + ((chelationFer == null) ? 0 : chelationFer.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((complicationPulmonaire == null) ? 0 : complicationPulmonaire.hashCode());
		result = prime * result + ((congelationCellule == null) ? 0 : congelationCellule.hashCode());
		result = prime * result + ((couleurPeau == null) ? 0 : couleurPeau.hashCode());
		result = prime * result + ((courtsTrapus == null) ? 0 : courtsTrapus.hashCode());
		result = prime * result + ((critereDiagLAM == null) ? 0 : critereDiagLAM.hashCode());
		result = prime * result + ((critereDiagSMD == null) ? 0 : critereDiagSMD.hashCode());
		result = prime * result + ((cyclophosphamide == null) ? 0 : cyclophosphamide.hashCode());
		result = prime * result + ((danatrol == null) ? 0 : danatrol.hashCode());
		result = prime * result + ((dateDiagnostique == null) ? 0 : dateDiagnostique.hashCode());
		result = prime * result + ((dateEnregistrement == null) ? 0 : dateEnregistrement.hashCode());
		result = prime * result + ((dateMAJ == null) ? 0 : dateMAJ.hashCode());
		result = prime * result + ((dateNumSanguine == null) ? 0 : dateNumSanguine.hashCode());
		result = prime * result + ((ddn == null) ? 0 : ddn.hashCode());
		result = prime * result + ((decouverteFort == null) ? 0 : decouverteFort.hashCode());
		result = prime * result + ((degConsang == null) ? 0 : degConsang.hashCode());
		result = prime * result + ((delaiDiag == null) ? 0 : delaiDiag.hashCode());
		result = prime * result + ((delaiRappDiag == null) ? 0 : delaiRappDiag.hashCode());
		result = prime * result + ((diabete == null) ? 0 : diabete.hashCode());
		result = prime * result + ((donneur == null) ? 0 : donneur.hashCode());
		result = prime * result + ((donneurComp == null) ? 0 : donneurComp.hashCode());
		result = prime * result + ((dos == null) ? 0 : dos.hashCode());
		result = prime * result + ((doseBus == null) ? 0 : doseBus.hashCode());
		result = prime * result + ((doseCyclo == null) ? 0 : doseCyclo.hashCode());
		result = prime * result + ((doseFlu == null) ? 0 : doseFlu.hashCode());
		result = prime * result + ((doseSAL == null) ? 0 : doseSAL.hashCode());
		result = prime * result + ((doseTotaleIrr == null) ? 0 : doseTotaleIrr.hashCode());
		result = prime * result + ((dysmyelopoiese == null) ? 0 : dysmyelopoiese.hashCode());
		result = prime * result + ((echo == null) ? 0 : echo.hashCode());
		result = prime * result + ((echoCoeur == null) ? 0 : echoCoeur.hashCode());
		result = prime * result + ((ectopTest == null) ? 0 : ectopTest.hashCode());
		result = prime * result + ((electrophoreseHb == null) ? 0 : electrophoreseHb.hashCode());
		result = prime * result + ((empreinteDigitiforme == null) ? 0 : empreinteDigitiforme.hashCode());
		result = prime * result + ((endocrinopathie == null) ? 0 : endocrinopathie.hashCode());
		result = prime * result + ((enqueteFam == null) ? 0 : enqueteFam.hashCode());
		result = prime * result + ((enqueteHLA == null) ? 0 : enqueteHLA.hashCode());
		result = prime * result + ((erythroblaste == null) ? 0 : erythroblaste.hashCode());
		result = prime * result + ((evolution_cyto == null) ? 0 : evolution_cyto.hashCode());
		result = prime * result + ((excesBlastes == null) ? 0 : excesBlastes.hashCode());
		result = prime * result + ((facieTrig == null) ? 0 : facieTrig.hashCode());
		result = prime * result + ((fludarabine == null) ? 0 : fludarabine.hashCode());
		result = prime * result + ((formuleChrom == null) ? 0 : formuleChrom.hashCode());
		result = prime * result + ((gradeaGvH == null) ? 0 : gradeaGvH.hashCode());
		result = prime * result + ((granuleux == null) ? 0 : granuleux.hashCode());
		result = prime * result + ((greffeFaite == null) ? 0 : greffeFaite.hashCode());
		result = prime * result + ((groupComp == null) ? 0 : groupComp.hashCode());
		result = prime * result + ((hb == null) ? 0 : hb.hashCode());
		result = prime * result + ((hbInf == null) ? 0 : hbInf.hashCode());
		result = prime * result + ((hbf == null) ? 0 : hbf.hashCode());
		result = prime * result + ((hyperPig == null) ? 0 : hyperPig.hashCode());
		result = prime * result + ((hypoEminence == null) ? 0 : hypoEminence.hashCode());
		result = prime * result + ((hypoPouce == null) ? 0 : hypoPouce.hashCode());
		result = prime * result + ((hypoacousie == null) ? 0 : hypoacousie.hashCode());
		result = prime * result + ((hypochromique == null) ? 0 : hypochromique.hashCode());
		result = prime * result + ((hypothyroidie == null) ? 0 : hypothyroidie.hashCode());
		result = prime * result + ((hypotrophie == null) ? 0 : hypotrophie.hashCode());
		result = prime * result + ((insulinoDep == null) ? 0 : insulinoDep.hashCode());
		result = prime * result + ((irradiation == null) ? 0 : irradiation.hashCode());
		result = prime * result + ((labo == null) ? 0 : labo.hashCode());
		result = prime * result + ((lam == null) ? 0 : lam.hashCode());
		result = prime * result + ((lch == null) ? 0 : lch.hashCode());
		result = prime * result + ((leuco == null) ? 0 : leuco.hashCode());
		result = prime * result + ((localisation == null) ? 0 : localisation.hashCode());
		result = prime * result + ((mAgeChDiag == null) ? 0 : mAgeChDiag.hashCode());
		result = prime * result + ((mAgeOssDiag == null) ? 0 : mAgeOssDiag.hashCode());
		result = prime * result + ((mTanner == null) ? 0 : mTanner.hashCode());
		result = prime * result + ((malUro == null) ? 0 : malUro.hashCode());
		result = prime * result + ((megacaryocytes == null) ? 0 : megacaryocytes.hashCode());
		result = prime * result + ((membreInf == null) ? 0 : membreInf.hashCode());
		result = prime * result + ((membreSup == null) ? 0 : membreSup.hashCode());
		result = prime * result + ((microcephalie == null) ? 0 : microcephalie.hashCode());
		result = prime * result + ((microphtalmie == null) ? 0 : microphtalmie.hashCode());
		result = prime * result + ((morphologieEryth == null) ? 0 : morphologieEryth.hashCode());
		result = prime * result + ((morphologieGran == null) ? 0 : morphologieGran.hashCode());
		result = prime * result + ((morphologieMega == null) ? 0 : morphologieMega.hashCode());
		result = prime * result + ((mortNe == null) ? 0 : mortNe.hashCode());
		result = prime * result + ((mutationFANC == null) ? 0 : mutationFANC.hashCode());
		result = prime * result + ((mvo == null) ? 0 : mvo.hashCode());
		result = prime * result + ((myelogramme == null) ? 0 : myelogramme.hashCode());
		result = prime * result + ((nDossierFiche == null) ? 0 : nDossierFiche.hashCode());
		result = prime * result + ((nbCG == null) ? 0 : nbCG.hashCode());
		result = prime * result + ((nbCP == null) ? 0 : nbCP.hashCode());
		result = prime * result + ((nbCousin == null) ? 0 : nbCousin.hashCode());
		result = prime * result + ((nbFratNTyp == null) ? 0 : nbFratNTyp.hashCode());
		result = prime * result + ((nbFratTyp == null) ? 0 : nbFratTyp.hashCode());
		result = prime * result + ((nbMembre == null) ? 0 : nbMembre.hashCode());
		result = prime * result + ((nbMort == null) ? 0 : nbMort.hashCode());
		result = prime * result + ((nbVivant == null) ? 0 : nbVivant.hashCode());
		result = prime * result + ((nilevar == null) ? 0 : nilevar.hashCode());
		result = prime * result + ((nombreTacheCafe == null) ? 0 : nombreTacheCafe.hashCode());
		result = prime * result + ((nombreTacheHypo == null) ? 0 : nombreTacheHypo.hashCode());
		result = prime * result + ((observance == null) ? 0 : observance.hashCode());
		result = prime * result + ((oxynethadone == null) ? 0 : oxynethadone.hashCode());
		result = prime * result + ((pTanner == null) ? 0 : pTanner.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		result = prime * result + ((performanceScolaire == null) ? 0 : performanceScolaire.hashCode());
		result = prime * result + ((petitRein == null) ? 0 : petitRein.hashCode());
		result = prime * result + ((placeEnfant == null) ? 0 : placeEnfant.hashCode());
		result = prime * result + ((plq == null) ? 0 : plq.hashCode());
		result = prime * result + ((plq_inf == null) ? 0 : plq_inf.hashCode());
		result = prime * result + ((pnn == null) ? 0 : pnn.hashCode());
		result = prime * result + ((pnnInf == null) ? 0 : pnnInf.hashCode());
		result = prime * result + ((poids == null) ? 0 : poids.hashCode());
		result = prime * result + ((poidsDS == null) ? 0 : poidsDS.hashCode());
		result = prime * result + ((poidsNaiss == null) ? 0 : poidsNaiss.hashCode());
		result = prime * result + ((pouceBas == null) ? 0 : pouceBas.hashCode());
		result = prime * result + ((pourquoiEnqHLA == null) ? 0 : pourquoiEnqHLA.hashCode());
		result = prime * result + ((pourquoiNfaite == null) ? 0 : pourquoiNfaite.hashCode());
		result = prime * result + ((preciseAnomCardio == null) ? 0 : preciseAnomCardio.hashCode());
		result = prime * result + ((preciseAnomDig == null) ? 0 : preciseAnomDig.hashCode());
		result = prime * result + ((preciseAnomOrt == null) ? 0 : preciseAnomOrt.hashCode());
		result = prime * result + ((preciseAnomRac == null) ? 0 : preciseAnomRac.hashCode());
		result = prime * result + ((preciseCompPulm == null) ? 0 : preciseCompPulm.hashCode());
		result = prime * result + ((preciseDonneur == null) ? 0 : preciseDonneur.hashCode());
		result = prime * result + ((preciseTraitement == null) ? 0 : preciseTraitement.hashCode());
		result = prime * result + ((radiosFaites == null) ? 0 : radiosFaites.hashCode());
		result = prime * result + ((reinEctop == null) ? 0 : reinEctop.hashCode());
		result = prime * result + ((reinFerChev == null) ? 0 : reinFerChev.hashCode());
		result = prime * result + ((reinUnique == null) ? 0 : reinUnique.hashCode());
		result = prime * result + ((resUbiquitination == null) ? 0 : resUbiquitination.hashCode());
		result = prime * result + ((retardMent == null) ? 0 : retardMent.hashCode());
		result = prime * result + ((retardPubertaire == null) ? 0 : retardPubertaire.hashCode());
		result = prime * result + ((retic == null) ? 0 : retic.hashCode());
		result = prime * result + ((sal == null) ? 0 : sal.hashCode());
		result = prime * result + ((score == null) ? 0 : score.hashCode());
		result = prime * result + ((scoreClinique == null) ? 0 : scoreClinique.hashCode());
		result = prime * result + ((scoreEBMT == null) ? 0 : scoreEBMT.hashCode());
		result = prime * result + ((serotherapie == null) ? 0 : serotherapie.hashCode());
		result = prime * result + ((siegeEctopie == null) ? 0 : siegeEctopie.hashCode());
		result = prime * result + ((smd == null) ? 0 : smd.hashCode());
		result = prime * result + ((sortieAplasie == null) ? 0 : sortieAplasie.hashCode());
		result = prime * result + ((sourceCellule == null) ? 0 : sourceCellule.hashCode());
		result = prime * result + ((statut == null) ? 0 : statut.hashCode());
		result = prime * result + ((strabisme == null) ? 0 : strabisme.hashCode());
		result = prime * result + ((surnumerarie == null) ? 0 : surnumerarie.hashCode());
		result = prime * result + ((survieGlobale == null) ? 0 : survieGlobale.hashCode());
		result = prime * result + ((survieJ100 == null) ? 0 : survieJ100.hashCode());
		result = prime * result + ((syndactylie == null) ? 0 : syndactylie.hashCode());
		result = prime * result + ((syndromeAnemique == null) ? 0 : syndromeAnemique.hashCode());
		result = prime * result + ((syndromeHem == null) ? 0 : syndromeHem.hashCode());
		result = prime * result + ((syndromeInf == null) ? 0 : syndromeInf.hashCode());
		result = prime * result + ((tTanner == null) ? 0 : tTanner.hashCode());
		result = prime * result + ((tacheCaf == null) ? 0 : tacheCaf.hashCode());
		result = prime * result + ((taille == null) ? 0 : taille.hashCode());
		result = prime * result + ((tailleDS == null) ? 0 : tailleDS.hashCode());
		result = prime * result + ((tailleNaiss == null) ? 0 : tailleNaiss.hashCode());
		result = prime * result + ((thorax == null) ? 0 : thorax.hashCode());
		result = prime * result + ((toxicite == null) ? 0 : toxicite.hashCode());
		result = prime * result + ((traitementCancer == null) ? 0 : traitementCancer.hashCode());
		result = prime * result + ((traitementLA == null) ? 0 : traitementLA.hashCode());
		result = prime * result + ((traitementLAM == null) ? 0 : traitementLAM.hashCode());
		result = prime * result + ((traitementSMD == null) ? 0 : traitementSMD.hashCode());
		result = prime * result + ((traitsFin == null) ? 0 : traitsFin.hashCode());
		result = prime * result + ((transformationAigue == null) ? 0 : transformationAigue.hashCode());
		result = prime * result + ((transfusion == null) ? 0 : transfusion.hashCode());
		result = prime * result + ((troubleCroi == null) ? 0 : troubleCroi.hashCode());
		result = prime * result + ((typeAnomUrin == null) ? 0 : typeAnomUrin.hashCode());
		result = prime * result + ((typeCancer == null) ? 0 : typeCancer.hashCode());
		result = prime * result + ((typeHistologique == null) ? 0 : typeHistologique.hashCode());
		result = prime * result + ((typePrelevement == null) ? 0 : typePrelevement.hashCode());
		result = prime * result + ((ubiquitination == null) ? 0 : ubiquitination.hashCode());
		result = prime * result + ((uiv == null) ? 0 : uiv.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((ventre == null) ? 0 : ventre.hashCode());
		result = prime * result + ((vergeInsuf == null) ? 0 : vergeInsuf.hashCode());
		result = prime * result + ((vgm == null) ? 0 : vgm.hashCode());
		result = prime * result + ((visage == null) ? 0 : visage.hashCode());
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
		Fiche other = (Fiche) obj;
		if (aAgeChDiag == null) {
			if (other.aAgeChDiag != null)
				return false;
		} else if (!aAgeChDiag.equals(other.aAgeChDiag))
			return false;
		if (aAgeOssDiag == null) {
			if (other.aAgeOssDiag != null)
				return false;
		} else if (!aAgeOssDiag.equals(other.aAgeOssDiag))
			return false;
		if (absenceRadial != other.absenceRadial)
			return false;
		if (adipocytes == null) {
			if (other.adipocytes != null)
				return false;
		} else if (!adipocytes.equals(other.adipocytes))
			return false;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (ageDecouverte == null) {
			if (other.ageDecouverte != null)
				return false;
		} else if (!ageDecouverte.equals(other.ageDecouverte))
			return false;
		if (ageDiagLA == null) {
			if (other.ageDiagLA != null)
				return false;
		} else if (!ageDiagLA.equals(other.ageDiagLA))
			return false;
		if (ageDiagSMD == null) {
			if (other.ageDiagSMD != null)
				return false;
		} else if (!ageDiagSMD.equals(other.ageDiagSMD))
			return false;
		if (ageE == null) {
			if (other.ageE != null)
				return false;
		} else if (!ageE.equals(other.ageE))
			return false;
		if (ageRetard == null) {
			if (other.ageRetard != null)
				return false;
		} else if (!ageRetard.equals(other.ageRetard))
			return false;
		if (ageTransf == null) {
			if (other.ageTransf != null)
				return false;
		} else if (!ageTransf.equals(other.ageTransf))
			return false;
		if (agenesiePouce != other.agenesiePouce)
			return false;
		if (agenesieRadius != other.agenesieRadius)
			return false;
		if (androDebut == null) {
			if (other.androDebut != null)
				return false;
		} else if (!androDebut.equals(other.androDebut))
			return false;
		if (androFin == null) {
			if (other.androFin != null)
				return false;
		} else if (!androFin.equals(other.androFin))
			return false;
		if (androtordyl != other.androtordyl)
			return false;
		if (anomAutDoigts != other.anomAutDoigts)
			return false;
		if (anomCardVas != other.anomCardVas)
			return false;
		if (anomDig != other.anomDig)
			return false;
		if (anomNeuro != other.anomNeuro)
			return false;
		if (anomOrteil != other.anomOrteil)
			return false;
		if (anomPouce != other.anomPouce)
			return false;
		if (anomRachis != other.anomRachis)
			return false;
		if (anomUrin != other.anomUrin)
			return false;
		if (anomalieOs != other.anomalieOs)
			return false;
		if (arbreGenealogique == null) {
			if (other.arbreGenealogique != null)
				return false;
		} else if (!arbreGenealogique.equals(other.arbreGenealogique))
			return false;
		if (arbreGenealogiqueCancer == null) {
			if (other.arbreGenealogiqueCancer != null)
				return false;
		} else if (!arbreGenealogiqueCancer.equals(other.arbreGenealogiqueCancer))
			return false;
		if (aspectPouce != other.aspectPouce)
			return false;
		if (atteinteCut != other.atteinteCut)
			return false;
		if (atteinteOss != other.atteinteOss)
			return false;
		if (atteinteTete != other.atteinteTete)
			return false;
		if (autreAndrogene == null) {
			if (other.autreAndrogene != null)
				return false;
		} else if (!autreAndrogene.equals(other.autreAndrogene))
			return false;
		if (autreAnomCong == null) {
			if (other.autreAnomCong != null)
				return false;
		} else if (!autreAnomCong.equals(other.autreAnomCong))
			return false;
		if (autreAnomDoigts == null) {
			if (other.autreAnomDoigts != null)
				return false;
		} else if (!autreAnomDoigts.equals(other.autreAnomDoigts))
			return false;
		if (autreAnomOss == null) {
			if (other.autreAnomOss != null)
				return false;
		} else if (!autreAnomOss.equals(other.autreAnomOss))
			return false;
		if (autreAnomPouce == null) {
			if (other.autreAnomPouce != null)
				return false;
		} else if (!autreAnomPouce.equals(other.autreAnomPouce))
			return false;
		if (autreAnomVerge == null) {
			if (other.autreAnomVerge != null)
				return false;
		} else if (!autreAnomVerge.equals(other.autreAnomVerge))
			return false;
		if (autreAnomalieMembreInf == null) {
			if (other.autreAnomalieMembreInf != null)
				return false;
		} else if (!autreAnomalieMembreInf.equals(other.autreAnomalieMembreInf))
			return false;
		if (autreAnomalieMembreSup == null) {
			if (other.autreAnomalieMembreSup != null)
				return false;
		} else if (!autreAnomalieMembreSup.equals(other.autreAnomalieMembreSup))
			return false;
		if (autreAnomalieNeurologique == null) {
			if (other.autreAnomalieNeurologique != null)
				return false;
		} else if (!autreAnomalieNeurologique.equals(other.autreAnomalieNeurologique))
			return false;
		if (autreAtCut == null) {
			if (other.autreAtCut != null)
				return false;
		} else if (!autreAtCut.equals(other.autreAtCut))
			return false;
		if (autreAtTete == null) {
			if (other.autreAtTete != null)
				return false;
		} else if (!autreAtTete.equals(other.autreAtTete))
			return false;
		if (autreCauseD == null) {
			if (other.autreCauseD != null)
				return false;
		} else if (!autreCauseD.equals(other.autreCauseD))
			return false;
		if (autreConditionnement == null) {
			if (other.autreConditionnement != null)
				return false;
		} else if (!autreConditionnement.equals(other.autreConditionnement))
			return false;
		if (autreEndocrinopathie == null) {
			if (other.autreEndocrinopathie != null)
				return false;
		} else if (!autreEndocrinopathie.equals(other.autreEndocrinopathie))
			return false;
		if (autreToxicite == null) {
			if (other.autreToxicite != null)
				return false;
		} else if (!autreToxicite.equals(other.autreToxicite))
			return false;
		if (autresCancers == null) {
			if (other.autresCancers != null)
				return false;
		} else if (!autresCancers.equals(other.autresCancers))
			return false;
		if (avortement == null) {
			if (other.avortement != null)
				return false;
		} else if (!avortement.equals(other.avortement))
			return false;
		if (bifide != other.bifide)
			return false;
		if (blaste == null) {
			if (other.blaste != null)
				return false;
		} else if (!blaste.equals(other.blaste))
			return false;
		if (bom != other.bom)
			return false;
		if (busulfan != other.busulfan)
			return false;
		if (cGvH != other.cGvH)
			return false;
		if (cancer != other.cancer)
			return false;
		if (cancerE != other.cancerE)
			return false;
		if (causeDeces == null) {
			if (other.causeDeces != null)
				return false;
		} else if (!causeDeces.equals(other.causeDeces))
			return false;
		if (cellularite != other.cellularite)
			return false;
		if (chelateur == null) {
			if (other.chelateur != null)
				return false;
		} else if (!chelateur.equals(other.chelateur))
			return false;
		if (chelationFer != other.chelationFer)
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (complicationPulmonaire != other.complicationPulmonaire)
			return false;
		if (congelationCellule != other.congelationCellule)
			return false;
		if (couleurPeau == null) {
			if (other.couleurPeau != null)
				return false;
		} else if (!couleurPeau.equals(other.couleurPeau))
			return false;
		if (courtsTrapus != other.courtsTrapus)
			return false;
		if (critereDiagLAM == null) {
			if (other.critereDiagLAM != null)
				return false;
		} else if (!critereDiagLAM.equals(other.critereDiagLAM))
			return false;
		if (critereDiagSMD == null) {
			if (other.critereDiagSMD != null)
				return false;
		} else if (!critereDiagSMD.equals(other.critereDiagSMD))
			return false;
		if (cyclophosphamide != other.cyclophosphamide)
			return false;
		if (danatrol != other.danatrol)
			return false;
		if (dateDiagnostique == null) {
			if (other.dateDiagnostique != null)
				return false;
		} else if (!dateDiagnostique.equals(other.dateDiagnostique))
			return false;
		if (dateEnregistrement == null) {
			if (other.dateEnregistrement != null)
				return false;
		} else if (!dateEnregistrement.equals(other.dateEnregistrement))
			return false;
		if (dateMAJ == null) {
			if (other.dateMAJ != null)
				return false;
		} else if (!dateMAJ.equals(other.dateMAJ))
			return false;
		if (dateNumSanguine == null) {
			if (other.dateNumSanguine != null)
				return false;
		} else if (!dateNumSanguine.equals(other.dateNumSanguine))
			return false;
		if (ddn == null) {
			if (other.ddn != null)
				return false;
		} else if (!ddn.equals(other.ddn))
			return false;
		if (decouverteFort != other.decouverteFort)
			return false;
		if (degConsang == null) {
			if (other.degConsang != null)
				return false;
		} else if (!degConsang.equals(other.degConsang))
			return false;
		if (delaiDiag == null) {
			if (other.delaiDiag != null)
				return false;
		} else if (!delaiDiag.equals(other.delaiDiag))
			return false;
		if (delaiRappDiag == null) {
			if (other.delaiRappDiag != null)
				return false;
		} else if (!delaiRappDiag.equals(other.delaiRappDiag))
			return false;
		if (diabete != other.diabete)
			return false;
		if (donneur == null) {
			if (other.donneur != null)
				return false;
		} else if (!donneur.equals(other.donneur))
			return false;
		if (donneurComp == null) {
			if (other.donneurComp != null)
				return false;
		} else if (!donneurComp.equals(other.donneurComp))
			return false;
		if (dos != other.dos)
			return false;
		if (doseBus == null) {
			if (other.doseBus != null)
				return false;
		} else if (!doseBus.equals(other.doseBus))
			return false;
		if (doseCyclo == null) {
			if (other.doseCyclo != null)
				return false;
		} else if (!doseCyclo.equals(other.doseCyclo))
			return false;
		if (doseFlu == null) {
			if (other.doseFlu != null)
				return false;
		} else if (!doseFlu.equals(other.doseFlu))
			return false;
		if (doseSAL == null) {
			if (other.doseSAL != null)
				return false;
		} else if (!doseSAL.equals(other.doseSAL))
			return false;
		if (doseTotaleIrr == null) {
			if (other.doseTotaleIrr != null)
				return false;
		} else if (!doseTotaleIrr.equals(other.doseTotaleIrr))
			return false;
		if (dysmyelopoiese != other.dysmyelopoiese)
			return false;
		if (echo != other.echo)
			return false;
		if (echoCoeur != other.echoCoeur)
			return false;
		if (ectopTest == null) {
			if (other.ectopTest != null)
				return false;
		} else if (!ectopTest.equals(other.ectopTest))
			return false;
		if (electrophoreseHb != other.electrophoreseHb)
			return false;
		if (empreinteDigitiforme != other.empreinteDigitiforme)
			return false;
		if (endocrinopathie != other.endocrinopathie)
			return false;
		if (enqueteFam != other.enqueteFam)
			return false;
		if (enqueteHLA != other.enqueteHLA)
			return false;
		if (erythroblaste == null) {
			if (other.erythroblaste != null)
				return false;
		} else if (!erythroblaste.equals(other.erythroblaste))
			return false;
		if (evolution_cyto != other.evolution_cyto)
			return false;
		if (excesBlastes != other.excesBlastes)
			return false;
		if (facieTrig != other.facieTrig)
			return false;
		if (fludarabine != other.fludarabine)
			return false;
		if (formuleChrom == null) {
			if (other.formuleChrom != null)
				return false;
		} else if (!formuleChrom.equals(other.formuleChrom))
			return false;
		if (gradeaGvH != other.gradeaGvH)
			return false;
		if (granuleux == null) {
			if (other.granuleux != null)
				return false;
		} else if (!granuleux.equals(other.granuleux))
			return false;
		if (greffeFaite != other.greffeFaite)
			return false;
		if (groupComp == null) {
			if (other.groupComp != null)
				return false;
		} else if (!groupComp.equals(other.groupComp))
			return false;
		if (hb == null) {
			if (other.hb != null)
				return false;
		} else if (!hb.equals(other.hb))
			return false;
		if (hbInf != other.hbInf)
			return false;
		if (hbf == null) {
			if (other.hbf != null)
				return false;
		} else if (!hbf.equals(other.hbf))
			return false;
		if (hyperPig != other.hyperPig)
			return false;
		if (hypoEminence != other.hypoEminence)
			return false;
		if (hypoPouce != other.hypoPouce)
			return false;
		if (hypoacousie != other.hypoacousie)
			return false;
		if (hypochromique != other.hypochromique)
			return false;
		if (hypothyroidie != other.hypothyroidie)
			return false;
		if (hypotrophie != other.hypotrophie)
			return false;
		if (insulinoDep != other.insulinoDep)
			return false;
		if (irradiation == null) {
			if (other.irradiation != null)
				return false;
		} else if (!irradiation.equals(other.irradiation))
			return false;
		if (labo == null) {
			if (other.labo != null)
				return false;
		} else if (!labo.equals(other.labo))
			return false;
		if (lam != other.lam)
			return false;
		if (lch != other.lch)
			return false;
		if (leuco == null) {
			if (other.leuco != null)
				return false;
		} else if (!leuco.equals(other.leuco))
			return false;
		if (localisation == null) {
			if (other.localisation != null)
				return false;
		} else if (!localisation.equals(other.localisation))
			return false;
		if (mAgeChDiag == null) {
			if (other.mAgeChDiag != null)
				return false;
		} else if (!mAgeChDiag.equals(other.mAgeChDiag))
			return false;
		if (mAgeOssDiag == null) {
			if (other.mAgeOssDiag != null)
				return false;
		} else if (!mAgeOssDiag.equals(other.mAgeOssDiag))
			return false;
		if (mTanner == null) {
			if (other.mTanner != null)
				return false;
		} else if (!mTanner.equals(other.mTanner))
			return false;
		if (malUro != other.malUro)
			return false;
		if (megacaryocytes != other.megacaryocytes)
			return false;
		if (membreInf != other.membreInf)
			return false;
		if (membreSup != other.membreSup)
			return false;
		if (microcephalie != other.microcephalie)
			return false;
		if (microphtalmie != other.microphtalmie)
			return false;
		if (morphologieEryth != other.morphologieEryth)
			return false;
		if (morphologieGran != other.morphologieGran)
			return false;
		if (morphologieMega != other.morphologieMega)
			return false;
		if (mortNe == null) {
			if (other.mortNe != null)
				return false;
		} else if (!mortNe.equals(other.mortNe))
			return false;
		if (mutationFANC == null) {
			if (other.mutationFANC != null)
				return false;
		} else if (!mutationFANC.equals(other.mutationFANC))
			return false;
		if (mvo != other.mvo)
			return false;
		if (myelogramme != other.myelogramme)
			return false;
		if (nDossierFiche == null) {
			if (other.nDossierFiche != null)
				return false;
		} else if (!nDossierFiche.equals(other.nDossierFiche))
			return false;
		if (nbCG != other.nbCG)
			return false;
		if (nbCP != other.nbCP)
			return false;
		if (nbCousin == null) {
			if (other.nbCousin != null)
				return false;
		} else if (!nbCousin.equals(other.nbCousin))
			return false;
		if (nbFratNTyp == null) {
			if (other.nbFratNTyp != null)
				return false;
		} else if (!nbFratNTyp.equals(other.nbFratNTyp))
			return false;
		if (nbFratTyp == null) {
			if (other.nbFratTyp != null)
				return false;
		} else if (!nbFratTyp.equals(other.nbFratTyp))
			return false;
		if (nbMembre == null) {
			if (other.nbMembre != null)
				return false;
		} else if (!nbMembre.equals(other.nbMembre))
			return false;
		if (nbMort == null) {
			if (other.nbMort != null)
				return false;
		} else if (!nbMort.equals(other.nbMort))
			return false;
		if (nbVivant == null) {
			if (other.nbVivant != null)
				return false;
		} else if (!nbVivant.equals(other.nbVivant))
			return false;
		if (nilevar != other.nilevar)
			return false;
		if (nombreTacheCafe == null) {
			if (other.nombreTacheCafe != null)
				return false;
		} else if (!nombreTacheCafe.equals(other.nombreTacheCafe))
			return false;
		if (nombreTacheHypo == null) {
			if (other.nombreTacheHypo != null)
				return false;
		} else if (!nombreTacheHypo.equals(other.nombreTacheHypo))
			return false;
		if (observance == null) {
			if (other.observance != null)
				return false;
		} else if (!observance.equals(other.observance))
			return false;
		if (oxynethadone != other.oxynethadone)
			return false;
		if (pTanner == null) {
			if (other.pTanner != null)
				return false;
		} else if (!pTanner.equals(other.pTanner))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		if (performanceScolaire != other.performanceScolaire)
			return false;
		if (petitRein == null) {
			if (other.petitRein != null)
				return false;
		} else if (!petitRein.equals(other.petitRein))
			return false;
		if (placeEnfant == null) {
			if (other.placeEnfant != null)
				return false;
		} else if (!placeEnfant.equals(other.placeEnfant))
			return false;
		if (plq == null) {
			if (other.plq != null)
				return false;
		} else if (!plq.equals(other.plq))
			return false;
		if (plq_inf != other.plq_inf)
			return false;
		if (pnn == null) {
			if (other.pnn != null)
				return false;
		} else if (!pnn.equals(other.pnn))
			return false;
		if (pnnInf != other.pnnInf)
			return false;
		if (poids == null) {
			if (other.poids != null)
				return false;
		} else if (!poids.equals(other.poids))
			return false;
		if (poidsDS == null) {
			if (other.poidsDS != null)
				return false;
		} else if (!poidsDS.equals(other.poidsDS))
			return false;
		if (poidsNaiss == null) {
			if (other.poidsNaiss != null)
				return false;
		} else if (!poidsNaiss.equals(other.poidsNaiss))
			return false;
		if (pouceBas != other.pouceBas)
			return false;
		if (pourquoiEnqHLA == null) {
			if (other.pourquoiEnqHLA != null)
				return false;
		} else if (!pourquoiEnqHLA.equals(other.pourquoiEnqHLA))
			return false;
		if (pourquoiNfaite == null) {
			if (other.pourquoiNfaite != null)
				return false;
		} else if (!pourquoiNfaite.equals(other.pourquoiNfaite))
			return false;
		if (preciseAnomCardio == null) {
			if (other.preciseAnomCardio != null)
				return false;
		} else if (!preciseAnomCardio.equals(other.preciseAnomCardio))
			return false;
		if (preciseAnomDig == null) {
			if (other.preciseAnomDig != null)
				return false;
		} else if (!preciseAnomDig.equals(other.preciseAnomDig))
			return false;
		if (preciseAnomOrt == null) {
			if (other.preciseAnomOrt != null)
				return false;
		} else if (!preciseAnomOrt.equals(other.preciseAnomOrt))
			return false;
		if (preciseAnomRac == null) {
			if (other.preciseAnomRac != null)
				return false;
		} else if (!preciseAnomRac.equals(other.preciseAnomRac))
			return false;
		if (preciseCompPulm == null) {
			if (other.preciseCompPulm != null)
				return false;
		} else if (!preciseCompPulm.equals(other.preciseCompPulm))
			return false;
		if (preciseDonneur == null) {
			if (other.preciseDonneur != null)
				return false;
		} else if (!preciseDonneur.equals(other.preciseDonneur))
			return false;
		if (preciseTraitement == null) {
			if (other.preciseTraitement != null)
				return false;
		} else if (!preciseTraitement.equals(other.preciseTraitement))
			return false;
		if (radiosFaites == null) {
			if (other.radiosFaites != null)
				return false;
		} else if (!radiosFaites.equals(other.radiosFaites))
			return false;
		if (reinEctop != other.reinEctop)
			return false;
		if (reinFerChev != other.reinFerChev)
			return false;
		if (reinUnique != other.reinUnique)
			return false;
		if (resUbiquitination != other.resUbiquitination)
			return false;
		if (retardMent != other.retardMent)
			return false;
		if (retardPubertaire != other.retardPubertaire)
			return false;
		if (retic == null) {
			if (other.retic != null)
				return false;
		} else if (!retic.equals(other.retic))
			return false;
		if (sal != other.sal)
			return false;
		if (score != other.score)
			return false;
		if (scoreClinique == null) {
			if (other.scoreClinique != null)
				return false;
		} else if (!scoreClinique.equals(other.scoreClinique))
			return false;
		if (scoreEBMT == null) {
			if (other.scoreEBMT != null)
				return false;
		} else if (!scoreEBMT.equals(other.scoreEBMT))
			return false;
		if (serotherapie != other.serotherapie)
			return false;
		if (siegeEctopie == null) {
			if (other.siegeEctopie != null)
				return false;
		} else if (!siegeEctopie.equals(other.siegeEctopie))
			return false;
		if (smd != other.smd)
			return false;
		if (sortieAplasie == null) {
			if (other.sortieAplasie != null)
				return false;
		} else if (!sortieAplasie.equals(other.sortieAplasie))
			return false;
		if (sourceCellule == null) {
			if (other.sourceCellule != null)
				return false;
		} else if (!sourceCellule.equals(other.sourceCellule))
			return false;
		if (statut != other.statut)
			return false;
		if (strabisme != other.strabisme)
			return false;
		if (surnumerarie != other.surnumerarie)
			return false;
		if (survieGlobale == null) {
			if (other.survieGlobale != null)
				return false;
		} else if (!survieGlobale.equals(other.survieGlobale))
			return false;
		if (survieJ100 != other.survieJ100)
			return false;
		if (syndactylie != other.syndactylie)
			return false;
		if (syndromeAnemique != other.syndromeAnemique)
			return false;
		if (syndromeHem != other.syndromeHem)
			return false;
		if (syndromeInf != other.syndromeInf)
			return false;
		if (tTanner == null) {
			if (other.tTanner != null)
				return false;
		} else if (!tTanner.equals(other.tTanner))
			return false;
		if (tacheCaf != other.tacheCaf)
			return false;
		if (taille == null) {
			if (other.taille != null)
				return false;
		} else if (!taille.equals(other.taille))
			return false;
		if (tailleDS == null) {
			if (other.tailleDS != null)
				return false;
		} else if (!tailleDS.equals(other.tailleDS))
			return false;
		if (tailleNaiss == null) {
			if (other.tailleNaiss != null)
				return false;
		} else if (!tailleNaiss.equals(other.tailleNaiss))
			return false;
		if (thorax != other.thorax)
			return false;
		if (toxicite != other.toxicite)
			return false;
		if (traitementCancer != other.traitementCancer)
			return false;
		if (traitementLA != other.traitementLA)
			return false;
		if (traitementLAM == null) {
			if (other.traitementLAM != null)
				return false;
		} else if (!traitementLAM.equals(other.traitementLAM))
			return false;
		if (traitementSMD == null) {
			if (other.traitementSMD != null)
				return false;
		} else if (!traitementSMD.equals(other.traitementSMD))
			return false;
		if (traitsFin != other.traitsFin)
			return false;
		if (transformationAigue != other.transformationAigue)
			return false;
		if (transfusion != other.transfusion)
			return false;
		if (troubleCroi != other.troubleCroi)
			return false;
		if (typeAnomUrin == null) {
			if (other.typeAnomUrin != null)
				return false;
		} else if (!typeAnomUrin.equals(other.typeAnomUrin))
			return false;
		if (typeCancer == null) {
			if (other.typeCancer != null)
				return false;
		} else if (!typeCancer.equals(other.typeCancer))
			return false;
		if (typeHistologique == null) {
			if (other.typeHistologique != null)
				return false;
		} else if (!typeHistologique.equals(other.typeHistologique))
			return false;
		if (typePrelevement == null) {
			if (other.typePrelevement != null)
				return false;
		} else if (!typePrelevement.equals(other.typePrelevement))
			return false;
		if (ubiquitination != other.ubiquitination)
			return false;
		if (uiv != other.uiv)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (ventre != other.ventre)
			return false;
		if (vergeInsuf == null) {
			if (other.vergeInsuf != null)
				return false;
		} else if (!vergeInsuf.equals(other.vergeInsuf))
			return false;
		if (vgm == null) {
			if (other.vgm != null)
				return false;
		} else if (!vgm.equals(other.vgm))
			return false;
		if (visage != other.visage)
			return false;
		return true;
	}

}
