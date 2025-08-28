package com.codedstreams.xfinance.sdk.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

/**
 * Request model for compound interest calculations.
 *
 * <p>Contains all parameters needed to calculate compound interest including
 * principal amount, annual interest rate, time period, and compounding frequency.</p>
 *
 * <p><b>Example Usage:</b></p>
 * <pre>{@code
 * CompoundInterestRequest request = CompoundInterestRequest.builder()
 *     .principal(new BigDecimal("10000.00"))
 *     .annualRate(new BigDecimal("5.5"))
 *     .years(10)
 *     .compoundingFrequency(12)  // Monthly compounding
 *     .build();
 * }</pre>
 *
 * @author X-Finance Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class CompoundInterestRequest {
    private BigDecimal principal;
    private BigDecimal annualRate;
    private Integer years;
    private Integer compoundingFrequency;

    /**
     * Default constructor.
     */
    public CompoundInterestRequest() {
    }

    /**
     * Constructs a new CompoundInterestRequest with the specified parameters.
     *
     * @param principal the principal amount
     * @param annualRate the annual interest rate
     * @param years the number of years
     * @param compoundingFrequency the compounding frequency per year
     */
    public CompoundInterestRequest(BigDecimal principal, BigDecimal annualRate, Integer years, Integer compoundingFrequency) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.years = years;
        this.compoundingFrequency = compoundingFrequency;
    }

    /**
     * Gets the principal amount.
     *
     * @return the principal amount
     */
    public BigDecimal getPrincipal() {
        return principal;
    }

    /**
     * Sets the principal amount.
     *
     * @param principal the principal amount to set
     */
    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    /**
     * Gets the annual interest rate.
     *
     * @return the annual interest rate
     */
    public BigDecimal getAnnualRate() {
        return annualRate;
    }

    /**
     * Sets the annual interest rate.
     *
     * @param annualRate the annual interest rate to set
     */
    public void setAnnualRate(BigDecimal annualRate) {
        this.annualRate = annualRate;
    }

    /**
     * Gets the number of years.
     *
     * @return the number of years
     */
    public Integer getYears() {
        return years;
    }

    /**
     * Sets the number of years.
     *
     * @param years the number of years to set
     */
    public void setYears(Integer years) {
        this.years = years;
    }

    /**
     * Gets the compounding frequency per year.
     *
     * @return the compounding frequency
     */
    public Integer getCompoundingFrequency() {
        return compoundingFrequency;
    }

    /**
     * Sets the compounding frequency per year.
     *
     * @param compoundingFrequency the compounding frequency to set
     */
    public void setCompoundingFrequency(Integer compoundingFrequency) {
        this.compoundingFrequency = compoundingFrequency;
    }
}