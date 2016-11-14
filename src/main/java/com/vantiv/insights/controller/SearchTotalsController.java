package com.vantiv.insights.controller;

import com.vantiv.insights.lib.Search;
import com.vantiv.insights.model.Search.SearchRequest;
import com.vantiv.insights.model.Search.SearchTotalsResponse;
import com.vantiv.insights.model.Search.SearchVolumeTotalResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
     * TODO - should these be in some core constants reference class???
     */
    private static final String basepath = "/search/totals";
    private static final String volumeTotalPath = basepath + "/volume";


    /**
     * totalsSearch
     * <p/>
     * Handle requests to
     * /search/totals
     * /search/totals?limit=limit
     * /search/totals?offset=offset
     * /search/totals?limit=limit&offset=offset
     *
     * @param searchRequest - incoming search request body
     * @param limit         - maximum number of results to be returned to the client
     * @param offset        - initial index to begin pulling 'limit' results
     * @return SearchTotalResponse - Contains the totals for all available data points
     * - volume
     * - spend
     * - interchange
     * - surcharge
     */
    @PostMapping(
            path = basepath,
            consumes = "application/json",
            produces = "application/json")
    public ResponseEntity<SearchTotalsResponse> totalsSearch(@RequestBody(required = false) SearchRequest searchRequest,
                                                            @RequestParam(value = "limit", required = false) Integer limit,
                                                            @RequestParam(value = "offset", required = false) Integer offset) throws Exception {
        SearchTotalsResponse searchResponse;

        if (searchRequest != null) {
            //Need to set limit and offset from the incoming URL query parameters
            searchRequest.setLimit(limit);
            searchRequest.setOffset(offset);

            searchResponse = Search.getTotalsSummary(searchRequest);
        } else {
            //TODO How to get exception in Error controller then move this logic there

            return new ResponseEntity<SearchTotalsResponse>(new SearchTotalsResponse(), HttpStatus.BAD_REQUEST);
        }

        // TODO some incorrect route usage error

        return new ResponseEntity<SearchTotalsResponse>(searchResponse, HttpStatus.OK);
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
     * @param searchRequest - incoming search request body
     * @param limit         - maximum number of results to be returned to the client
     * @param offset        - initial index to begin pulling 'limit' results
     * @return SearchVolumeTotalResponse - Contains the total volume data point
     */
    @PostMapping(
            path = volumeTotalPath,
            consumes = "application/json",
            produces = "application/json")
    public SearchVolumeTotalResponse volumeTotalsSearch(@RequestBody(required = false) SearchRequest searchRequest,
                                                        @RequestParam(value = "limit", required = false) Integer limit,
                                                        @RequestParam(value = "offset", required = false) Integer offset) {
        SearchVolumeTotalResponse searchVolumeResponse = new SearchVolumeTotalResponse();

        if (searchRequest != null) {
            // TODO call some Search library function to handle request manipulation/management
        }

        // TODO some incorrect route usage error

        return searchVolumeResponse;
    }


}
