package com.welixco72.utils;

public interface EmailService {

    public void sendSimpleMessage(
      String to, String subject, String text);
}
