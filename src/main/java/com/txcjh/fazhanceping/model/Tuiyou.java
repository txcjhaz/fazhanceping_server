package com.txcjh.fazhanceping.model;

public class Tuiyou {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tuiyou.user_id
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tuiyou.recommended_user_id
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    private Integer recommendedUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tuiyou.isExcelent
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    private Boolean isexcelent;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public Tuiyou(Integer userId, Integer recommendedUserId, Boolean isexcelent) {
        this.userId = userId;
        this.recommendedUserId = recommendedUserId;
        this.isexcelent = isexcelent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public Tuiyou() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tuiyou.user_id
     *
     * @return the value of tuiyou.user_id
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tuiyou.user_id
     *
     * @param userId the value for tuiyou.user_id
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tuiyou.recommended_user_id
     *
     * @return the value of tuiyou.recommended_user_id
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public Integer getRecommendedUserId() {
        return recommendedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tuiyou.recommended_user_id
     *
     * @param recommendedUserId the value for tuiyou.recommended_user_id
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public void setRecommendedUserId(Integer recommendedUserId) {
        this.recommendedUserId = recommendedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tuiyou.isExcelent
     *
     * @return the value of tuiyou.isExcelent
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public Boolean getIsexcelent() {
        return isexcelent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tuiyou.isExcelent
     *
     * @param isexcelent the value for tuiyou.isExcelent
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public void setIsexcelent(Boolean isexcelent) {
        this.isexcelent = isexcelent;
    }
}