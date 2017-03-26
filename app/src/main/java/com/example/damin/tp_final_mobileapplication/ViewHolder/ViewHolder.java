package com.example.damin.tp_final_mobileapplication.ViewHolder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.damin.tp_final_mobileapplication.Interface.OnItemSelectedListener;
import com.example.damin.tp_final_mobileapplication.Model.Video;
import com.example.damin.tp_final_mobileapplication.R;
import com.squareup.picasso.Picasso;

/**
 * Created by damin on 25/03/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder{

    TextView titre_video;
    TextView description_video;
    ImageView image_video;
    OnItemSelectedListener onContractSelectedListener;

    public ViewHolder(View view) {
        super(view);

        titre_video = (TextView)view.findViewById(R.id.titre_video);

        description_video=(TextView)view.findViewById(R.id.description_video);

        image_video = (ImageView)view.findViewById(R.id.image_video);

    }


    public void bind(final Video.Item item, Context context){

        titre_video.setText(item.getSnippet().getTitle());
        description_video.setText((item.getSnippet().getDescription()));
        Picasso.with(context).load(item.getSnippet().getThumbnails().getHigh().getUrl()).resize(500,500).into(image_video);

        itemView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View V) {

                if (onContractSelectedListener == null) {
                    return;
                }
                onContractSelectedListener.onContractSelected(item);

            }
        });
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onContractSelectedListener) {
        this.onContractSelectedListener = onContractSelectedListener;
    }

}
