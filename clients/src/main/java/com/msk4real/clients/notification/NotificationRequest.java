package com.msk4real.clients.notification;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerEmail,
        String message) {

    public NotificationRequest(Integer toCustomerId, String toCustomerEmail, String message) {
        this.toCustomerId = toCustomerId;
        this.toCustomerEmail = toCustomerEmail;
        this.message = message;
    }

    public Integer toCustomerId() {
        return this.toCustomerId;
    }

    public String toCustomerEmail() {
        return this.toCustomerEmail;
    }

    public String message() {
        return this.message;
    }
}
