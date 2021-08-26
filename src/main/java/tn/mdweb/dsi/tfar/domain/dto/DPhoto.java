package tn.mdweb.dsi.tfar.domain.dto;

import java.io.Serializable;
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
public class DPhoto {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private ConnectionDTO connection;
	private byte [] photo;
	private String pName;

	

	
	
	
	
}
