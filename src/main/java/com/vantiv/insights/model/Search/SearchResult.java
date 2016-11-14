package com.vantiv.insights.model.Search;

/**
 * SearchResult
 * </p>
 * Every search result can have these fields returned, thus all search result objects will
 * inherit this
 */
class SearchResult {
    private String card;
    private String cardGroup;
    private String date;
    private String day;
    private String hour;
    private String merchant;
    private String merchantGroup;
    private String month;
    private String quarter;
    private String week;
    private String year;

    public SearchResult() {
        this.card = null;
        this.cardGroup = null;
        this.date = null;
        this.day = null;
        this.hour = null;
        this.merchant = null;
        this.merchantGroup = null;
        this.month = null;
        this.quarter = null;
        this.week = null;
        this.year = null;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCardGroup() {
        return cardGroup;
    }

    public void setCardGroup(String cardGroup) {
        this.cardGroup = cardGroup;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getMerchantGroup() {
        return merchantGroup;
    }

    public void setMerchantGroup(String merchantGroup) {
        this.merchantGroup = merchantGroup;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
