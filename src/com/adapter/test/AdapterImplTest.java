package com.adapter.test;


import org.junit.jupiter.api.Test;

import com.adapter.codetoplug.CsvFormatInterf;
import com.adapter.codetoplug.CsvFormatterImpl;
import com.adapter.current.TextFormatInterf;
import com.adapter.current.TextFormattterImpl;
import com.adapter.impl.CsvAdapterImpl;

class AdapterImplTest {

	@Test
	void test() {
		String testString ="Formatting line 1. Formatting line 2. Formatting line 3.";
		TextFormatInterf textFormatInterf = new TextFormattterImpl();
		String resultString = textFormatInterf.formatText(testString);
		System.out.println(resultString);
		
		TextFormatInterf csvAdapter = new CsvAdapterImpl(new CsvFormatterImpl());
		String resultCsvString = csvAdapter.formatText(testString);
		System.out.println(resultCsvString);
	}

}
