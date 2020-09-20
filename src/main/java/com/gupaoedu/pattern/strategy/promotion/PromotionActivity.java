package com.gupaoedu.pattern.strategy.promotion;

public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void excute() {
        this.promotionStrategy.doPromotion();
    }
}
