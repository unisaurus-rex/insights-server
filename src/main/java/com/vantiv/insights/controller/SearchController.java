package com.vantiv.insights.controller;

import com.vantiv.insights.model.BS.BSDAO;
import com.vantiv.insights.model.Search.SearchRequest;
import com.vantiv.insights.model.Search.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@RestController
public class SearchController extends BaseController{

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

        System.out.println(this.getRequestHeaders());
        Map<String,String> headers = new HashMap<>();
        headers.put("v_correlationId", "24u84u8u438u85");

        this.setResponseHeaders(headers);

        return searchResponse;
    }

}
