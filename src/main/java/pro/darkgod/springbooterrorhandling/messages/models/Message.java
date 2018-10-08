package pro.darkgod.springbooterrorhandling.messages.models;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Message {
    private Date createdAt;

    @NotNull
    private String message;

    @NotNull
    String nickname;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}