package com.kopinits.roche.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Hematology extends CommonTestSuite {
	private double specificPropA;
	private double specificPropB;
}
