
/**
 * Made by : Jusneong Kim
 *
 * The MIT License (MIT)

 * Copyright (c) <2015> <Junseong Kim>

 * Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:
 */


package org.dimigo.collection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;

public class MelonChartJSONParser {
	
	public static Melon parse(String jsonString)
	{
		Melon melon = new Melon();

		ArrayList<Song> songs = new ArrayList<>();

		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonString);

			JSONObject melonJson = (JSONObject)jsonObject.get("melon");
			JSONObject songJson = (JSONObject)melonJson.get("songs");
			JSONArray songsJsonArray = (JSONArray)songJson.get("song");

			for(Object song : songsJsonArray)
			{
				JSONObject jsonsong = (JSONObject)song;

				String song_name = (String)jsonsong.get("songName");

				JSONObject artistTemp = (JSONObject)jsonsong.get("artists");
				JSONArray artistArray = (JSONArray)artistTemp.get("artist");

				ArrayList<Artist> artists = new ArrayList<>();

				for(Object ob : artistArray)
				{
					JSONObject indexArtist = (JSONObject)ob;
					String artist_name = (String)indexArtist.get("artistName");

					Artist artist = new Artist();
					artist.setArtistName(artist_name);

					artists.add(artist);
				}

				Song newSong = new Song();
				newSong.setSongName(song_name);
				newSong.setArtists(artists);

				songs.add(newSong);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		melon.setSongs(songs);
		return melon;
	}

}
