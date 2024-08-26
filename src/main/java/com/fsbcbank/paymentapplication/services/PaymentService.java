package com.fsbcbank.paymentapplication.services;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class PaymentService {

    private final Map<String, String> map = new HashMap<>();

    public void processpayment() {
    	getpayment();
       
    }
    public void getpayment() {
    	gettransactionid();
       
    }
    public void gettransactionid() {
    	getuserdetails();
       
    }
    public void getuserdetails() {
    	validatepayment();
       
    }
    public void validatepayment() {
    	getpayemntid();
       
    }
    public void getpayemntid() {
    	updatepayment();
       
    }
   
    public void updatepayment() {
        while (true) {
            map.put(generateRandomString(), generateRandomString());
            // Optional: Add some delay to control the speed of memory allocation
          try {
               Thread.sleep(5); // Delay for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private String generateRandomString() {
        // Generate a random string of large size
        return UUID.randomUUID().toString() + "-" + UUID.randomUUID().toString();
    }
}   
