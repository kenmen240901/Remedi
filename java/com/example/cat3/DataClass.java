package com.example.cat3;

public class DataClass {
    private String dataTitle;
    private String dataDesc; // Change the data type to String
    private String dataDate;

    public String getDataTitle() {
        return dataTitle;
    }

    public String getDataDesc() { // Change the return type to String
        return dataDesc;
    }

    public String getDataDate() {
        return dataDate;
    }

    public DataClass(String dataTitle, String dataDesc, String dataDate) { // Change the parameter type to String
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataDate = dataDate;
    }
}
