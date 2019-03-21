package com.kopinits.roche.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Biochemistry extends CommonTestSuite {
	private String specificPropA;
	private String specificPropB;
}
