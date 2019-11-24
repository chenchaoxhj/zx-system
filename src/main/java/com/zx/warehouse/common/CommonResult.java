package com.zx.warehouse.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.util.Assert;

import java.io.Serializable;

public final class CommonResult<T> implements Serializable {

    public static Integer CODE_SUCCESS = 200;

    /**
     * 错误码
     */
    private Integer retCode;
    /**
     * 错误提示
     */
    private String retMessage;
    /**
     * 返回数据
     */
    private T data;

    /**
     * 将传入的 result 对象，转换成另外一个泛型结果的对象
     *
     * 因为 A 方法返回的 CommonResult 对象，不满足调用其的 B 方法的返回，所以需要进行转换。
     *
     * @param result 传入的 result 对象
     * @param <T> 返回的泛型
     * @return 新的 CommonResult 对象
     */
    public static <T> CommonResult<T> error(CommonResult<?> result) {
        return error(result.getRetCode(), result.getRetMessage());
    }

    public static <T> CommonResult<T> error(Integer code, String message) {
        Assert.isTrue(!CODE_SUCCESS.equals(code), "retCode 必须是错误的！");
        CommonResult<T> result = new CommonResult<>();
        result.retCode = code;
        result.retMessage = message;
        return result;
    }

    public static <T> CommonResult<T> success(T data, String message) {
        CommonResult<T> result = new CommonResult<>();
        result.retCode = CODE_SUCCESS;
        result.data = data;
        result.retMessage = message;
        return result;
    }

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }

    public void setRetMessage(String retMessage) {
        this.retMessage = retMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return CODE_SUCCESS.equals(retCode);
    }

    @JsonIgnore
    public boolean isError() {
        return !isSuccess();
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "retCode=" + retCode +
                ", retMessage='" + retMessage + '\'' +
                ", data=" + data +
                '}';
    }
}
