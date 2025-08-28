package com.codedstreams.xfinance.sdk.model.request;

import java.math.BigDecimal;

/**
 * Request model for investment returns calculation.
 *
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class InvestmentReturnsRequest {
    private BigDecimal initialInvestment;
    private BigDecimal monthlyContribution;
    private BigDecimal expectedAnnualReturn;
    private Integer years;

    /**
     * Default constructor.
     */
    public InvestmentReturnsRequest() {
    }

    /**
     * Constructs a new InvestmentReturnsRequest with the specified parameters.
     *
     * @param initialInvestment the initial investment amount
     * @param monthlyContribution the monthly contribution amount
     * @param expectedAnnualReturn the expected annual return rate
     * @param years the number of years
     */
    public InvestmentReturnsRequest(BigDecimal initialInvestment, BigDecimal monthlyContribution,
                                    BigDecimal expectedAnnualReturn, Integer years) {
        this.initialInvestment = initialInvestment;
        this.monthlyContribution = monthlyContribution;
        this.expectedAnnualReturn = expectedAnnualReturn;
        this.years = years;
    }

    /**
     * Gets the initial investment amount.
     *
     * @return the initial investment amount
     */
    public BigDecimal getInitialInvestment() {
        return initialInvestment;
    }

    /**
     * Sets the initial investment amount.
     *
     * @param initialInvestment the initial investment amount to set
     */
    public void setInitialInvestment(BigDecimal initialInvestment) {
        this.initialInvestment = initialInvestment;
    }

    /**
     * Gets the monthly contribution amount.
     *
     * @return the monthly contribution amount
     */
    public BigDecimal getMonthlyContribution() {
        return monthlyContribution;
    }

    /**
     * Sets the monthly contribution amount.
     *
     * @param monthlyContribution the monthly contribution amount to set
     */
    public void setMonthlyContribution(BigDecimal monthlyContribution) {
        this.monthlyContribution = monthlyContribution;
    }

    /**
     * Gets the expected annual return rate.
     *
     * @return the expected annual return rate
     */
    public BigDecimal getExpectedAnnualReturn() {
        return expectedAnnualReturn;
    }

    /**
     * Sets the expected annual return rate.
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
