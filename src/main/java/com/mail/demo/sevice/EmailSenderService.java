package com.mail.demo.sevice;

public interface EmailSenderService {
    void sendEmail(String to, String subject, String message);
}
