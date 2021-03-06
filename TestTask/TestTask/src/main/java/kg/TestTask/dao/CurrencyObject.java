package kg.TestTask.dao;

import java.io.Serializable;
import java.util.List;

public class CurrencyObject implements Serializable {
    private String disclaimer;
    private String license;
    private String timestamp;
    private String base;
    private RateObject rates;

    public CurrencyObject() {
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public RateObject getRates() {
        return rates;
    }

    public void setRates(RateObject rates) {
        this.rates = rates;
    }
}

