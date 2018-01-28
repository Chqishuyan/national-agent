package com.pay.national.agent.model.entity;

import java.util.Date;

/**
 * @author shuyan.qi
 */
public class RewardGatherDay extends  BaseEntity{

    private static final long serialVersionUID = -3594279680368386601L;

    private String userNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reward_gather_day.business_code
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    private String businessCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reward_gather_day.parent_business_code
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    private String parentBusinessCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reward_gather_day.total_amount
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    private Double totalAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reward_gather_day.day
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    private Date day;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reward_gather_day.create_time
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reward_gather_day.last_update_time
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reward_gather_day.user_no
     *
     * @return the value of reward_gather_day.user_no
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reward_gather_day.user_no
     *
     * @param userNo the value for reward_gather_day.user_no
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reward_gather_day.business_code
     *
     * @return the value of reward_gather_day.business_code
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reward_gather_day.business_code
     *
     * @param businessCode the value for reward_gather_day.business_code
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reward_gather_day.parent_business_code
     *
     * @return the value of reward_gather_day.parent_business_code
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public String getParentBusinessCode() {
        return parentBusinessCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reward_gather_day.parent_business_code
     *
     * @param parentBusinessCode the value for reward_gather_day.parent_business_code
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public void setParentBusinessCode(String parentBusinessCode) {
        this.parentBusinessCode = parentBusinessCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reward_gather_day.total_amount
     *
     * @return the value of reward_gather_day.total_amount
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reward_gather_day.total_amount
     *
     * @param totalAmount the value for reward_gather_day.total_amount
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reward_gather_day.day
     *
     * @return the value of reward_gather_day.day
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public Date getDay() {
        return day;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reward_gather_day.day
     *
     * @param day the value for reward_gather_day.day
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public void setDay(Date day) {
        this.day = day;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reward_gather_day.create_time
     *
     * @return the value of reward_gather_day.create_time
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reward_gather_day.create_time
     *
     * @param createTime the value for reward_gather_day.create_time
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reward_gather_day.last_update_time
     *
     * @return the value of reward_gather_day.last_update_time
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reward_gather_day.last_update_time
     *
     * @param lastUpdateTime the value for reward_gather_day.last_update_time
     *
     * @mbggenerated Thu Jan 25 19:21:15 CST 2018
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        return super.toString()+"RewardGatherDay{" +
                "userNo='" + userNo + '\'' +
                ", businessCode='" + businessCode + '\'' +
                ", parentBusinessCode='" + parentBusinessCode + '\'' +
                ", totalAmount=" + totalAmount +
                ", day=" + day +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }
}