package com.spring.lesson4_1;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class PropertyCondition implements ConfigurationCondition {

	public boolean matches(ConditionContext context,
			AnnotatedTypeMetadata metadata) {
		return Boolean.valueOf(context.getEnvironment().getProperty("enable.dev"));
	}

	public ConfigurationPhase getConfigurationPhase() {
		return ConfigurationPhase.REGISTER_BEAN;
	}

}
