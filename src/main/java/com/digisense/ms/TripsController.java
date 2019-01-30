package com.digisense.ms;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.digisense.ms.model.GeoFence;
import com.digisense.ms.service.GeoService;

@RestController
@RequestMapping("/v1/trips")
public class TripsController 
{
    @RequestMapping(method = RequestMethod.GET)    
    public ResponseEntity<List<GeoFence>> listAllGeoFence()
	{		
		List<GeoFence> geo = GeoService.findAllGeoFence();
		if (geo.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		
		return new ResponseEntity<List<GeoFence>>(geo, HttpStatus.OK);
	}
}
