package com.adapter.current;

public class TextFormattterImpl implements TextFormatInterf{

	@Override
	public String formatText(String text) {
		String formattedText= text.replace(".", "\n");
		return formattedText;
	}

	
}
