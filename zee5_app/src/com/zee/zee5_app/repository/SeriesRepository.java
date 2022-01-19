package com.zee.zee5_app.repository;

import com.zee.zee5_app.dto.Series;

public class SeriesRepository {
	private Series[] seriess = new Series[10];
	
	private static int seriesCount=-1;
	public SeriesRepository() {
		// TODO Auto-generated constructor stub
	}
	
	public String addSeries(Series series) {
		if(seriesCount==seriess.length-1) {
			Series temp[]=new Series[seriess.length*2];
			System.arraycopy(seriess,0, temp, 0, seriess.length);
			seriess=temp;
			
		}
		seriess[++seriesCount]=series;
		return "sucess";
		
		
	}
	
	public Series getSeriesById(String id) {
		for(Series series:seriess) {
			if(series!=null && series.getId().equals(id))
				return series;
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
