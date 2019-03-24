package ru.gotoqa.sp.models;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * @author Muflikhunov Roman
 */

public class PhonesByCardNumberRq {
    @JsonView
    private String rqUid;
    Messages MessagesObject;

    public String getRqUid() {
        return rqUid;
    }

    public void setRqUid(String rqUid) {
        this.rqUid = rqUid;
    }

    public Messages getMessages() {
        return MessagesObject;
    }

    public void setMessages( Messages messagesObject ) {
        this.MessagesObject = messagesObject;
    }

    @Override
    public String toString() {
        return "PhonesByCardNumberRq{" +
                "rqUid='" + rqUid + '\'' +
                ", MessagesObject=" + MessagesObject +
                '}';
    }
}
