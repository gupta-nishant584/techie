package com.adapter.codetoplug;

public class CsvFormatterImpl implements CsvFormatInterf {

	@Override
	public String formatCsv(String text) {
		String formattedText = text.replace(".", ",");
		return formattedText;
	}
}
