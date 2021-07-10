package tn.mdweb.dsi.tfar.domain.dto;

import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
public class FicheDto {
	
	private Long idFiche;
	
	@NotNull
	private String nDossierFiche;

	private Date dateDiagnostique;

	private Date dateEnregistrement;

	private String degConsang;

	private Long placeEnfant;

	private Long nbVivant;

	private Long nbMort;

	private Long mortNe;

	private Long avortement;

	private Long nbCousin;

	private Long nbMembre;

	private String arbreGenealogique;

	private String arbreGenealogiqueCancer;

	private Enum1 syndromeAnemique;

	private Enum1 syndromeHem;

	private Enum1 syndromeInf;

	private Enum1 decouverteFort;

	private Enum1 enqueteFam;

	private String typeCancer;

	private Enum1 cancer;

	private Double tailleNaiss;

	private Double poidsNaiss;

	private Enum1 hypotrophie;

	private Enum1 troubleCroi;

	private Long aAgeChDiag;

	private Long mAgeChDiag;

	private Long aAgeOssDiag;

	private Long mAgeOssDiag;

	private Long ageRetard;

	private Double poids;

	private String poidsDS;

	private Double taille;

	private String tailleDS;

	private Enum1 atteinteCut;

	private Enum1 tacheCaf;

	private Enum1 ventre;

	private Enum1 membreSup;

	private Enum1 membreInf;

	private Enum1 visage;

	private Enum1 thorax;

	private Enum1 dos;

	private Enum1 hyperPig;

	private Enum1 hypochromique;

	private String couleurPeau;

	private String autreAtCut;

	private Enum1 atteinteTete;

	private Enum1 microcephalie;

	private Enum1 microphtalmie;

	private Enum1 facieTrig;

	private Enum1 traitsFin;

	private String autreAtTete;

	private Enum1 empreinteDigitiforme;

	private Enum1 malUro;

	private Enum2 uiv;

	private Enum2 echo;

	private Enum1 reinEctop;

	private String siegeEctopie;

	private Enum1 reinFerChev;

	private String petitRein;

	private Enum1 reinUnique;

	private String ectopTest;

	private String vergeInsuf;

	private String autreAnomVerge;

	private Enum1 retardPubertaire;

	private String mTanner;

	private String pTanner;

	private String tTanner;

	private Enum1 anomUrin;

	private String typeAnomUrin;

	private Enum1 atteinteOss;

	private String radiosFaites;

	private Enum1 anomPouce;

	private Enum1 surnumerarie;

	private Enum1 agenesiePouce;

	private Enum1 bifide;

	private Enum1 hypoPouce;

	private Enum1 aspectPouce;

	private Enum1 hypoEminence;

	private Enum1 absenceRadial;

	private Enum1 pouceBas;

	private String autreAnomPouce;

	private Enum1 anomAutDoigts;

	private Enum1 courtsTrapus;

	private Enum1 syndactylie;

	private String autreAnomDoigts;

	private Enum1 anomalieOs;

	private Enum1 agenesieRadius;

	private String autreAnomalieMembreSup;

	private Enum1 anomOrteil;

	private String preciseAnomOrt;

	private Enum1 lch;

	private String autreAnomalieMembreInf;

	private Enum1 anomRachis;

	private String preciseAnomRac;

	private String autreAnomOss;

	private Enum1 anomNeuro;

	private Enum1 retardMent;

	private Enum1 hypoacousie;

	private Enum1 strabisme;

	private Enum3 performanceScolaire;

	private String autreAnomalieNeurologique;

	private Enum1 anomCardVas;

	private Enum1 echoCoeur;

	private String preciseAnomCardio;

	private Enum1 anomDig;

	private String preciseAnomDig;

	private Enum1 endocrinopathie;

	private Enum1 diabete;

	private Enum1 insulinoDep;

	private Enum1 hypothyroidie;

	private Long ageDecouverte;

	private String autreEndocrinopathie;

	private String autreAnomCong;

	private Date dateNumSanguine;

	private Long age;

	private Double hb;

	private Double vgm;

	private Double retic;

	private Double leuco;

	private Double pnn;

	private Double plq;

	private Enum1 hbInf;

	private Enum1 plq_inf;

	private Enum1 pnnInf;

	private Enum2 electrophoreseHb;

	private Double hbf;

	private Enum2 myelogramme;

	private Enum4 cellularite;

	private Double erythroblaste;

	private Enum5 morphologieEryth;

	private Enum5 morphologieGran;

	private Enum5 morphologieMega;

	private Double granuleux;

	private Enum1 dysmyelopoiese;

	private Enum4 megacaryocytes;

	private Double blaste;

	private Enum1 excesBlastes;

	private Enum6 bom;

	private Double adipocytes;

	private Enum1 ubiquitination;

	private Enum7 resUbiquitination;

	private String groupComp;

	private String mutationFANC;

	private Enum2 congelationCellule;

	private String labo;

	private String typePrelevement;

	private Long scoreClinique;

	private Long scoreEBMT;

	private Score score;

	private Enum1 transfusion;

	private Long ageTransf;

	private Double delaiDiag;

	private Enum8 nbCG;

	private Enum8 nbCP;

	private Enum1 chelationFer;

	private String chelateur;

	private Enum1 nilevar;

	private Enum1 danatrol;

	private Enum1 oxynethadone;

	private Enum1 androtordyl;

	private String autreAndrogene;

	private Date androDebut;

	private Date androFin;

	private String observance;

	private Toxicite toxicite;

	private String autreToxicite;

	private Enum1 enqueteHLA;

	private String pourquoiEnqHLA;

	private Long nbFratTyp;

	private Long nbFratNTyp;

	private Long donneurComp;

	private String preciseDonneur;

	private String donneur;

	private Enum1 greffeFaite;

	private Double delaiRappDiag;

	private String pourquoiNfaite;

	private Enum1 cyclophosphamide;

	private Enum1 fludarabine;

	private Enum1 busulfan;

	private Double doseCyclo;

	private Double doseFlu;

	private Double doseBus;

	private String autreConditionnement;

	private String irradiation;

	private Double doseTotaleIrr;

	private Enum2 serotherapie;

	private Enum1 sal;

	private Double doseSAL;

	private String sourceCellule;

	private Long sortieAplasie;

	private Enum9 gradeaGvH;

	private Enum10 cGvH;

	private Enum1 mvo;

	private Enum1 complicationPulmonaire;

	private String preciseCompPulm;

	private Enum1 survieJ100;

	private Enum1 smd;

	private Long ageDiagSMD;

	private String critereDiagSMD;

	private String traitementSMD;

	private Enum1 lam;

	private String critereDiagLAM;

	private String traitementLAM;

	private String autresCancers;

	private Date ddn;

	private Enum11 transformationAigue;

	private Long ageDiagLA;

	private Enum1 traitementLA;

	private Enum1 cancerE;

	private String localisation;

	private String typeHistologique;

	private Enum1 traitementCancer;

	private String preciseTraitement;

	private Enum1 evolution_cyto;

	private String formuleChrom;

	private Long ageE;

	private Statut statut;

	private String causeDeces;

	private String autreCauseD;

	private Double survieGlobale;

	private Long code;

	private Date dateMAJ;

	private Long nombreTacheCafe;

	private Long nombreTacheHypo;
	
	private Long codeUser;


}
