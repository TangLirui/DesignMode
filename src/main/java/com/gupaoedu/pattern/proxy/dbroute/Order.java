package com.gupaoedu.pattern.proxy.dbroute;

public class Order {

    private Object oderInfo;
    //订单创建时间进行按年分库
    private Long createTime;
    private String id;

    public Object getOderInfo() {
        return oderInfo;
    }

    public void setOderInfo(Object oderInfo) {
        this.oderInfo = oderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
