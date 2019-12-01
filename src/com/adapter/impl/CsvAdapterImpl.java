package com.adapter.impl;

import com.adapter.codetoplug.CsvFormatInterf;
import com.adapter.current.TextFormatInterf;

public class CsvAdapterImpl implements TextFormatInterf {

	CsvFormatInterf csvFormatInterf;
	
	public CsvAdapterImpl(CsvFormatInterf csvFormatInterf){
		this.csvFormatInterf=csvFormatInterf;
	}
	
	@Override
	public String formatText(String text) {
		String formattedText = csvFormatInterf.formatCsv(text);
		return formattedText;
	}
}
