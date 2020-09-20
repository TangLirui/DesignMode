package com.gupaoedu.pattern.strategy.promotion;


public class PromotionActivityTest {

    public static void main(String[] args) {
        /*PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new CashBackStrategy());

        activity1111.excute();
        activity618.excute();

        PromotionActivity promotionActivity = null;
        String promotionKey = "COUPON";*/

       /* if("COUPON".equals(promotionKey)) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        } else if("CASHBACK".equals(promotionKey)) {
            promotionActivity = new PromotionActivity(new CashBackStrategy());
        }
        promotionActivity.excute();*/

       String promotionKey = "GROUPBUY";
       PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));

       promotionActivity.excute();
    }
}
