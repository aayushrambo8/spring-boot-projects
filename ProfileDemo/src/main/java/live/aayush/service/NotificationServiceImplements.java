package live.aayush.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("production")
public class NotificationServiceImplements implements NotificationService
{
    @Override
    public String sendNotification()
    {
        return "Here is a dummy notification";
    }
}
