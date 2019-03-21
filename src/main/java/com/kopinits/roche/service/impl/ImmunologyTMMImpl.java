package com.kopinits.roche.service.impl;

import org.springframework.stereotype.Service;

import com.kopinits.roche.domain.Immunology;

@Service
public class ImmunologyTMMImpl extends AbstractTestManagerModuleImpl<Immunology> {

	@Override
	protected boolean executeSpecificTests(Immunology object) {
		return object.getSpecificPropA() > object.getSpecificPropB();
	}

}
