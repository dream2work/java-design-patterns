package com.dream2work.structural.facade.email;

import com.dream2work.structural.facade.email.Template.TemplateType;

public class TemplateFactory {

	public static Template createTemplateFor(TemplateType type) {
		switch (type) {
		case Email:
			return new OrderEmailTemplate();
		default:
			throw new IllegalArgumentException("Unknown TemplateType");
		}
		
	}
}
