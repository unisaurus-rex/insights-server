package com.vantiv.insights.controller;

import com.vantiv.insights.lib.Search;
import com.vantiv.insights.model.Search.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * SearchTotalsController
 * </p>
 * Controller for the /search/totals endpoints, including
 * /search/totals
 * /search/totals/volume
 * /search/totals/spend
 * /search/totals/interchange
 * /search/totals/surcharge
 */
@RestController
public class SearchTotalsController extends BaseController {

//    @Autowired
//    private BSDAO bsdao;

    /**
     * Path Strings
     * TODO should these be in some core constants reference class???
     */
    private static final String basepath = "/search/totals";
    private static final String volumeTotalPath = basepath + "/volume";
    private static final String spendTotalPath = basepath + "/spend";
    private static final String interchangeTotalPath = basepath + "/interchange";
    private static final String surchargeTotalPath = basepath + "/surcharge";

    /**
     * totalsSearch
     * <p/>
     * Handle requests to
     * /search/totals
     * /search/totals?limit=limit
     * /search/totals?offset=offset
     * /search/totals?limit=limit&offset=offset
     *
     * @param searchRequest incoming search request body
     * @param limit         maximum number of results to be returned to the client
     * @param offset        initial index to begin pulling 'limit' results
     * @return SearchTotalResponse Contains the totals for all available data points
     * volume
     * spend
     * interchange
     * surcharge
     */
    @PostMapping(
            path = basepath,
            consumes = "application/json",
            produces = "application/json")
    @ResponseBody
    public ResponseEntity<SearchResponseTotals> totalsSearch(@Valid @RequestBody(required = false) SearchRequest searchRequest,
                                                             BindingResult result,
                                                             @RequestParam(value = "limit", required = false) Integer limit,
                                                             @RequestParam(value = "offset", required = false) Integer offset) throws Exception {
        SearchResponseTotals searchResponse;

        if (result.hasErrors()) {

            System.err.println(result.getAllErrors()); //temporary to see errors coming out
            //TODO How to get exception in Error controller then move this logic there

            return new ResponseEntity<SearchResponseTotals> (new SearchResponseTotals(), HttpStatus.BAD_REQUEST);
        } else {
            //Need to set limit and offset from the incoming URL query parameters
            searchRequest.setLimit(limit);
            searchRequest.setOffset(offset);

            searchResponse = Search.getTotals(searchRequest);
        }

        // TODO some incorrect route usage error

        return new ResponseEntity<SearchResponseTotals>(searchResponse, HttpStatus.OK);
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
     * @param searchRequest incoming search request body
     * @param limit         maximum number of results to be returned to the client
     * @param offset        initial index to begin pulling 'limit' results
     * @return SearchResponseVolumeTotal Contains the total volume data point
     */
    @PostMapping(
            path = volumeTotalPath,
            consumes = "application/json",
            produces = "application/json")
    public SearchResponseVolumeTotal volumeTotalSearch(@Valid @RequestBody(required = false) SearchRequest searchRequest,
                                                        BindingResult result,
                                                        @RequestParam(value = "limit", required = false) Integer limit,
                                                        @RequestParam(value = "offset", required = false) Integer offset) {
        SearchResponseVolumeTotal searchResponse = new SearchResponseVolumeTotal();

        if (result.hasErrors()) {
            // TODO some incorrect route usage error
        } else {
            // TODO call some Search library function to handle request manipulation/management
            //Need to set limit and offset from the incoming URL query parameters
            searchRequest.setLimit(limit);
            searchRequest.setOffset(offset);

            searchResponse = Search.getVolumeTotal(searchRequest);
        }

        return searchResponse;
    }

    /**
     * spendTotalSearch
     * <p/>
     * Handle requests to
     * /search/totals/spend
     * /search/totals/spend?limit=limit
     * /search/totals/spend?offset=offset
     * /search/totals/spend?limit=limit&offset=offset
     *
     * @param searchRequest incoming search request body
     * @param limit         maximum number of results to be returned to the client
     * @param offset        initial index to begin pulling 'limit' results
     * @return SearchResponseSpendTotal Contains the total spend data point
     */
    @PostMapping(
            path = spendTotalPath,
            consumes = "application/json",
            produces = "application/json")
    public SearchResponseSpendTotal spendTotalSearch(@Valid @RequestBody(required = false) SearchRequest searchRequest,
                                                      BindingResult result,
                                                      @RequestParam(value = "limit", required = false) Integer limit,
                                                      @RequestParam(value = "offset", required = false) Integer offset) {
        SearchResponseSpendTotal searchResponse = new SearchResponseSpendTotal();

        if (result.hasErrors()) {
            // TODO some incorrect route usage error
        } else {
            // TODO call some Search library function to handle request manipulation/management
            //Need to set limit and offset from the incoming URL query parameters
            searchRequest.setLimit(limit);
            searchRequest.setOffset(offset);

            searchResponse = Search.getSpendTotal(searchRequest);
        }

        return searchResponse;
    }
    
    /**
     * interchangeTotalSearch
     * <p/>
     * Handle requests to
     * /search/totals/interchange
     * /search/totals/interchange?limit=limit
     * /search/totals/interchange?offset=offset
     * /search/totals/interchange?limit=limit&offset=offset
     *
     * @param searchRequest incoming search request body
     * @param limit         maximum number of results to be returned to the client
     * @param offset        initial index to begin pulling 'limit' results
     * @return SearchResponseInterchangeTotal Contains the total interchange data point
     */
    @PostMapping(
            path = interchangeTotalPath,
            consumes = "application/json",
            produces = "application/json")
    public SearchResponseInterchangeTotal interchangeTotalSearch(@Valid @RequestBody(required = false) SearchRequest searchRequest,
                                                            BindingResult result,
                                                            @RequestParam(value = "limit", required = false) Integer limit,
                                                            @RequestParam(value = "offset", required = false) Integer offset) {
        SearchResponseInterchangeTotal searchResponse = new SearchResponseInterchangeTotal();

        if (result.hasErrors()) {
            // TODO some incorrect route usage error
        } else {
            // TODO call some Search library function to handle request manipulation/management
            //Need to set limit and offset from the incoming URL query parameters
            searchRequest.setLimit(limit);
            searchRequest.setOffset(offset);

            searchResponse = Search.getInterchangeTotal(searchRequest);
        }

        return searchResponse;
    }

    
    /**
     * surchargeTotalSearch
     * <p/>
     * Handle requests to
     * /search/totals/surcharge
     * /search/totals/surcharge?limit=limit
     * /search/totals/surcharge?offset=offset
     * /search/totals/surcharge?limit=limit&offset=offset
     *
     * @param searchRequest incoming search request body
     * @param limit         maximum number of results to be returned to the client
     * @param offset        initial index to begin pulling 'limit' results
     * @return SearchResponseSurchargeTotal Contains the total surcharge data point
     */
    @PostMapping(
            path = surchargeTotalPath,
            consumes = "application/json",
            produces = "application/json")
    public SearchResponseSurchargeTotal surchargeTotalSearch(@Valid @RequestBody(required = false) SearchRequest searchRequest,
                                                            BindingResult result,
                                                            @RequestParam(value = "limit", required = false) Integer limit,
                                                            @RequestParam(value = "offset", required = false) Integer offset) {
        SearchResponseSurchargeTotal searchResponse = new SearchResponseSurchargeTotal();

        if (result.hasErrors()) {
            // TODO some incorrect route usage error
        } else {
            // TODO call some Search library function to handle request manipulation/management
            //Need to set limit and offset from the incoming URL query parameters
            searchRequest.setLimit(limit);
            searchRequest.setOffset(offset);

            searchResponse = Search.getSurchargeTotal(searchRequest);
        }

        return searchResponse;
    }


}
