package com.vantiv.insights.model.Error;

/**
 * Created by U999716 on 11/8/2016.
 */
public class UndefinedRouteResponse {

    private String Error;

        public UndefinedRouteResponse() {
            this.Error = "Undefined route.";
        }

    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }

}
