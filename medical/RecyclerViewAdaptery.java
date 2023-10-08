package com.example.medical;

import android.media.Image;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdaptery extends
        RecyclerView.Adapter<ReyclerViewAdaptery.ImageViewHolder> {

    Context mContext;
    List<row> mData;

    public RecyclerViewAdaptery(Conntext mContext,List<row> mData){
        this.mContext=m.Context;
        this.mData=mData;
    }
    public class ImageViewHolder extends RecyclerView.ViewHolder implements
            View.onClickListener{

        ImageView img;

        @Override
        public void onClick(View view){
            if(getLayoutPosition()==0){
                Toast.makeTest(mContext
                        text:"You Clicked first Item"+getLayoutPosition(),
                        Toast.LENGTH_SHORT).show();
            }
            @Override
                    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int){
                try {
                    View view=LayoutInflater.from(mContext)
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                return new imageViewHolder(view);
            }

        }

    }




}
