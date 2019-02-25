package com.mota;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class ExampleSMS {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "------------------------------";
    public static final String AUTH_TOKEN = "----------------------------";

    public static void send(String str) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message
                .creator(new PhoneNumber("+380XXXXXXX"),
                        /*my phone number*/
                        new PhoneNumber("+17XXXXXXXX"), str).create();
        /*attached to me number*/
    }

    public static void main(String[] args) {
        ExampleSMS.send("WOW");
    }
}
