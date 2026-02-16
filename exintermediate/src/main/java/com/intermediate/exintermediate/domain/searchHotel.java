package com.intermediate.exintermediate.domain;

/**
 * 情報を受け取るためのdomainクラス
 */
public class searchHotel {
    
    //id
    private Integer id;
    //場所名(首都圏)
    private String areaName;
    //住所
    private String address;
    //ホテル名
    private String hotelName;
    //最寄り駅
    private String nearestStation;
    //料金
    private Integer price;
    //駐車場の有無
    private String parking;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAreaName() {
        return areaName;
    }
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public String getNearestStation() {
        return nearestStation;
    }
    public void setNearestStation(String nearestStation) {
        this.nearestStation = nearestStation;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getParking() {
        return parking;
    }
    public void setParking(String parking) {
        this.parking = parking;
    }
    @Override
    public String toString() {
        return "searchHotel [id=" + id + ", areaName=" + areaName + ", address=" + address + ", hotelName=" + hotelName
                + ", nearestStation=" + nearestStation + ", price=" + price + ", parking=" + parking + "]";
    }

    
}
