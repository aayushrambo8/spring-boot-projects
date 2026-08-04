package in.aayush.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerApplication
{

    public static void main(String[] args)
    {
//        ApplicationContext context =
        SpringApplication.run(RunnerApplication.class, args);
//        PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
    }

}
