package com.example.favmusic;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicAdapter extends ArrayAdapter<Musics>{
	MusicActivity ms = new MusicActivity();
	private Context ctx;
	private int layout;
	private ArrayList<Musics> data;
	
	public MusicAdapter(Context ctx, int layout, ArrayList<Musics> objects){
		super(ctx, layout, objects);
		this.ctx = ctx;
		this.layout = layout;
		this.data = objects;
	}
	

		public View getView(int position, View convertView, ViewGroup parent){
				View v = convertView;
				if(v == null){
					LayoutInflater vi = (LayoutInflater)this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
					v = vi.inflate(this.layout, null);
				}
				
				ImageView imageView = (ImageView)v.findViewById(R.id.image);
				TextView title = (TextView)v.findViewById(R.id.title);
				TextView artist = (TextView)v.findViewById(R.id.artist);
				
				Musics music = getItem(position);
				title.setText(music.getTitle());

				imageView.setImageResource(music.getImage());	
				artist.setText(music.getDescription());
				return v;
		}
		
		public Musics getItem(int index){
			return this.data.get(index);
		}
		
}
