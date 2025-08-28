package com.codedstreams.xfinance.sdk;

import com.codedstreams.xfinance.sdk.config.ClientConfiguration;
import com.codedstreams.xfinance.sdk.exception.XFinanceException;
import com.codedstreams.xfinance.sdk.model.request.CompoundInterestRequest;
import com.codedstreams.xfinance.sdk.model.request.InvestmentReturnsRequest;
import com.codedstreams.xfinance.sdk.model.request.LoanCalculationRequest;
import com.codedstreams.xfinance.sdk.model.response.CompoundInterestResponse;
import com.codedstreams.xfinance.sdk.model.response.InvestmentReturnsResponse;
import com.codedstreams.xfinance.sdk.model.response.LoanCalculationResponse;
import com.codedstreams.xfinance.sdk.service.AuthenticationService;
import com.codedstreams.xfinance.sdk.service.HttpService;
import com.codedstreams.xfinance.sdk.service.ValidationService;
import lombok.extern.slf4j.Slf4j;

/**
 * X-Finance Java SDK Client
 *
 * <p>The main entry point for interacting with the X-Finance API. This client provides
 * methods for calculating compound interest, loan payments, and investment returns.</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * XFinanceClient client = new XFinanceClient("your-api-key", "your-api-secret");
 *
 * CompoundInterestRequest request = CompoundInterestRequest.builder()
 *     .principal(new BigDecimal("10000"))
 *     .annualRate(new BigDecimal("5.5"))
 *     .years(10)
 *     .compoundingFrequency(12)
 *     .build();
 *
 * CompoundInterestResponse response = client.calculateCompoundInterest(request);
 * }</pre>
 *
 * @author X-Finance Team
 * @version 1.0.0
 * @since 1.0.0
 */
@Slf4j
public class XFinanceClient {
    private final HttpService httpService;
    private final AuthenticationService authService;
    private final ValidationService validationService;

    /**
     * Constructs a new XFinanceClient with the provided API credentials.
     *
     * @param apiKey the API key for authentication
     * @param apiSecret the API secret for authentication
     */
    public XFinanceClient(String apiKey, String apiSecret) {
        this(apiKey, apiSecret, new ClientConfiguration());
    }

    /**
     * Constructs a new XFinanceClient with custom configuration.
     *
     * @param apiKey the API key for authentication
     * @param apiSecret the API secret for authentication
     * @param config the client configuration
     */
    public XFinanceClient(String apiKey, String apiSecret, ClientConfiguration config) {
        this.validationService = new ValidationService();
        this.authService = new AuthenticationService(apiKey, apiSecret);
        this.httpService = new HttpService(authService, config);
    }

    /**
     * Calculates compound interest based on the provided parameters.
     *
     * @param request the compound interest calculation request
     * @return the compound interest calculation response
     * @throws XFinanceException if the calculation fails or validation errors occur
     */
    public CompoundInterestResponse calculateCompoundInterest(CompoundInterestRequest request)
            throws XFinanceException {
        validationService.validateCompoundInterestRequest(request);
        return httpService.post("/finance/compound-interest", request, CompoundInterestResponse.class);
    }

    /**
     * Calculates loan payment details based on the provided parameters.
     *
     * @param request the loan calculation request
     * @return the loan calculation response
     * @throws XFinanceException if the calculation fails or validation errors occur
     */
    public LoanCalculationResponse calculateLoanPayment(LoanCalculationRequest request)
            throws XFinanceException {
        validationService.validateLoanCalculationRequest(request);
        return httpService.post("/finance/loan-calculation", request, LoanCalculationResponse.class);
    }

    /**
     * Calculates investment returns based on the provided parameters.
     *
     * @param request the investment returns calculation request
     * @return the investment returns calculation response
     * @throws XFinanceException if the calculation fails or validation errors occur
     */
    public InvestmentReturnsResponse calculateInvestmentReturns(InvestmentReturnsRequest request)
            throws XFinanceException {
        validationService.validateInvestmentReturnsRequest(request);
        return httpService.post("/finance/investment-returns", request, InvestmentReturnsResponse.class);
    }

    /**
     * Gets the underlying HTTP service for advanced operations.
     *
     * @return the HTTP service instance
     */
    public HttpService getHttpService() {
        return httpService;
    }

    /**
     * Gets the authentication service instance.
     *
     * @return the authentication service
     */
    public AuthenticationService getAuthService() {
        return authService;
    }
}
