package com.example.sendandreceive;

public class upload {
//    private String mName;
    private String mImageUrl;
    public upload(){

    }
    public upload(String name,String imageurl){
        if(name.trim().equals("")){
            name ="No Name";
        }
//        mName=name;
        mImageUrl=imageurl;
    }
//    public String getName (){
//        return mName;
//    }
//    public void setName(String name){
//        mName=name;
//    }
    public String getImage(){
        return mImageUrl;
    }
    public void setImageUrl(String image){
        mImageUrl =image;
    }
}
