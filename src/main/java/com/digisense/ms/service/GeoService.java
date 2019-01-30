package com.digisense.ms.service;

import java.util.ArrayList;
import java.util.List;

import com.digisense.ms.model.GeoFence;

public class GeoService {
	
	public static List<GeoFence> findAllGeoFence()
	{
		List<GeoFence> geo = new ArrayList<GeoFence>();
		
		for(int i = 0; i<=10; i++)
		{
			GeoFence g = new GeoFence("long"+i, "lat"+i);
			
			geo.add(g);
		}
		
		return geo;
	}

}
