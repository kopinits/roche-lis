package com.kopinits.roche.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode
@SuperBuilder
@AllArgsConstructor
public class CommonTestSuite {
	private int commonPropA;
	private int commonPropB;
}
