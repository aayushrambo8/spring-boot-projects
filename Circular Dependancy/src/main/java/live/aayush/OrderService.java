package live.aayush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{
    @Autowired
    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService)
//    {
//        this.paymentService = paymentService;
//    }

    public void placeOrder()
    {
        paymentService.pay();
        System.out.println("Order Placed");
        getOrderDetails();

    }

    public void getOrderDetails()
    {
        System.out.println("Order Details");
    }
}
