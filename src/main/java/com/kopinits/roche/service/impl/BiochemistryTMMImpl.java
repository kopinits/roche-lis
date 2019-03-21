package com.kopinits.roche.service.impl;

import org.springframework.stereotype.Service;

import com.kopinits.roche.domain.Biochemistry;

@Service
public class BiochemistryTMMImpl extends AbstractTestManagerModuleImpl<Biochemistry> {

	@Override
	protected boolean executeSpecificTests(Biochemistry object) {
		return object.getSpecificPropA().equals(object.getSpecificPropB());
	}

}
