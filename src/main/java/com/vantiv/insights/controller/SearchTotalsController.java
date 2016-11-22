package com.vantiv.insights.controller;

import com.vantiv.insights.lib.Search;
import com.vantiv.insights.model.Search.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
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

//    @Autowired
//    @Qualifier("SearchResultTotals")
//    private SearchResponse searchResponse;
//
//    @Autowired
//    @Qualifier("SearchResultInterchangeTotal")
//    private SearchResponse searchResponse;

    /**
     * Path Strings
     * TODO should these be in some core constants reference class??? .properties file???
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
    public ResponseEntity<SearchResponse> totalsSearch(@Valid @RequestBody(required = true) SearchRequest searchRequest,
                                                             BindingResult bindingResult,
                                                             @RequestParam(value = "limit", required = false) Integer limit,
                                                             @RequestParam(value = "offset", required = false) Integer offset) {
        SearchResponse searchResponse = new SearchResponseTotals();

        if (bindingResult.hasErrors()) {
            throw new HttpMessageNotReadableException(bindingResult.getFieldErrors().toString());  // let exception handler take care of it
        } else {
            //Need to set limit and offset from the incoming URL query parameters
            searchRequest.setLimit(limit);
            searchRequest.setOffset(offset);


            searchResponse = Search.getTotals(searchRequest);
        }

        // TODO some incorrect route usage error

        return new ResponseEntity<>(searchResponse, HttpStatus.OK);
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
    public ResponseEntity<SearchResponse> volumeTotalSearch(@Valid @RequestBody(required = true) SearchRequest searchRequest,
                                                       BindingResult bindingResult,
                                                       @RequestParam(value = "limit", required = false) Integer limit,
                                                       @RequestParam(value = "offset", required = false) Integer offset) {
        SearchResponse searchResponse = new SearchResponseVolumeTotal();

        if (bindingResult.hasErrors()) {
            throw new HttpMessageNotReadableException(bindingResult.getFieldErrors().toString());  // let exception handler take care of it
        } else {
            // TODO call some Search library function to handle request manipulation/management
            //Need to set limit and offset from the incoming URL query parameters
            searchRequest.setLimit(limit);
            searchRequest.setOffset(offset);

            searchResponse = Search.getVolumeTotal(searchRequest);
        }

        return new ResponseEntity<>(searchResponse, HttpStatus.OK);
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
    public ResponseEntity<SearchResponse> spendTotalSearch(@Valid @RequestBody(required = true) SearchRequest searchRequest,
                                                     BindingResult bindingResult,
                                                     @RequestParam(value = "limit", required = false) Integer limit,
                                                     @RequestParam(value = "offset", required = false) Integer offset) {
        SearchResponse searchResponse = new SearchResponseSpendTotal();

        if (bindingResult.hasErrors()) {
            throw new HttpMessageNotReadableException(bindingResult.getFieldErrors().toString());  // let exception handler take care of it
        } else {
            // TODO call some Search library function to handle request manipulation/management
            //Need to set limit and offset from the incoming URL query parameters
            searchRequest.setLimit(limit);
            searchRequest.setOffset(offset);

            searchResponse = Search.getSpendTotal(searchRequest);
        }

        return new ResponseEntity<>(searchResponse, HttpStatus.OK);
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
    public ResponseEntity<SearchResponse> interchangeTotalSearch(@Valid @RequestBody(required = true) SearchRequest searchRequest,
                                                                 BindingResult bindingResult,
                                                                 @RequestParam(value = "limit", required = false) Integer limit,
                                                                 @RequestParam(value = "offset", required = false) Integer offset) {
        SearchResponse searchResponse = new SearchResponseInterchangeTotal();

        if (bindingResult.hasErrors()) {
            throw new HttpMessageNotReadableException(bindingResult.getFieldErrors().toString());  // let exception handler take care of it
        } else {
            // TODO call some Search library function to handle request manipulation/management
            //Need to set limit and offset from the incoming URL query parameters
            searchRequest.setLimit(limit);
            searchRequest.setOffset(offset);

            searchResponse = Search.getInterchangeTotal(searchRequest);
        }

        return new ResponseEntity<>(searchResponse, HttpStatus.OK);
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
    public ResponseEntity<SearchResponse> surchargeTotalSearch(@Valid @RequestBody(required = true) SearchRequest searchRequest,
                                                             BindingResult bindingResult,
                                                             @RequestParam(value = "limit", required = false) Integer limit,
                                                             @RequestParam(value = "offset", required = false) Integer offset) {
        SearchResponse searchResponse = new SearchResponseSurchargeTotal();

        if (bindingResult.hasErrors()) {
            throw new HttpMessageNotReadableException(bindingResult.getFieldErrors().toString());  // let exception handler take care of it
        } else {
            // TODO call some Search library function to handle request manipulation/management
            //Need to set limit and offset from the incoming URL query parameters
            searchRequest.setLimit(limit);
            searchRequest.setOffset(offset);

            searchResponse = Search.getSurchargeTotal(searchRequest);
        }

        return new ResponseEntity<>(searchResponse, HttpStatus.OK);
    }


}
