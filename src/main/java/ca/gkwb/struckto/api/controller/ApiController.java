package ca.gkwb.struckto.api.controller;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class ApiController {
	
//	private IncidentDAO iDAO;
//	private LocationDAO lDAO;
////	private ObjectMapper mapper;

	private Logger logger = Logger.getLogger(this.getClass().getName());	
	
	@RequestMapping("/")
	@ResponseBody
	public String root() {
		return "Welcome to the StruckTOBot Api!";
	}
	
	@RequestMapping("/recent")
	@ResponseBody
	public String recent() {
		return "Testing!";
	}
	
	@RequestMapping("/all")
	@ResponseBody
	public String all() {
		return "Testing!";
	}	
	
	@RequestMapping("/location")
	@ResponseBody
	public String getLocation(@RequestParam(value="id") String locationId) {
		try {
			//LocationVO lVO = lDAO.queryOneLocation(new Integer(locationId)); 
			//return mapper.writeValueAsString(lVO);
			return "test";
		} catch (Exception e) {
//			logger.error("Error getting location for " + locationId, e);
			return e.getMessage();
		}
	}
	
}
