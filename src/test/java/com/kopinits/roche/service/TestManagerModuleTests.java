package com.kopinits.roche.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kopinits.roche.LISApplication;
import com.kopinits.roche.domain.Biochemistry;
import com.kopinits.roche.domain.Immunology;
import com.kopinits.roche.domain.Microbiology;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = LISApplication.class)
public class TestManagerModuleTests {

	@Autowired
	AbstractTestManagerModule<Biochemistry> biochemistryService;
	
	@Autowired
	AbstractTestManagerModule<Immunology> immunologyService;
	
	@Autowired
	AbstractTestManagerModule<Microbiology> microbiologyService;

	@Test
	public void testBiochemistrySpecificTest() {
		Biochemistry build = Biochemistry.builder()
				.specificPropA("SampleData1")
				.specificPropB("SampleData2")
				.commonPropA(1)
				.commonPropB(2)
				.build();
		assertFalse(biochemistryService.executeTest(build));
	}

	@Test
	public void testBiochemistrySpecificTest2() {
		Biochemistry build = Biochemistry.builder()
				.specificPropA("SampleData")
				.specificPropB("SampleData")
				.commonPropA(1)
				.commonPropB(2)
				.build();
		assertTrue(biochemistryService.executeTest(build));
	}
	
	@Test
	public void testBiochemistryCommonTest() {
		Biochemistry build = Biochemistry.builder()
				.specificPropA("SampleData1")
				.specificPropB("SampleData2")
				.commonPropA(1)
				.commonPropB(1)
				.build();
		assertTrue(biochemistryService.executeTest(build));
	}
	
	@Test
	public void testImmunologySpecificTest() {
		Immunology build = Immunology.builder()
				.specificPropA(10)
				.specificPropB(20)
				.commonPropA(1)
				.commonPropB(2)
				.build();
		assertFalse(immunologyService.executeTest(build));
	}
	
	@Test
	public void testMicrobiologySpecificTest() {
		Microbiology build = Microbiology.builder()
				.specificPropA(10)
				.specificPropB(20)
				.commonPropA(1)
				.commonPropB(2)
				.build();
		assertTrue(microbiologyService.executeTest(build));
	}
}
