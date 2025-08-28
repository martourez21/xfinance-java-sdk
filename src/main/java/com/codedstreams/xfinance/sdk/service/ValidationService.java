package com.codedstreams.xfinance.sdk.service;


import com.codedstreams.xfinance.sdk.exception.ValidationException;
import com.codedstreams.xfinance.sdk.model.request.CompoundInterestRequest;
import com.codedstreams.xfinance.sdk.model.request.InvestmentReturnsRequest;
import com.codedstreams.xfinance.sdk.model.request.LoanCalculationRequest;

import java.math.BigDecimal;

/**
 * Validation service for request parameters.
 *
 * @author X-Finance-Util Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class ValidationService {

    /**
     * Validates a compound interest request.
     *
     * @param request the compound interest request to validate
     * @throws ValidationException if validation fails
     */
    public void validateCompoundInterestRequest(CompoundInterestRequest request) throws ValidationException {
        if (request == null) {
            throw new ValidationException("Request cannot be null");
        }

        validatePositiveAmount(request.getPrincipal(), "Principal");
        validateNonNegativeRate(request.getAnnualRate(), "Annual rate");
        validatePositiveInteger(request.getYears(), "Years");
        validatePositiveInteger(request.getCompoundingFrequency(), "Compounding frequency");
    }

    /**
     * Validates a loan calculation request.
     *
     * @param request the loan calculation request to validate
     * @throws ValidationException if validation fails
     */
    public void validateLoanCalculationRequest(LoanCalculationRequest request) throws ValidationException {
        if (request == null) {
            throw new ValidationException("Request cannot be null");
        }

        validatePositiveAmount(request.getLoanAmount(), "Loan amount");
        validateNonNegativeRate(request.getAnnualRate(), "Annual rate");
        validatePositiveInteger(request.getTermYears(), "Term years");
    }

    /**
     * Validates an investment returns request.
     *
     * @param request the investment returns request to validate
     * @throws ValidationException if validation fails
     */
    public void validateInvestmentReturnsRequest(InvestmentReturnsRequest request) throws ValidationException {
        if (request == null) {
            throw new ValidationException("Request cannot be null");
        }

        validateNonNegativeAmount(request.getInitialInvestment(), "Initial investment");
        validateNonNegativeAmount(request.getMonthlyContribution(), "Monthly contribution");
        validateNonNegativeRate(request.getExpectedAnnualReturn(), "Expected annual return");
        validatePositiveInteger(request.getYears(), "Years");
    }

    private void validatePositiveAmount(BigDecimal amount, String fieldName) throws ValidationException {
        if (amount == null) {
            throw new ValidationException(fieldName + " cannot be null");
        }
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ValidationException(fieldName + " must be greater than 0");
        }
    }

    private void validateNonNegativeAmount(BigDecimal amount, String fieldName) throws ValidationException {
        if (amount == null) {
            throw new ValidationException(fieldName + " cannot be null");
        }
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new ValidationException(fieldName + " cannot be negative");
        }
    }

    private void validateNonNegativeRate(BigDecimal rate, String fieldName) throws ValidationException {
        if (rate == null) {
            throw new ValidationException(fieldName + " cannot be null");
        }
        if (rate.compareTo(BigDecimal.ZERO) < 0) {
            throw new ValidationException(fieldName + " cannot be negative");
        }
    }

    private void validatePositiveInteger(Integer value, String fieldName) throws ValidationException {
        if (value == null) {
            throw new ValidationException(fieldName + " cannot be null");
        }
        if (value <= 0) {
            throw new ValidationException(fieldName + " must be greater than 0");
        }
    }
}