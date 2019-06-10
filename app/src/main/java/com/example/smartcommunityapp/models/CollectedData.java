package com.example.smartcommunityapp.models;

public class CollectedData {
    private String _type;
    private String _value;
    private String _timestamp;
    private boolean _isValid;

    public CollectedData(String type, String value, String timestamp, boolean isValid){
        _type = type;
        _value = value;
        _timestamp = timestamp;
        _isValid = isValid;
    }

    // Getters
    public String getType(){
        return _type;
    }

    public String getValue(){
        return _value;
    }

    public String getTimestamp(){
        return _timestamp;
    }

    public boolean getIsValid(){
        return _isValid;
    }

    // Setters

    public void setType(String type){
        _type = type;
    }

    public void setValue(String value){
        _value = value;
    }

    public void setTimestamp(String timestamp){
        _timestamp = timestamp;
    }

    public void setIsValid(boolean isValid){
        _isValid = isValid;
    }
}
