package com.zee.zee5_app.repository;

import com.zee.zee5_app.dto.Movie;

public class MovieRepository {

		private Movie[] movies = new Movie[10];
		
		private static int movieCount=-1;
		public MovieRepository() {
			// TODO Auto-generated constructor stub
		}
		
		public String addMovie(Movie movie) {
			if(movieCount==movies.length-1) {
				Movie temp[]=new Movie[movies.length*2];
				System.arraycopy(movies,0, temp, 0, movies.length);
				movies=temp;
				
			}
			movies[++movieCount]=movie;
			return "sucess";
			
			
		}
		
		public Movie getMovieById(String id) {
			for(Movie series:movies) {
				if(movies !=null && Movie.getId().equals(id))
					return Movie;
			}
			return null;
		}
		public Series[] getAllSeries() {
			return seriess;
		}
		public String modifySeries(String id,Series series) {
			for(int i=0;i<seriess.length;i++) {
				if(seriess[i].getId().equals(id)) {
					seriess[i]=series;
					return "modified";
				}
			}
			return "does mot exist";
			
		}
		public String deleteSeries(String id) {
			for(int i=0;i<seriess.length;i++)
			{
				if(seriess[i].getId().equals(id)) {
					System.arraycopy(seriess, i+1, seriess, i, seriesCount-i);
					seriess[seriesCount--]=null;
					return "Deleted";
					
				}
			}
			return "DNE";
			
		}
		
		
		
		
		private static SeriesRepository seriesRepository;
		public static SeriesRepository getInstance() {

			if(seriesRepository==null)
				seriesRepository = new SeriesRepository();
			return seriesRepository;

		}
		
		
		
		
	}
