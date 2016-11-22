package com.vantiv.insights.config;

import com.vantiv.insights.interceptor.LoggingInterceptor;
import com.vantiv.insights.model.BS.BSDAO;
import com.vantiv.insights.model.BS.BSDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.util.PathMatcher;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.sql.DataSource;

/**
 * Houses project config beans
 */
@Configuration
@ComponentScan(basePackages = "com.vantiv.insights")
public class WebConfiguration extends WebMvcConfigurationSupport {

    /**
     * pathMatcher
     * </p>
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
     * </p>
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
     * getDataSource
     * <p/>
     * Configure DataSource for Insights SQL DB - is the DB connection
     */
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");  // db2 - "com.ibm.db2.jcc.DB2Driver" // oracle - "oracle.jdbc.driver.OracleDriver"
        dataSource.setUrl("jdbc:mysql://localhost:3306/insightsDB");
        dataSource.setUsername("root");     // TODO move somewhere secure, look into encrypted .properties members
        dataSource.setPassword("password"); // TODO move somewhere secure

        return dataSource;
    }

    /**
     * Creates our BSDAO when needed
     *
     * @return BSDAO - a new Insights DB, BS Table Data Access Object
     */
    @Bean
    public BSDAO getBSDAO() {
        return new BSDAOImpl(getDataSource());
    }

//    @Bean(name = "SearchResultTotals")
//    @Qualifier("SearchResultTotals")
//    public SearchResponse<SearchResultTotals> getSearchResponseTotals() {
//        return new SearchResponseTotals();
//    }
//
//    @Bean(name = "SearchResultInterchangeTotal")
//    @Qualifier("SearchResultInterchangeTotal")
//    public SearchResponse<SearchResultInterchangeTotal> getSearchResponseInterchangeTotal(){
//        return new SearchResponseInterchangeTotal();
//    }

//    @Bean
//    public SearchResponse<SearchResultInterchangeTotal> getSearchResponseInterchangeTotal() {
//        return new SearchResponseInterchangeTotal();
//    }


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
