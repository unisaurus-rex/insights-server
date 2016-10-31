package com.vantiv.insights.config;

import org.springframework.util.AntPathMatcher;

import java.util.Map;

/**
 * Enable Case Insensitive Path Match
 */
public class CaseInsensitivePathMatcher extends AntPathMatcher {

    @Override
    protected boolean doMatch(String pattern, String path, boolean fullMatch, Map<String, String> uriTemplateVariables) {
        return super.doMatch(pattern.toLowerCase(), path.toLowerCase(), fullMatch, uriTemplateVariables);
    }
}
