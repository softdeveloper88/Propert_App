package com.example.propert_app.model;import com.google.gson.annotations.Expose;import com.google.gson.annotations.SerializedName;import java.util.List;public class MyFavoriteModel {    @SerializedName("status")    @Expose    public Integer status;    @SerializedName("message")    @Expose    public String message;    @SerializedName("data")    @Expose    public Data data;    public MyFavoriteModel(Integer status, String message, Data data) {        super();        this.status = status;        this.message = message;        this.data = data;    }    public class Data {        @SerializedName("properties")        @Expose        public List<Property> properties = null;        public Data(List<Property> properties) {            super();            this.properties = properties;        }    }    public class Property {        @SerializedName("id")        @Expose        public Integer id;        @SerializedName("name")        @Expose        public String name;        @SerializedName("attachments")        @Expose        public String attachments;        @SerializedName("location")        @Expose        public String location;        @SerializedName("minprice")        @Expose        public String minprice;        @SerializedName("maxprice")        @Expose        public String maxprice;        public Property(Integer id, String name, String attachments, String location, String minprice, String maxprice) {            super();            this.id = id;            this.name = name;            this.attachments = attachments;            this.location = location;            this.minprice = minprice;            this.maxprice = maxprice;        }    }}