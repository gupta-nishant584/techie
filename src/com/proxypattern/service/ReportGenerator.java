package com.proxypattern.service;

public interface ReportGenerator {
	
	public void displayReportTemplate(String reportTemplate);
	public void generateComplexReport(String reportTemplate);
	public void generateSensitiveReport();

}
