package com.proxypattern.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.proxypattern.model.Role;
import com.proxypattern.service.ReportGeneratorProxyImpl;

class ReportGeneratorProxyImplTest {

	@Test
	void test() {
		Role role = new Role();
		role.setRole("Manager");
		ReportGeneratorProxyImpl reportGenerator = new ReportGeneratorProxyImpl(role);
		reportGenerator.displayReportTemplate("pdf");
		reportGenerator.generateComplexReport("pdf");
		reportGenerator.generateSensitiveReport();	
	}
}
