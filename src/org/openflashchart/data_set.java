package org.openflashchart;

import java.util.List;


public abstract class data_set {
	abstract String toString(String outputType, String number);
	//TODO it actually repeat-class of Graph.implode; refact needed
	String implode(String glue, List<String> array) {
		StringBuilder sb = new StringBuilder();
		for (String element : array) {
			if (sb.length()>0) sb.append(glue);
			sb.append(element);
		}
		return sb.toString();
	}
}