package com.example.smartcommunityapp.Models;

public class Beacon {
    private String _uid;
    private String _location;
    private boolean _isActive;

    public Beacon(String uid, String location, boolean isActive){
        _uid = uid;
        _location = location;
        _isActive = isActive;
    }

    // Getters
    public String getUid(){
        return _uid;
    }

    public String getLocation(){
        return _location;
    }

    public boolean isActive(){
        return _isActive;
    }

    // Setters

    public void setUid(String uid){
        _uid = uid;
    }

    public void setLocation(String location){
        _location = location;
    }

    public void setIsActive(boolean isActive){
        _isActive = isActive;
    }
}
