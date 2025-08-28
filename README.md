# X-Finance Java SDK

Official Java SDK for the X-Finance API, providing easy integration for financial calculations including compound interest, loan payments, and investment returns.

## Features

- **Compound Interest Calculations** - Calculate compound interest with customizable compounding frequencies
- **Loan Payment Calculations** - Determine monthly payments, total interest, and payment schedules
- **Investment Returns** - Project investment growth with regular contributions
- **Type Safety** - Full Java type safety with comprehensive validation
- **Error Handling** - Detailed exception handling with specific error types
- **Logging** - Built-in logging support with SLF4J
- **Configuration** - Flexible configuration options for different environments
- **Thread Safe** - Fully thread-safe client implementation

## Requirements

- Java  21 or higher
- Maven 3.6+ or Gradle 6.0+

## Installation

### Maven

Add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.codedstreams</groupId>
    <artifactId>xfinance-java-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

### Gradle

Add the following to your `build.gradle`:

```gradle
implementation 'com.xfinance:xfinance-java-sdk:1.0-SNAPSHOT'
```

## Quick Start

```java
import com.xfinance.sdk.XFinanceClient;
import com.xfinance.sdk.model.request.CompoundInterestRequest;
import com.xfinance.sdk.model.response.CompoundInterestResponse;
import java.math.BigDecimal;

public class QuickStart {
    public static void main(String[] args) {
        // Initialize the client
        XFinanceClient client = new XFinanceClient("your-api-key", "your-api-secret");
        
        try {
            // Create a compound interest request
            CompoundInterestRequest request = CompoundInterestRequest.builder()
                    .principal(new BigDecimal("10000.00"))
                    .annualRate(new BigDecimal("5.5"))
                    .years(10)
                    .compoundingFrequency(12)
                    .build();
            
            // Calculate compound interest
            CompoundInterestResponse response = client.calculateCompoundInterest(request);
            
            // Display results
            System.out.println("Final Amount: $" + response.getFinalAmount());
            System.out.println("Total Interest: $" + response.getTotalInterest());
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
```

## Usage Examples

### Compound Interest Calculation

```java
CompoundInterestRequest request = CompoundInterestRequest.builder()
        .principal(new BigDecimal("10000.00"))  // $10,000 initial investment
        .annualRate(new BigDecimal("5.5"))      // 5.5% annual interest rate
        .years(10)                              // 10 years
        .compoundingFrequency(12)               // Monthly compounding
        .build();

CompoundInterestResponse response = client.calculateCompoundInterest(request);

System.out.println("Investment Summary:");
System.out.println("Initial Investment: $" + response.getPrincipal());
System.out.println("Final Amount: $" + response.getFinalAmount());
System.out.println("Total Interest Earned: $" + response.getTotalInterest());
System.out.println("Effective Annual Rate: " + response.getEffectiveAnnualRate() + "%");
```

### Loan Payment Calculation

```java
LoanCalculationRequest request = LoanCalculationRequest.builder()
        .loanAmount(new BigDecimal("300000.00"))  // $300,000 mortgage
        .annualRate(new BigDecimal("3.5"))        // 3.5% annual interest rate
        .termYears(30)                            // 30-year term
        .build();

LoanCalculationResponse response = client.calculateLoanPayment(request);

System.out.println("Loan Summary:");
System.out.println("Monthly Payment: $" + response.getMonthlyPayment());
System.out.println("Total Interest: $" + response.getTotalInterest());
System.out.println("Total Amount: $" + response.getTotalAmount());
System.out.println("Total Payments: " + response.getTotalPayments());
```

### Investment Returns Calculation

```java
InvestmentReturnsRequest request = InvestmentReturnsRequest.builder()
        .initialInvestment(new BigDecimal("5000.00"))    // $5,000 initial investment
        .monthlyContribution(new BigDecimal("500.00"))   // $500 monthly contribution
        .expectedAnnualReturn(new BigDecimal("7.0"))     // 7% expected annual return
        .years(20)                                       // 20-year investment period
        .build();

InvestmentReturnsResponse response = client.calculateInvestmentReturns(request);

System.out.println("Investment Projection:");
System.out.println("Final Value: $" + response.getFinalValue());
System.out.println("Total Contributions: $" + response.getTotalContributions());
System.out.println("Total Returns: $" + response.getTotalReturns());
```

## Configuration

### Basic Configuration

```java
// Default configuration (production)
XFinanceClient client = new XFinanceClient("api-key", "api-secret");

// Custom base URL
XFinanceClient client = new XFinanceClient("api-key", "api-secret", "https://api-staging.xfinance.com/v1");
```

### Advanced Configuration

```java
ClientConfiguration config = ClientConfiguration.builder()
        .baseUrl("https://api.xfinance.com/v1")
        .connectTimeout(Duration.ofSeconds(30))
        .readTimeout(Duration.ofSeconds(60))
        .maxRetries(3)
        .debugLogging(true)
        .userAgent("MyApp/1.0.0")
        .build();

XFinanceClient client = new XFinanceClient("api-key", "api-secret", config);
```

### Environment-Specific Configurations

```java
// Local development
ClientConfiguration localConfig = ClientConfiguration.localConfiguration();
XFinanceClient localClient = new XFinanceClient("api-key", "api-secret", localConfig);

// Production
ClientConfiguration prodConfig = ClientConfiguration.defaultConfiguration();
XFinanceClient prodClient = new XFinanceClient("api-key", "api-secret", prodConfig);
```

## Error Handling

The SDK provides comprehensive error handling with specific exception types:

```java
try {
    CompoundInterestResponse response = client.calculateCompoundInterest(request);
    // Process successful response
    
} catch (AuthenticationException e) {
    // Handle authentication errors (401)
    System.err.println("Authentication failed: " + e.getMessage());
    
} catch (ValidationException e) {
    // Handle validation errors (400)
    System.err.println("Invalid request: " + e.getMessage());
    
} catch (NetworkException e) {
    // Handle network/connectivity errors
    System.err.println("Network error: " + e.getMessage());
    
} catch (XFinanceException e) {
    // Handle other API errors
    System.err.println("API error: " + e.getMessage());
    System.err.println("Error Code: " + e.getErrorCode());
    System.err.println("HTTP Status: " + e.getHttpStatusCode());
}
```

### Exception Hierarchy

```
XFinanceException (base)
├── AuthenticationException (401 errors)
├── ValidationException (400 errors)
└── NetworkException (network/timeout errors)
```

## API Reference

### XFinanceClient

The main client class for interacting with the X-Finance API.

#### Methods

| Method | Description | Parameters | Returns |
|--------|-------------|------------|---------|
| `calculateCompoundInterest()` | Calculate compound interest | `CompoundInterestRequest` | `CompoundInterestResponse` |
| `calculateLoanPayment()` | Calculate loan payments | `LoanCalculationRequest` | `LoanCalculationResponse` |
| `calculateInvestmentReturns()` | Calculate investment returns | `InvestmentReturnsRequest` | `InvestmentReturnsResponse` |

### Request Models

#### CompoundInterestRequest

| Field | Type | Description | Validation |
|-------|------|-------------|------------|
| `principal` | `BigDecimal` | Initial investment amount | > 0 |
| `annualRate` | `BigDecimal` | Annual interest rate (%) | > 0 |
| `years` | `Integer` | Investment period in years | ≥ 1 |
| `compoundingFrequency` | `Integer` | Compounding frequency per year | ≥ 1 |

#### LoanCalculationRequest

| Field | Type | Description | Validation |
|-------|------|-------------|------------|
| `loanAmount` | `BigDecimal` | Total loan amount | > 0 |
| `annualRate` | `BigDecimal` | Annual interest rate (%) | > 0 |
| `termYears` | `Integer` | Loan term in years | ≥ 1 |

#### InvestmentReturnsRequest

| Field | Type | Description | Validation |
|-------|------|-------------|------------|
| `initialInvestment` | `BigDecimal` | Initial investment amount | ≥ 0 |
| `monthlyContribution` | `BigDecimal` | Monthly contribution amount | ≥ 0 |
| `expectedAnnualReturn` | `BigDecimal` | Expected annual return (%) | > 0 |
| `years` | `Integer` | Investment period in years | ≥ 1 |

### Response Models

All response models include the original request parameters plus calculated results.

## Logging

The SDK uses SLF4J for logging. Configure your logging framework (Logback, Log4j, etc.) to control log output:

```xml
<!-- logback.xml example -->
<configuration>
    <logger name="com.xfinance.sdk" level="INFO"/>
    <logger name="com.xfinance.sdk.service.HttpService" level="DEBUG"/>
</configuration>
```

## Thread Safety

The `XFinanceClient` is fully thread-safe and can be safely used across multiple threads. It's recommended to create a single client instance and reuse it throughout your application.

## Testing

### Unit Tests

```bash
mvn test
```

### Integration Tests

```bash
mvn test -Pintegration
```

Set the following environment variables for integration tests:

```bash
export XFINANCE_API_KEY=your-test-api-key
export XFINANCE_API_SECRET=your-test-api-secret
export XFINANCE_BASE_URL=https://api-staging.xfinance.com/v1
```

## Building from Source

```bash
git clone https://github.com/xfinance/xfinance-java-sdk.git
cd xfinance-java-sdk
mvn clean install
```

## Contributing

We welcome contributions! Please see our [Contributing Guide](CONTRIBUTING.md) for details.

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests
5. Submit a pull request

## Support

- **Documentation**: [https://docs.xfinance.com/java-sdk](https://docs.xfinance.com/java-sdk)
- **Issues**: [GitHub Issues](https://github.com/xfinance/xfinance-java-sdk/issues)
- **Email**: support@xfinance.com

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Changelog

See [CHANGELOG.md](CHANGELOG.md) for a detailed history of changes.

---

Made with ❤️ by the X-Finance Team