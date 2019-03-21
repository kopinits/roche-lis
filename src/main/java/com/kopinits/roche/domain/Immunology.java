package com.kopinits.roche.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Immunology extends CommonTestSuite {
	private int specificPropA;
	private int specificPropB;
}
