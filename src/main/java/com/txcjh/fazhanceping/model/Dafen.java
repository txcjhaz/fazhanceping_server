package com.txcjh.fazhanceping.model;

public class Dafen {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dafen.user_id
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dafen.object_id
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    private Integer objectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dafen.score
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    private Integer score;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    public Dafen(Integer userId, Integer objectId, Integer score) {
        this.userId = userId;
        this.objectId = objectId;
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    public Dafen() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dafen.user_id
     *
     * @return the value of dafen.user_id
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dafen.user_id
     *
     * @param userId the value for dafen.user_id
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dafen.object_id
     *
     * @return the value of dafen.object_id
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    public Integer getObjectId() {
        return objectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dafen.object_id
     *
     * @param objectId the value for dafen.object_id
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dafen.score
     *
     * @return the value of dafen.score
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dafen.score
     *
     * @param score the value for dafen.score
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    public void setScore(Integer score) {
        this.score = score;
    }
}