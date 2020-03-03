package com.cts.training.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cts.training.model.StockExchange;
import com.cts.training.repo.StockExchangeRepo;
@CrossOrigin(origins="*")
@RestController 
public class StockExchangeController 
{
	@Autowired 
	  StockExchangeRepo sr;
	  @RequestMapping(value = "/stock", method = RequestMethod.GET, produces =MediaType.APPLICATION_JSON_VALUE) 
	  public List<StockExchange> findAll() 
	  {
		  return sr.findAll(); 
	  }
	  @RequestMapping(value = "/stock/{id}", method = RequestMethod.GET, produces =MediaType.APPLICATION_JSON_VALUE) 
	  public StockExchange finedone(@PathVariable int id) 
	  { 
		  Optional<StockExchange> se = sr.findById(id); 
		  StockExchange se1 = se.get(); 
		  return se1;
	  }
	  @RequestMapping(value = "/stock", method = RequestMethod.POST)
	  public StockExchange save(@RequestBody StockExchange se) 
	  { 
		  StockExchange se2 = sr.save(se); 
		  return se2;
	  }
	 @RequestMapping(value = "/stock/{id}", method = RequestMethod.DELETE) 
	 public void delete(@PathVariable int id)
	 { 
		 sr.deleteById(id); 
	 }
	 @RequestMapping(value = "/stock", method = RequestMethod.PUT)
	 public StockExchange update(@RequestBody StockExchange se)
	 {
		 StockExchange se2 = sr.save(se); 
		 return se2; 
	 }
}
