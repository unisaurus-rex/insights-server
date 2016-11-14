package com.vantiv.insights.model.Search;

import org.joda.time.DateTime;

/**
 * Every
 */
class SearchResult {
    private String card;
    private String cardGroup;
    private DateTime date;
    private String day;
    private String hour;
    private String merchant;
    private String merchantGroup;
    private String month;
    private String quarter;
    private String week;
    private String year;

    public SearchResult(String card, String cardGroup, DateTime date, String day, String hour, String merchant, String merchantGroup, String month, String quarter, String week, String year) {
        this.card = card;
        this.cardGroup = cardGroup;
        this.date = date;
        this.day = day;
        this.hour = hour;
        this.merchant = merchant;
        this.merchantGroup = merchantGroup;
        this.month = month;
        this.quarter = quarter;
        this.week = week;
        this.year = year;
    }

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

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
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
