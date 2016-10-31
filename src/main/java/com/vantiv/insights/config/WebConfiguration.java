package com.vantiv.insights.config;

import com.vantiv.insights.interceptor.LoggingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.PathMatcher;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * Houses project config beans
 */
@Configuration
@ComponentScan(basePackages = "com.vantiv.insights")
public class WebConfiguration extends WebMvcConfigurationSupport {

    /**
     * pathMatcher
     * <p>
     * </p>
     * <p>
     * Used for case insensitive path matching
     *
     * @return new CaseInsensitivePathMatcher
     */
    @Bean
    public PathMatcher pathMatcher() {
        return new CaseInsensitivePathMatcher();
    }

    /**
     * requestMappingHandlerMapping
     * <p>
     * </p>
     * <p>
     * Used to override the pathMatcher behavior with case insensitive path matcher
     *
     * @return RequestMappingHandlerMapping for case insensitive request mapping
     */
    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        RequestMappingHandlerMapping handlerMapping = new RequestMappingHandlerMapping();
        handlerMapping.setOrder(0);
        handlerMapping.setInterceptors(getInterceptors());
        handlerMapping.setPathMatcher(pathMatcher());
        return handlerMapping;
    }

    /**
     * addInterceptors
     * </p>
     * Add any project specific route interceptors
     *
     * @param registry - exisiting InterceptorRegistry that we will add project specific interceptor to
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoggingInterceptor());
    }

}
