package com.codedstreams.xfinance.sdk.model.response;


import java.math.BigDecimal;

/**
 * Response model for compound interest calculations.
 *
 * <p>Contains the results of compound interest calculations including
 * the final amount, total interest earned, and original input parameters.</p>
 *
 * @author X-Finance Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class CompoundInterestResponse {
    private BigDecimal finalAmount;
    private BigDecimal totalInterest;
    private BigDecimal principal;
    private BigDecimal annualRate;
    private Integer years;
    private Integer compoundingFrequency;

    /**
     * Default constructor.
     */
    public CompoundInterestResponse() {
    }

    /**
     * Constructs a new CompoundInterestResponse with the specified parameters.
     *
     * @param finalAmount the final amount after interest
     * @param totalInterest the total interest earned
     * @param principal the original principal amount
     * @param annualRate the annual interest rate used
     * @param years the number of years
     * @param compoundingFrequency the compounding frequency used
     */
    public CompoundInterestResponse(BigDecimal finalAmount, BigDecimal totalInterest, BigDecimal principal,
                                    BigDecimal annualRate, Integer years, Integer compoundingFrequency) {
        this.finalAmount = finalAmount;
        this.totalInterest = totalInterest;
        this.principal = principal;
        this.annualRate = annualRate;
        this.years = years;
        this.compoundingFrequency = compoundingFrequency;
    }

    /**
     * Gets the final amount after interest.
     *
     * @return the final amount
     */
    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    /**
     * Sets the final amount after interest.
     *
     * @param finalAmount the final amount to set
     */
    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    /**
     * Gets the total interest earned.
     *
     * @return the total interest
     */
    public BigDecimal getTotalInterest() {
        return totalInterest;
    }

    /**
     * Sets the total interest earned.
     *
     * @param totalInterest the total interest to set
     */
    public void setTotalInterest(BigDecimal totalInterest) {
        this.totalInterest = totalInterest;
    }

    /**
     * Gets the original principal amount.
     *
     * @return the principal amount
     */
    public BigDecimal getPrincipal() {
        return principal;
    }

    /**
     * Sets the original principal amount.
     *
     * @param principal the principal amount to set
     */
    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    /**
     * Gets the annual interest rate used.
     *
     * @return the annual interest rate
     */
    public BigDecimal getAnnualRate() {
        return annualRate;
    }

    /**
     * Sets the annual interest rate used.
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
     * Gets the compounding frequency used.
     *
     * @return the compounding frequency
     */
    public Integer getCompoundingFrequency() {
        return compoundingFrequency;
    }

    /**
     * Sets the compounding frequency used.
     *
     * @param compoundingFrequency the compounding frequency to set
     */
    public void setCompoundingFrequency(Integer compoundingFrequency) {
        this.compoundingFrequency = compoundingFrequency;
    }
}