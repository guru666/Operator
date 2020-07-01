package model;

public class Cell {
    private String emkost;
    private String operator;
    private String region;

    public Cell() {

    }
    public Cell(String emkost, String operator, String region) {
        this.emkost = emkost;
        this.operator = operator;
        this.region = region;
    }

    public String getEmkost() {
        return emkost;
    }

    public void setEmkost(String emkost) {
        this.emkost = emkost;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
