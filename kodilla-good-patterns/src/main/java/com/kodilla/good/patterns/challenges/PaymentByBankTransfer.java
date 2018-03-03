package com.kodilla.good.patterns.challenges;

public class PaymentByBankTransfer implements PaymentMethod {

    private String accountNumber;
    private String sellerName;

    public PaymentByBankTransfer(String accountNumber, String sellerName) {
        this.accountNumber = accountNumber;
        this.sellerName = sellerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getSellerName() {
        return sellerName;
    }

    @Override
    public void sendPaymentInfo() {
        System.out.println("Your payment info:\nSeller name: " + this.sellerName);
        System.out.println("Bank account number to pay: " + this.accountNumber);
    }
}
