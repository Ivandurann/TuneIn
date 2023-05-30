package com.example.aut2_03aplicacinfinalandroid.MusicLogic;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aut2_03aplicacinfinalandroid.R;

import java.util.ArrayList;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.ViewHolder> {

    private ArrayList<AudioModel> songsList;
    private Context context;

    public MusicListAdapter(ArrayList<AudioModel> songsList, Context context) {
        this.songsList = songsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AudioModel songData = songsList.get(position);
        holder.bind(songData);
    }

    @Override
    public int getItemCount() {
        return songsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView titleTextView;
        private ImageView iconImageView, iconFavoriteView, iconAddView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.music_title_text);
            iconImageView = itemView.findViewById(R.id.icon_view);
            iconFavoriteView = itemView.findViewById(R.id.icon_view_favorite);
            iconAddView = itemView.findViewById(R.id.icon_view_add);
            titleTextView.setOnClickListener(this);
            iconFavoriteView.setOnClickListener(this);
        }

        public void bind(AudioModel songData) {
            titleTextView.setText(songData.getTitle());

            if (SongReproducer.currentIndex == getAdapterPosition()) {
                titleTextView.setTextColor(Color.parseColor("#FF0000"));
            } else {
                titleTextView.setTextColor(Color.parseColor("#000000"));
            }
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position != RecyclerView.NO_POSITION) {
                AudioModel songData = songsList.get(position);

                if (v == titleTextView) {

                    // Title section
                    SongReproducer.getInstance().reset();
                    SongReproducer.currentIndex = position;
                    Intent intent = new Intent(context, MusicPlayerActivity.class);
                    intent.putExtra("LIST", songsList);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                } else if (v == iconFavoriteView) {

                    // Favorite section
                    songData.setFavorite(!songData.isFavorite());
                    if (songData.isFavorite()) {
                        iconFavoriteView.setImageResource(R.drawable.fullheart);
                    } else {
                        iconFavoriteView.setImageResource(R.drawable.emptyheart);
                    }
                }
            }
        }
    }
}
