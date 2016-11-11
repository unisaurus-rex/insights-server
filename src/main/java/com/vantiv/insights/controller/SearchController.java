package com.vantiv.insights.controller;

import com.vantiv.insights.model.BS.BSDAO;
import com.vantiv.insights.model.Search.SearchTotalsRequest;
import com.vantiv.insights.model.Search.SearchTotalsResponse;
import com.vantiv.insights.model.Search.SearchVolumeTotalRequest;
import com.vantiv.insights.model.Search.SearchVolumeTotalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
public class SearchController extends BaseController{

    @Autowired
    private BSDAO bsdao;

    /**
     * Path Strings
     * TODO - should these be in some core constants reference class???
     */
    private static final String base = "/search";
    private static final String totalsPath = base + "/totals";
    private static final String volumeTotalPath = totalsPath + "/volume";


    /**
     * totalsSearch
     * <p/>
     * Handle requests to
     * /search/totals
     * /search/totals?limit=limit
     * /search/totals?offset=offset
     * /search/totals?limit=limit&offset=offset
     *
     * @param searchTotalsRequest
     * @param id
     * @param offset
     * @return
     */
    @PostMapping(
            path = totalsPath,
            consumes = "application/json",
            produces = "application/json")
    public SearchTotalsResponse totalsSearch(@RequestBody(required = false) SearchTotalsRequest searchTotalsRequest,
                                             @RequestParam(value = "limit", required = false) Integer id,
                                             @RequestParam(value = "offset", required = false) Integer offset) throws Exception {
        SearchTotalsResponse searchResponse = new SearchTotalsResponse();

        if (searchTotalsRequest != null) {
            // TODO call some Search library function to handle request manipulation/management
        }

        // TODO some incorrect route usage error

        return searchResponse;
    }

    /**
     * volumeTotalSearch
     * <p/>
     * Handle requests to
     * /search/totals/volume
     * /search/totals/volume?limit=limit
     * /search/totals/volume?offset=offset
     * /search/totals/volume?limit=limit&offset=offset
     *
     * @param searchVolumeTotalRequest
     * @param id
     * @param offset
     * @return
     */
    @PostMapping(
            path = volumeTotalPath,
            consumes = "application/json",
            produces = "application/json")
    public SearchVolumeTotalResponse volumeTotalsSearch(@RequestBody(required = false) SearchVolumeTotalRequest searchVolumeTotalRequest,
                                                        @RequestParam(value = "limit", required = false) Integer id,
                                                        @RequestParam(value = "offset", required = false) Integer offset) {
        SearchVolumeTotalResponse searchResponse = new SearchVolumeTotalResponse();

        if (searchVolumeTotalRequest != null) {
            // TODO call some Search library function to handle request manipulation/management
        }

        // TODO some incorrect route usage error

        return searchResponse;
    }



}
