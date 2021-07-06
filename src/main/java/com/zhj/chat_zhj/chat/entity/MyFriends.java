package com.zhj.chat_zhj.chat.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class MyFriends implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 用户id
     */
    private String myUserId;

    /**
     * 用户的好友id
     */
    private String myFriendUserId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMyUserId() {
        return myUserId;
    }

    public void setMyUserId(String myUserId) {
        this.myUserId = myUserId;
    }

    public String getMyFriendUserId() {
        return myFriendUserId;
    }

    public void setMyFriendUserId(String myFriendUserId) {
        this.myFriendUserId = myFriendUserId;
    }

    @Override
    public String toString() {
        return "MyFriends{" +
        "id=" + id +
        ", myUserId=" + myUserId +
        ", myFriendUserId=" + myFriendUserId +
        "}";
    }
}
