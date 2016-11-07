package com.vantiv.insights.controller;

import com.vantiv.insights.model.BS.BSDAO;
import com.vantiv.insights.model.Search.SearchRequest;
import com.vantiv.insights.model.Search.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@RestController
public class SearchController {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private BSDAO bsdao;


    /**
     * totalsSearch
     * <p/>
     * Handle requests to
     * /search/totals
     * /search/totals?limit=limit
     * /search/totals?offset=offset
     * /search/totals?limit=limit&offset=offset
     *
     * @param searchRequest
     * @param id
     * @param offset
     * @return
     */
    @PostMapping(
            path = "/search/totals",
            consumes = "application/json",
            produces = "application/json")
    public SearchResponse totalsSearch(@RequestBody(required = false) SearchRequest searchRequest,
                                       @RequestParam(value = "limit", required = false) Integer id,
                                       @RequestParam(value = "offset", required = false) Integer offset) {
        SearchResponse searchResponse = new SearchResponse();

        if (searchRequest != null) {
            // do something with request
//            System.out.println(this.getRequestHeaders());   // get headers
            System.out.println("I AM AN INCORRECT REQUEST");
        }

        return searchResponse;
    }

    private Map<String, String> getRequestHeaders() {
        Map<String, String> headers = new HashMap<>();

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            headers.put(key, value);
        }

        return headers;
    }
}
