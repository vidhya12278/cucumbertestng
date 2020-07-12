package com.singleton;

import com.base.Helperclass;
//import com.hotel.Bookingpagepojo;
//import com.hotel.Loginpagepojo;
//import com.hotel.Orderpagepojo;
//import com.hotel.Searchpagepojo;
import com.pom.*;

public class maintainpage {
	  private Loginpage login;
		private Searchpage search;
		private Bookingpage booking;
		private Orderno  order;
		
		public Loginpage getLogin() 
		{
			return (login==null)?login=new Loginpage():login;
		}
		public Searchpage getSearch() 
		{
			return (search==null)?search=new Searchpage():search;
		}
		public Bookingpage getBooking() 
		{
			return (booking==null)?booking=new Bookingpage():booking;
		}
		public Orderno getOrder() 
		{
			return (order==null)?order=new Orderno():order;
		}
		

}
