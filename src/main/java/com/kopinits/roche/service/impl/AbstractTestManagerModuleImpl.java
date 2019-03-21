package com.kopinits.roche.service.impl;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import com.kopinits.roche.domain.CommonTestSuite;
import com.kopinits.roche.service.AbstractTestManagerModule;

@Service
public abstract class AbstractTestManagerModuleImpl<T extends CommonTestSuite> implements AbstractTestManagerModule<T> {

	
	protected abstract boolean executeSpecificTests(T object);
	
	@Override
	public boolean executeTest(T object) {
		if (NumberUtils.compare(object.getCommonPropA(), object.getCommonPropB()) == 0) {
			return true;
		}else {
			return executeSpecificTests(object);	
		}
	}
}
