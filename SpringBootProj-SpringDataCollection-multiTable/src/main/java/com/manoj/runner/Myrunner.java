package com.manoj.runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.manoj.entity.MyHouse;
import com.manoj.repo.Houserepo;

@Component
public class Myrunner implements CommandLineRunner {

	@Autowired
	private Houserepo repo;

	@Override
	public void run(String... args) throws Exception {

		MyHouse house = new MyHouse();
		house.setHouseid(1002);
		house.setHouseadd("hyderabad");
		house.setHousename("tamana");
		List l = new ArrayList();
		l.add(0, "a123");
		l.add(1, "a127");
		house.setHouseMemberName(l);

		Set s = new HashSet<>();
		s.add("amam0");
		s.add("ama758");
		house.setHousemember(s);

		Map<Integer, String> m = new HashMap<>();
		m.put(120, "hyd");
		m.put(121, "bam");
		house.setHouselocation(m);
		repo.save(house);
	}

}
