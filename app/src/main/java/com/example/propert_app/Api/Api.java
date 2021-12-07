package com.example.propert_app.Api;

import com.example.propert_app.model.AgentModel;
import com.example.propert_app.model.CategoryModel;
import com.example.propert_app.model.HomeModel;
import com.example.propert_app.model.MyFavoriteModel;
import com.example.propert_app.model.PropertyDetailModel;
import com.example.propert_app.model.SubCategoryModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("agents")
    Call<AgentModel> getAllAgents();

    @GET("favorites")
    Call<MyFavoriteModel> getFavorite(@Query("user_id") String user_id);

    @GET("home")
    Call<HomeModel> getHomeData();

    @GET("property-details")
    Call<PropertyDetailModel> getPropertyDetails(@Query("property_id") int property_id);

    @GET("categories")
    Call<CategoryModel> getAllCategories();

    @GET("sub-categories")
    Call<SubCategoryModel> getSubCategoryData(@Query("category_id") int category_id);





//
//    @POST("/api/posts")
//    Call<Post> addNewPost(@Body NewPostModel body);
//
//    @POST("/api/comments")
//    Call<Object> addComments(@Body CommentsModel body);
//
//    @Multipart
//    @POST("/api/upload?folder=user")
//    Call<Responses> uploadImage(@Part MultipartBody.Part image);
//
//    @POST("/api/Feedback")
//    Call<Object> addFeedback(@Body AddFeedback body);
//


//    @POST("/api/users/login")
//    Call<UserData> login(@Body LoginModel body);
//
//    @POST("/api/users")
//    Call<UserData> signUp(@Body SignUpData body);
//
//    @GET("/api/users")
//    Call<UserData> checkEmail(@Query("email") String  email);
//
//    @Headers("Content-Type: application/json")
//    @POST("/v1/shortLinks")
//    Call<DeepLinkResponseModel> DeepLink(@Query("key") String key, @Body DeepLinkModel body);

//    @POST("/api/v1/rides/move")
//    Call<Object> sendCurrentLocation(@Body CurrentLocation body, @Header("Accept") String value, @Header("Authorization") String authorized);
//
//    @POST("/api/v1/rides/complete")
//    Call<Object> completeRide(@Body Rides body, @Header("Accept") String value, @Header("Authorization") String authorized);
//
//    @POST("/api/v1/rides/cancel")
//    Call<Object> cancelRide(@Body Rides body, @Header("Accept") String value, @Header("Authorization") String authorized);
//
//    @GET("/api/v1/rides/{ride_id}")
//    Call<Object> showRideDetails(@Path("ride_id") String id, @Header("Accept") String value, @Header("Authorization") String authorized);
//
//    @GET("/api/v1/orders")
//    Call<OrdersModel> getOrderModel(@Header("Accept") String value, @Header("Authorization") String authorized);
//
//    @POST("/api/v1/oauth/revoke")
//    Call<Object> logout(@Header("Content-Type") String value, @Header("Authorization") String authorized);

}
