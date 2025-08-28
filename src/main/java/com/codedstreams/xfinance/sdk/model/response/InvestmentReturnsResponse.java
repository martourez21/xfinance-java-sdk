package com.codedstreams.xfinance.sdk.model.response;

import java.math.BigDecimal;

/**
 * Response model for investment returns calculation.
 *
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class InvestmentReturnsResponse {
    private BigDecimal finalValue;
    private BigDecimal totalContributions;
    private BigDecimal totalReturns;
    private BigDecimal initialInvestment;
    private BigDecimal monthlyContribution;
    private BigDecimal expectedAnnualReturn;
    private Integer years;

    /**
     * Default constructor.
     */
    public InvestmentReturnsResponse() {
    }

    /**
     * Constructs a new InvestmentReturnsResponse with the specified parameters.
     *
     * @param finalValue the final investment value
     * @param totalContributions the total contributions made
     * @param totalReturns the total returns earned
     * @param initialInvestment the initial investment amount
     * @param monthlyContribution the monthly contribution amount
     * @param expectedAnnualReturn the expected annual return rate used
     * @param years the number of years
     */
    public InvestmentReturnsResponse(BigDecimal finalValue, BigDecimal totalContributions, BigDecimal totalReturns,
                                     BigDecimal initialInvestment, BigDecimal monthlyContribution,
                                     BigDecimal expectedAnnualReturn, Integer years) {
        this.finalValue = finalValue;
        this.totalContributions = totalContributions;
        this.totalReturns = totalReturns;
        this.initialInvestment = initialInvestment;
        this.monthlyContribution = monthlyContribution;
        this.expectedAnnualReturn = expectedAnnualReturn;
        this.years = years;
    }

    /**
     * Gets the final investment value.
     *
     * @return the final value
     */
    public BigDecimal getFinalValue() {
        return finalValue;
    }

    /**
     * Sets the final investment value.
     *
     * @param finalValue the final value to set
     */
    public void setFinalValue(BigDecimal finalValue) {
        this.finalValue = finalValue;
    }

    /**
     * Gets the total contributions made.
     *
     * @return the total contributions
     */
    public BigDecimal getTotalContributions() {
        return totalContributions;
    }

    /**
     * Sets the total contributions made.
     *
     * @param totalContributions the total contributions to set
     */
    public void setTotalContributions(BigDecimal totalContributions) {
        this.totalContributions = totalContributions;
    }

    /**
     * Gets the total returns earned.
     *
     * @return the total returns
     */
    public BigDecimal getTotalReturns() {
        return totalReturns;
    }

    /**
     * Sets the total returns earned.
     *
     * @param totalReturns the total returns to set
     */
    public void setTotalReturns(BigDecimal totalReturns) {
        this.totalReturns = totalReturns;
    }

    /**
     * Gets the initial investment amount.
     *
     * @return the initial investment
     */
    public BigDecimal getInitialInvestment() {
        return initialInvestment;
    }

    /**
     * Sets the initial investment amount.
     *
     * @param initialInvestment the initial investment to set
     */
    public void setInitialInvestment(BigDecimal initialInvestment) {
        this.initialInvestment = initialInvestment;
    }

    /**
     * Gets the monthly contribution amount.
     *
     * @return the monthly contribution
     */
    public BigDecimal getMonthlyContribution() {
        return monthlyContribution;
    }

    /**
     * Sets the monthly contribution amount.
     *
     * @param monthlyContribution the monthly contribution to set
     */
    public void setMonthlyContribution(BigDecimal monthlyContribution) {
        this.monthlyContribution = monthlyContribution;
    }

    /**
     * Gets the expected annual return rate used.
     *
     * @return the expected annual return rate
     */
    public BigDecimal getExpectedAnnualReturn() {
        return expectedAnnualReturn;
    }

    /**
     * Sets the expected annual return rate used.
     *
     * @param expectedAnnualReturn the expected annual return rate to set
     */
    public void setExpectedAnnualReturn(BigDecimal expectedAnnualReturn) {
        this.expectedAnnualReturn = expectedAnnualReturn;
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
}
