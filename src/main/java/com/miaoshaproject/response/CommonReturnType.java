package com.miaoshaproject.response;

public class CommonReturnType {
    /**
     * 表明对应请求的返回处理结果“success”或“fail”
     */
    private String status;

    //若status为success,则返回json数据
    //若为fail，则返回错误码
    private Object data;

    //定义通用的创建方法
    public static CommonReturnType create(Object result){
        return CommonReturnType.creat(result,"success");
    }
    public static CommonReturnType creat(Object result,String status){
         CommonReturnType type=new CommonReturnType();
         type.setStatus(status);
         type.setData(result);
         return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
