package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class HtmlDomGrpElement implements IRender {
	private String tagName;
	private List<IRender> childrenTag;

	public HtmlDomGrpElement(String tagName) {
		this.tagName = tagName;
		this.childrenTag = new ArrayList<>();
	}

	@Override
	public String getTagName() {
		return tagName;
	}

	public void addChildTag(IRender htmlTag) {
		childrenTag.add(htmlTag);
	}

	public void removeChildTag(IRender htmlTag) {
		childrenTag.remove(htmlTag);
	}

	public List<IRender> getChildren() {
		return childrenTag;
	}

	@Override
	public String render() {
		String dom = " ";
		System.out.println("<" + tagName + ">");
		dom = "<" + tagName + ">";
		for (IRender tag : childrenTag) {
			dom += tag.render();
		}
		dom += "\n"+"</" + tagName + ">";
		return dom;
	}

}
