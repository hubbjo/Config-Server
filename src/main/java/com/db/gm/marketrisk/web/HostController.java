package com.db.gm.marketrisk.web;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/host", produces="application/text")
public class HostController {

	@GetMapping("/name")
	public String getHost() {
		try {
			final InetAddress inetAddress = InetAddress.getLocalHost();
			return inetAddress.getHostName();
		}
		catch (UnknownHostException e) {
			return "Unknown";
		}
	}
}
