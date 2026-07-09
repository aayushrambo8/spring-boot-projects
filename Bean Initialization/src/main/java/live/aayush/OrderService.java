package live.aayush;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{
    private PaymentService paymentService;

    public OrderService()
    {
        this.paymentService = new PaymentService();
        System.out.println("OrderService created");
    }
}
