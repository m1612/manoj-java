package com.manoj.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.manoj.entity.ShortStock;
import com.manoj.repo.Datarepo;

@Component
public class CommandShort implements CommandLineRunner {

	@Autowired
	private Datarepo repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new ShortStock(123, "158short", "allensoly", "hyd"));
		repo.save(new ShortStock(124, "123short", "uspolo", "bengaluru"));
		repo.save(new ShortStock(125, "147short", "roymond", "berhampur"));
		repo.save(new ShortStock(126, "789short", "blackbeery", "amadhabad"));
		repo.save(new ShortStock(127, "568short", "roadstock", "deli"));
		repo.save(new ShortStock(128, "897short", "lee", "vishakpatanam"));
		repo.save(new ShortStock(129, "4586short", "triger", "mumbai"));
		repo.save(new ShortStock(130, "78952short", "himalaya", "KOLKOTA"));
		repo.save(new ShortStock(131, "15631short", "binghuman", "BBSR"));

		System.out.println("done");

	}

}
