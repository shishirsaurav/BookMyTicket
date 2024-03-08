package com.Learning.MovieTicket.controller;

import com.Learning.MovieTicket.resource.ShowResource;
import com.Learning.MovieTicket.service.ShowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/show")
public class ShowController {

	@Autowired
	private ShowService showService;

	@GetMapping("/search")
	public ResponseEntity<List<ShowResource>> search(
			@RequestParam(name="city",required = true) String cityName,
			@RequestParam(name = "movieName", required = false) String movieName,
			@RequestParam(name =  "theaterName",required = false) String theaterName) {
		return ResponseEntity.ok(showService.searchShows(movieName,cityName,theaterName));
	}

	@PostMapping("/add")
	public ResponseEntity<ShowResource> addShow(@RequestBody ShowResource showResource) {
		showService.addShow(showResource);
		return ResponseEntity.ok(showResource);
	}

}