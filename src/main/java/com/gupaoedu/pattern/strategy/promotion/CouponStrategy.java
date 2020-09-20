package com.gupaoedu.pattern.strategy.promotion;

public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("Coupon Promotion...");
    }
}
