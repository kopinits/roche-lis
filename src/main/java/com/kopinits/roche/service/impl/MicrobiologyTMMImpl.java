package com.kopinits.roche.service.impl;

import org.springframework.stereotype.Service;

import com.kopinits.roche.domain.Microbiology;

@Service
public class MicrobiologyTMMImpl extends AbstractTestManagerModuleImpl<Microbiology> {

	@Override
	protected boolean executeSpecificTests(Microbiology object) {
		return object.getSpecificPropA() < object.getSpecificPropB();
	}

}
