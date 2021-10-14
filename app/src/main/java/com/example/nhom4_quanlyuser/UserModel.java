package com.example.nhom4_quanlyuser;

public class UserModel {
    String login;
    String id;
    String avatar_url;
    String url;

    public UserModel() {

    }

    public UserModel(String login, String id, String avatar_url, String url) {
        this.login = login;
        this.id = id;
        this.avatar_url = avatar_url;
        this.url = url;
    }

    @Override
    public String toString() {
        return "{" + login + '\'' +
                id + '\'' + avatar_url + '\'' +
                url + '\'' +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
