package com.codedstreams.xfinance.sdk.model.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Response model for loan payment calculations.
 *
 * <p>Contains the results of loan payment calculations including
 * monthly payment amount, total interest, and total amount to be paid.</p>
 *
 * @author X-Finance Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class LoanCalculationResponse {
    private BigDecimal monthlyPayment;
    private BigDecimal totalInterest;
    private BigDecimal totalAmount;
    private BigDecimal loanAmount;
    private BigDecimal annualRate;
    private Integer termYears;

    /**
     * Default constructor.
     */
    public LoanCalculationResponse() {
    }

    /**
     * Constructs a new LoanCalculationResponse with the specified parameters.
     *
     * @param monthlyPayment the monthly payment amount
     * @param totalInterest the total interest paid
     * @param totalAmount the total amount paid
     * @param loanAmount the original loan amount
     * @param annualRate the annual interest rate used
     * @param termYears the loan term in years
     */
    public LoanCalculationResponse(BigDecimal monthlyPayment, BigDecimal totalInterest, BigDecimal totalAmount,
                                   BigDecimal loanAmount, BigDecimal annualRate, Integer termYears) {
        this.monthlyPayment = monthlyPayment;
        this.totalInterest = totalInterest;
        this.totalAmount = totalAmount;
        this.loanAmount = loanAmount;
        this.annualRate = annualRate;
        this.termYears = termYears;
    }

    /**
     * Gets the monthly payment amount.
     *
     * @return the monthly payment
     */
    public BigDecimal getMonthlyPayment() {
        return monthlyPayment;
    }

    /**
     * Sets the monthly payment amount.
     *
     * @param monthlyPayment the monthly payment to set
     */
    public void setMonthlyPayment(BigDecimal monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    /**
     * Gets the total interest paid.
     *
     * @return the total interest
     */
    public BigDecimal getTotalInterest() {
        return totalInterest;
    }

    /**
     * Sets the total interest paid.
     *
     * @param totalInterest the total interest to set
     */
    public void setTotalInterest(BigDecimal totalInterest) {
        this.totalInterest = totalInterest;
    }

    /**
     * Gets the total amount paid.
     *
     * @return the total amount
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the total amount paid.
     *
     * @param totalAmount the total amount to set
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Gets the original loan amount.
     *
     * @return the loan amount
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the original loan amount.
     *
     * @param loanAmount the loan amount to set
     */
    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
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
     * Gets the loan term in years.
     *
     * @return the loan term in years
     */
    public Integer getTermYears() {
        return termYears;
    }

    /**
     * Sets the loan term in years.
     *
     * @param termYears the loan term in years to set
     */
    public void setTermYears(Integer termYears) {
        this.termYears = termYears;
    }
}