package live.aayush.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "staging", "local"})
public class DummyNotificationImplements implements NotificationService
{
    @Override
    public String sendNotification()
    {
        return "Here is a dev notification";
    }
}
