package com.kopinits.roche.service.impl;

import org.springframework.stereotype.Service;

import com.kopinits.roche.domain.Hematology;

@Service
public class HematologyTMMImpl extends AbstractTestManagerModuleImpl<Hematology> {

	@Override
	protected boolean executeSpecificTests(Hematology object) {
		return object.getSpecificPropA() > object.getSpecificPropB();
	}

}
