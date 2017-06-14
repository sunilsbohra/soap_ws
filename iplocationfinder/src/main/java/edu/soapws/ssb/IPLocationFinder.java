package edu.soapws.ssb;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length !=1){
			System.out.println("Invalid input");
		}
//		String ipAddress = args[0];
		GeoIPService geoIpService = new GeoIPService();
		GeoIPServiceSoap geoIpServiceSoap = geoIpService.getGeoIPServiceSoap();
		GeoIP geoIPContext = geoIpServiceSoap.getGeoIPContext();
		GeoIP geoIp = geoIpServiceSoap.getGeoIP(args[0]);
		System.out.println("Country Name of IP Address "+ args[0] + " is " +geoIp.getCountryName());
		System.out.println(geoIPContext.getCountryCode());
		System.out.println(geoIPContext.getCountryName());
	}
}
