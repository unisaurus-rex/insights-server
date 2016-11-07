package com.vantiv.insights.model.Search;

/**
 *
 */
public class SearchResponse {

    private SearchResponseResult[] searchResponseResults;

    private Integer totalSearchResults;

    public SearchResponse(){
        final int dimension = 10;
        this.searchResponseResults = new SearchResponseResult[dimension];

        for (int i = 0; i < dimension; ++i) {
            this.searchResponseResults[i] = new SearchResponseResult();
        }

        this.totalSearchResults = this.searchResponseResults.length;
    }

    public SearchResponseResult[] getSearchResponseResults() {
        return searchResponseResults;
    }

    public void setSearchResponseResults(SearchResponseResult[] searchResponseResults) {
        this.searchResponseResults = searchResponseResults;
    }


    public Integer getTotalSearchResults() {
        return totalSearchResults;
    }

    public void setTotalSearchResults(Integer totalSearchResults) {
        this.totalSearchResults = totalSearchResults;
    }

    // will come from db, api, etc.
    private class SearchResponseResult {
        private Double volume;
        private Double spend;
        private Double surcharge;
        private Double interchange;

        public SearchResponseResult() {
            this.interchange = 0.0;
            this.spend = 0.0;
            this.surcharge = 0.0;
            this.volume = 0.0;
        }

        public Double getVolume() {
            return volume;
        }

        public void setVolume(Double volume) {
            this.volume = volume;
        }

        public Double getSpend() {
            return spend;
        }

        public void setSpend(Double spend) {
            this.spend = spend;
        }

        public Double getSurcharge() {
            return surcharge;
        }

        public void setSurcharge(Double surcharge) {
            this.surcharge = surcharge;
        }

        public Double getInterchange() {
            return interchange;
        }

        public void setInterchange(Double interchange) {
            this.interchange = interchange;
        }

    }
}
