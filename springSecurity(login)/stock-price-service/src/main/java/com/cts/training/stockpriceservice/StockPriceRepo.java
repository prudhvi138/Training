package com.cts.training.stockpriceservice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import org.springframework.stereotype.Repository;
//@Repository
import com.cts.training.stockpriceservice.StockPrice;

public interface StockPriceRepo extends JpaRepository<StockPrice, Integer>{
	
	@Query("From StockPrice where companyCode = ?1 and stockExchangeName =?2 and date =?3 and time =?4")
	public Optional<StockPrice> getIfAlreadyExists(String companyCode, String stockExchangeName, LocalDate date,
			LocalTime time);

}
