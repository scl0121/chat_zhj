package com.zhj.chat_zhj.chat.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author haojie
 * @since 2021-06-26
 */
public class FriendsRequest implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String sendUserId;

    private String acceptUserId;

    /**
     * 发送请求的事件
     */
    private LocalDateTime requestDateTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }

    public String getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    public LocalDateTime getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(LocalDateTime requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    @Override
    public String toString() {
        return "FriendsRequest{" +
        "id=" + id +
        ", sendUserId=" + sendUserId +
        ", acceptUserId=" + acceptUserId +
        ", requestDateTime=" + requestDateTime +
        "}";
    }
}
