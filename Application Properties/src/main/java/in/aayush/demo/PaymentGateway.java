package in.aayush.demo;

import org.springframework.stereotype.Component;

@Component
public class PaymentGateway
{
    private PaymentProperties paymentProperties;

    public PaymentGateway(PaymentProperties paymentProperties)
    {
        this.paymentProperties = paymentProperties;
    }

    public String getType()
    {
        return paymentProperties.getType();
    }

    public int getRetryCount()
    {
        return paymentProperties.getRetryCount();
    }

    public int getTimeout()
    {
        return paymentProperties.getTimeout();
    }

    public boolean isEnabled()
    {
        return paymentProperties.isEnabled();
    }
//    @Value("${paymentGateway.type:GPay}")
//    private String type;
//
//    @Value("${paymentGateway.retryCount:3}")
//    private int retryCount;

}
