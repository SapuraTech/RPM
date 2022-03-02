package com.example.rpm;

public class Notification {
    String title, subtitle, timer;

    public Notification(String title, String subtitle, String timer) {
        this.title = title;
        this.subtitle = subtitle;
        this.timer = timer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }
}
