package com.kopinits.roche.service;

import com.kopinits.roche.domain.CommonTestSuite;

public interface AbstractTestManagerModule<T extends CommonTestSuite> {
	abstract boolean executeTest(T object);
	
}
