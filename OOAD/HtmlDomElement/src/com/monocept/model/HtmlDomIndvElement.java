package com.monocept.model;

public class HtmlDomIndvElement implements IRender {
	private String tagName;
	private String type;
	private String value;

	public HtmlDomIndvElement(String tagName, String type, String value) {
		this.tagName = tagName;
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String render() {
		String dom = " ";
		dom  ="\n  " + "<" + getTagName() + " type = " + getType() + " value= " + getValue() + "/>";
		return dom;
	}

	@Override
	public String getTagName() {
		return tagName;
	}

}
