package com.codedstreams.xfinance.sdk.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Request model for loan payment calculations.
 *
 * <p>Contains all parameters needed to calculate loan payments including
 * loan amount, annual interest rate, and loan term in years.</p>
 *
 * <p><b>Example Usage:</b></p>
 * <pre>{@code
 * LoanCalculationRequest request = LoanCalculationRequest.builder()
 *     .loanAmount(new BigDecimal("300000.00"))
 *     .annualRate(new BigDecimal("3.5"))
 *     .termYears(30)
 *     .build();
 * }</pre>
 *
 * @author X-Finance Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class LoanCalculationRequest {
    private BigDecimal loanAmount;
    private BigDecimal annualRate;
    private Integer termYears;

    /**
     * Default constructor.
     */
    public LoanCalculationRequest() {
    }

    /**
     * Constructs a new LoanCalculationRequest with the specified parameters.
     *
     * @param loanAmount the loan amount
     * @param annualRate the annual interest rate
     * @param termYears the loan term in years
     */
    public LoanCalculationRequest(BigDecimal loanAmount, BigDecimal annualRate, Integer termYears) {
        this.loanAmount = loanAmount;
        this.annualRate = annualRate;
        this.termYears = termYears;
    }

    /**
     * Gets the loan amount.
     *
     * @return the loan amount
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the loan amount.
     *
     * @param loanAmount the loan amount to set
     */
    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
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