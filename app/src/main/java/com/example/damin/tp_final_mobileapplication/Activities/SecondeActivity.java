package com.example.damin.tp_final_mobileapplication.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.damin.tp_final_mobileapplication.Adapter.DataAdapter;
import com.example.damin.tp_final_mobileapplication.Interface.OnItemSelectedListener;
import com.example.damin.tp_final_mobileapplication.Model.Video;
import com.example.damin.tp_final_mobileapplication.R;
import com.google.gson.Gson;

import java.util.List;

public class SecondeActivity extends AppCompatActivity implements OnItemSelectedListener {

    private static final String TAG = "INNNFOOOO";
    private static final String URL = "https://www.googleapis.com/youtube/v3/search?part=snippet&maxResults=6";
    public static final String API_KEY = "AIzaSyB-qSpvKVCmT2b4tM9RvJ2EvJZ5SCUah_w";
    public static String PARAM ="";


//https://www.googleapis.com/youtube/v3/search?part=snippet&maxResults=30&q=psg&key=AIzaSyB-qSpvKVCmT2b4tM9RvJ2EvJZ5SCUah_w

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);
        PARAM= getIntent().getStringExtra( new MainActivity().getKEY());
        Log.d(TAG,PARAM);
        GetDatas();
    }


    private void GetDatas() {

        StringRequest contractsRequest = new StringRequest(URL +"&q="+PARAM+"&key="+API_KEY, new Response.Listener<String>() {


            @Override
            public void onResponse(String response) {

                Log.d(TAG, "on response "+ response);

                Video videos = new Gson().fromJson(response, Video.class);

                Log.d(TAG,"Video:"+videos.getItems().get(0).getId().getKind());
                String url = videos.getItems().get(0).getSnippet().getThumbnails().getHigh().getUrl();
                Log.d(TAG,url);


                //Items items = new Gson().fromJson(response, Items.class);
                setAdapter(videos.getItems());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Contracts", "Error");
            }
        });

        Volley.newRequestQueue(this).add(contractsRequest);
    }


    private void setAdapter(List<Video.Item> ItemList) {

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        DataAdapter adapter = new DataAdapter(getApplicationContext(),ItemList);
        adapter.setOnItemSelectedListener(this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onContractSelected(Video.Item item) {
        YoutubePlayer.Start(this,item.getId().getVideoId(), item.getSnippet().getDescription());
    }
}
