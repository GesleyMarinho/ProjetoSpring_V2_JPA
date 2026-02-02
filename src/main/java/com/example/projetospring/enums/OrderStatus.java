package com.example.projetospring.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELLED(5);

    private int code;

    OrderStatus(int value) {
        this.code = value;
    }


    public int getCode() {
        return code;
    }


    public static OrderStatus valueOf(int value) {
        for (OrderStatus status : OrderStatus.values()) {

            if (status.getCode() == value) {
                return status;

            }

        }
        throw new IllegalArgumentException("valor invalido para o OrderStatus");
    }
}

