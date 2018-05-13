package com.money.debt.bean;

import java.util.Date;

public class MessageReminder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminder.id
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminder.remind_type
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private Integer remindType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminder.remind_target
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private String remindTarget;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminder.content
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminder.is_read
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private Integer isRead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminder.url
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminder.title
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminder.create_emp_id
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private String createEmpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminder.create_time
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminder.modify_time
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminder.id
     *
     * @return the value of message_reminder.id
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminder.id
     *
     * @param id the value for message_reminder.id
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminder.remind_type
     *
     * @return the value of message_reminder.remind_type
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public Integer getRemindType() {
        return remindType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminder.remind_type
     *
     * @param remindType the value for message_reminder.remind_type
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setRemindType(Integer remindType) {
        this.remindType = remindType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminder.remind_target
     *
     * @return the value of message_reminder.remind_target
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public String getRemindTarget() {
        return remindTarget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminder.remind_target
     *
     * @param remindTarget the value for message_reminder.remind_target
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setRemindTarget(String remindTarget) {
        this.remindTarget = remindTarget == null ? null : remindTarget.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminder.content
     *
     * @return the value of message_reminder.content
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminder.content
     *
     * @param content the value for message_reminder.content
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminder.is_read
     *
     * @return the value of message_reminder.is_read
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public Integer getIsRead() {
        return isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminder.is_read
     *
     * @param isRead the value for message_reminder.is_read
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminder.url
     *
     * @return the value of message_reminder.url
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminder.url
     *
     * @param url the value for message_reminder.url
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminder.title
     *
     * @return the value of message_reminder.title
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminder.title
     *
     * @param title the value for message_reminder.title
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminder.create_emp_id
     *
     * @return the value of message_reminder.create_emp_id
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public String getCreateEmpId() {
        return createEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminder.create_emp_id
     *
     * @param createEmpId the value for message_reminder.create_emp_id
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setCreateEmpId(String createEmpId) {
        this.createEmpId = createEmpId == null ? null : createEmpId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminder.create_time
     *
     * @return the value of message_reminder.create_time
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminder.create_time
     *
     * @param createTime the value for message_reminder.create_time
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminder.modify_time
     *
     * @return the value of message_reminder.modify_time
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminder.modify_time
     *
     * @param modifyTime the value for message_reminder.modify_time
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}