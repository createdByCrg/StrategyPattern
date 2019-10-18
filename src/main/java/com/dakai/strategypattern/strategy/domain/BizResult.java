package com.dakai.strategypattern.strategy.domain;

/**
 * 业务处理返回对象
 * @author ChenErGao
 * @date 2019/8/30 11:38 下午
 */
public class BizResult<T> {

    /**
     * 是否执行成功标记，默认为成功
     */
    private boolean isSuccess = true;

    /**
     * 执行后返回结果
     */
    private T result;

    public BizResult(){

    }

    public BizResult(boolean isSuccess){

        this.isSuccess = isSuccess;
    }

    public BizResult(T result){

        this.result = result;
    }

    public BizResult(boolean isSuccess, T result){

        this.isSuccess = isSuccess;
        this.result = result;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "BizResult{" +
                "isSuccess=" + isSuccess +
                ", result=" + result +
                '}';
    }
}
