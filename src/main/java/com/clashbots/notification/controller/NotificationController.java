package com.clashbots.notification.controller;

//import com.clashbots.comment.RabbitmqSender;
import com.clashbots.notification.entity.Notification;
import com.clashbots.notification.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
@Slf4j
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping("/")
    public Notification saveNotification(@RequestBody Notification notification){
        log.info("inside save user method of UserController");
        return notificationService.saveNotification(notification);
    }

    @GetMapping("/{id}")
    public Notification findNotificationById(@PathVariable("id") Long notificationId){
        log.info("inside find user by id method of UserController");
        return notificationService.findNotificationById(notificationId);
    }

//    private RabbitmqSender rabbitMqSender;
//    @Autowired
//    public CommentController(RabbitmqSender rabbitMqSender) {
//        this.rabbitMqSender = rabbitMqSender;
//    }

//    @GetMapping("/rabbitmq/contract/{id}")
//    public String testRabbitmqContract(@PathVariable("id") Long userId) {
//        log.info("inside find user by id with contract method of UserController");
//        rabbitMqSender.send(userId);
//        return "Message has been sent Successfully: " + userId;
//    }
}
