package com.clashbots.notification.service;

import com.clashbots.notification.entity.Notification;
import com.clashbots.notification.repository.NotificationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    public Notification saveNotification(Notification notification) {
        log.info("inside save user method of UserService");
        return notificationRepository.save(notification);
    }

    public Notification findNotificationById(Long notificationId) {
        log.info("inside find user by id method of UserService");
        return notificationRepository.findByNotificationId(notificationId);
    }
}
