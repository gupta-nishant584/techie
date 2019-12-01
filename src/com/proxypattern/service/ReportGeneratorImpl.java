package com.proxypattern.service;

public class ReportGeneratorImpl implements ReportGenerator {

	@Override
	public void displayReportTemplate(String reportTemplate) {
		//ProxyImpl will provide the implementation of this method.
	}

	@Override
	public void generateComplexReport(String reportTemplate) {
		System.out.println("ReportGeneratorImpl: Generating complex report in "+reportTemplate+"");

	}

	@Override
	public void generateSensitiveReport() {
		System.out.println("ReportGeneratorImpl: Generating sensitive report");

	}
}
