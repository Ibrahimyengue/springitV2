package com.ibrahimyengue.springit.service;

import com.ibrahimyengue.springit.entity.User;

public interface MailService {

    void sendEmail(String to, String subject, String content, boolean isMultiPart, boolean isHtml);
    void sendEmailFromTemplate(User user, String templateName, String subject);
    void sendActivationEmail(User user);
    void sendWelcomeEmail(User user);
}
