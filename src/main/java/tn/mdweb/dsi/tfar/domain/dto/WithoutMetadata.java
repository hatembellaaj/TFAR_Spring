package tn.mdweb.dsi.tfar.domain.dto;

import java.lang.annotation.Retention;
import org.mapstruct.Mapping;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@Mapping(target = "patient", ignore = true)
@Mapping(target = "androgene", ignore = true)
@Mapping(target = "cousin", ignore = true)
@Mapping(target = "frere", ignore = true)
@Mapping(target = "cytogenetique", ignore = true)
public @interface WithoutMetadata { }
