package com.gupaoedu.pattern.strategy.promotion;

public class GroupBuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("GroupBuy Promotion...");
    }
}
