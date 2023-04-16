package com.welixo.utils;

public interface EmailService {

    public void sendSimpleMessage(
      String to, String subject, String text);
}
