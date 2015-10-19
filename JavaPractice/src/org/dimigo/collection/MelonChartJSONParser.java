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
		// JSON String을 Parsing하여 Melon 객체에 담기
		// 필요한 데이터만 가져오기 (노래제목, 가수명)

		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonString);

			JSONObject melonJson = (JSONObject)jsonObject.get("melon");
			JSONObject songJson = (JSONObject)melonJson.get("songs");
			JSONArray songsJsonArray = (JSONArray)songJson.get("song");

//			melon.setCount((int)melonJson.get("count"));
//			melon.setMenuId((int) melonJson.get("menuId"));
//			melon.setPage((int) melonJson.get("page"));
//			melon.setTotalPages((int) melonJson.get("totalPages"));

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
//					int artist_id = (int)indexArtist.get("artistId");

					Artist artist = new Artist();
					artist.setArtistName(artist_name);
//					artist.setArtistId(artist_id);
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
