package com.halilulkr.dependencyInversion.badExample;

public class Notification {

    private Email email = new Email();
    private Sms sms = new Sms();

    public void sender(){
        email.sendEmail();
        sms.sendSms();
    }

    //Notification sınıfı yüksek seviyeli sınıf olmasına rağmen düşük seviyeli Email ve Sms sınıfına bağımlı haldedir.
    //Email ve Sms sınıfındaki fonksiyonlarda yapılacak herhangi bir değişiklik Notification sınıfınıda etkileyecek
}
