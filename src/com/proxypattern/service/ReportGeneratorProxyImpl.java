package com.proxypattern.service;

import com.proxypattern.model.Role;

public class ReportGeneratorProxyImpl implements ReportGenerator {
	ReportGenerator reportGenerator;
	Role role;

	public ReportGeneratorProxyImpl(Role role) {
		this.role = role;
	}

	@Override
	public void displayReportTemplate(String reportTemplate) {
		System.out.println("ReportGeneratorProxyImpl: Displaying blank report in template: "+reportTemplate+"");
		
	}

	@Override
	public void generateComplexReport(String reportTemplate) {
		
		if(reportGenerator == null) {
			reportGenerator = new ReportGeneratorImpl();
			reportGenerator.generateComplexReport(reportTemplate);
		}
	}

	@Override
	public void generateSensitiveReport() {
		if(role.getRole().equals("Manager")) {
			if(reportGenerator == null) {
				reportGenerator = new ReportGeneratorImpl();
				reportGenerator.generateSensitiveReport();
			}else {
				reportGenerator.generateSensitiveReport();
			}
		}else {
			System.out.println("Permission denied !!! Not Authorized to access sensitive reports. !!! ");
		}
		
	}
	
	

}
