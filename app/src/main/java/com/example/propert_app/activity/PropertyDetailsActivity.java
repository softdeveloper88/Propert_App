package com.example.propert_app.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.propert_app.Api.Api;
import com.example.propert_app.Api.RetrofitInstance;
import com.example.propert_app.R;
import com.example.propert_app.activity.user.MyFovritesActivity;
import com.example.propert_app.model.PropertyDetailModel;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PropertyDetailsActivity extends AppCompatActivity implements OnMapReadyCallback {
    TextView txt_description;
    TextView tv_price, tv_price_month, tv_bedroom, tv_bathroom, tv_area, tv_description, ic_parking, ic_security, ic_balcony, ic_pool,
            ic_ac, ic_cctv, tv_type, tv_electrice_watt, tv_property_type,
            tv_price_area, tv_size_area, tv_furniture, tv_floor, tv_location, tv_title;
    ImageSlider imageSlider;
    GoogleMap googleMaps;
    int detailsId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_details);
        detailsId=getIntent().getIntExtra("id",0);
        txt_description = findViewById(R.id.txt_description);
        tv_price = findViewById(R.id.tv_price);
        tv_price_month = findViewById(R.id.tv_price_month);
        tv_bedroom = findViewById(R.id.tv_bedroom);
        tv_bathroom = findViewById(R.id.tv_bathroom);
        tv_area = findViewById(R.id.tv_area);
        tv_description = findViewById(R.id.tv_description);
        ic_parking = findViewById(R.id.ic_parking);
        ic_security = findViewById(R.id.ic_security);
        ic_balcony = findViewById(R.id.ic_balcony);
        ic_pool = findViewById(R.id.ic_pool);
        ic_ac = findViewById(R.id.ic_ac);
        ic_cctv = findViewById(R.id.ic_cctv);
        tv_type = findViewById(R.id.tv_type);
        tv_electrice_watt = findViewById(R.id.tv_electrice_watt);
        tv_property_type = findViewById(R.id.tv_property_type);
        tv_price_area = findViewById(R.id.tv_price_area);
        tv_size_area = findViewById(R.id.tv_size_area);
        tv_furniture = findViewById(R.id.tv_furniture);
        tv_floor = findViewById(R.id.tv_floor);
        tv_location = findViewById(R.id.tv_location);
        tv_title = findViewById(R.id.tv_title);
        imageSlider = findViewById(R.id.image_slider);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);

        txt_description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PropertyDetailsActivity.this, MyFovritesActivity.class));
            }
        });

        getPropertyDetails();

        return;
    }

    private void getPropertyDetails() {

        Api service = RetrofitInstance.getRetrofitInstance().create(Api.class);
//        String bear = "Bearer";
//        String authorized = bear + " " + AppData.ACCESS_TOKEN;
//        String val = "application/json";
        Call<PropertyDetailModel> call = service.getPropertyDetails(detailsId);
        call.enqueue(new Callback<PropertyDetailModel>() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onResponse(Call<PropertyDetailModel> call, Response<PropertyDetailModel> response) {


                if (response.isSuccessful()) {

                    PropertyDetailModel propertyDetailModel = response.body();

                    assert propertyDetailModel != null;
                    tv_price.setText("Rs" + propertyDetailModel.data.property.price);
                    tv_bedroom.setText(propertyDetailModel.data.property.bedroom + " Bedrooms");
                    tv_bathroom.setText(propertyDetailModel.data.property.bathroom + " Bathroom");
                    tv_area.setText(propertyDetailModel.data.property.squareArea + "Area");
                    tv_property_type.setText(propertyDetailModel.data.property.propertyType);
                    tv_type.setText(propertyDetailModel.data.property.postType);
                    tv_electrice_watt.setText(propertyDetailModel.data.property.electricalWatt + "Rs/Watt");
                    tv_location.setText(propertyDetailModel.data.property.location);
                    tv_title.setText(propertyDetailModel.data.property.name);

                    String[] features = propertyDetailModel.data.property.featuers.split(",");
                    for (int i = 0; i < features.length; i++) {
                        if (features[i].equals("Parking")) {
                            ic_parking.setVisibility(View.VISIBLE);
                        } else if (features[i].equals("Parking")) {
                            ic_parking.setVisibility(View.VISIBLE);

                        } else if (features[i].equals("Security")) {
                            ic_security.setVisibility(View.VISIBLE);

                        } else if (features[i].equals("Balcony")) {
                            ic_balcony.setVisibility(View.VISIBLE);

                        } else if (features[i].equals("Pool")) {
                            ic_pool.setVisibility(View.VISIBLE);

                        } else if (features[i].equals("Ac")) {
                            ic_ac.setVisibility(View.VISIBLE);

                        } else if (features[i].equals("CCTV")) {
                            ic_cctv.setVisibility(View.VISIBLE);

                        }
                    }

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        tv_description.setText(Html.fromHtml(propertyDetailModel.data.property.description, Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        tv_description.setText(Html.fromHtml(propertyDetailModel.data.property.description));
                    }

                    // Create image list
                    List<PropertyDetailModel.Attachment> attachmentArrayList = new ArrayList<>(propertyDetailModel.data.property.attachments);
                    List<SlideModel> imageList = new ArrayList<>();
                    for (int i = 0; i < attachmentArrayList.size(); i++) {
                     imageList.add(new SlideModel(attachmentArrayList.get(i).attachment, ScaleTypes.FIT));

                    }
                    imageSlider.setImageList(imageList);

                    final LatLng latLng = new LatLng(33.3333 , 73.2222);
                    googleMaps.addMarker(new MarkerOptions().position(latLng).title("Marker in Property"));
                    googleMaps.moveCamera(CameraUpdateFactory.newLatLng(latLng));

                } else {


                    Toast.makeText(PropertyDetailsActivity.this, "some thing when wrong", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<PropertyDetailModel> call, Throwable t) {

                Log.d("data", t.toString());

            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

       googleMaps=googleMap;
    }
}