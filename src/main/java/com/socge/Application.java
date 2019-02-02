package com.socge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.socge.dao.SystemRepository;
import com.socge.model.SystemExample;

@SpringBootApplication
//@EnableJpaRepositories("com.socge.dao") // utile uniquement si le repo et l'entity sont dans un autre package
public class Application implements CommandLineRunner {

	/*@Autowired
	DataSource dataSource;*/

	@Autowired
	SystemRepository systemRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// add windows server
		SystemExample systemExampleWindows = new SystemExample();
		systemExampleWindows.setName("Alexis Exemple");
		systemExampleWindows.setLastaudit("2017-08-11");
		systemRepository.save(systemExampleWindows);
		// add rhel
		SystemExample systemExampleRhel = new SystemExample();
		systemExampleRhel.setName("Alexis Exemple");
		systemExampleRhel.setLastaudit("2017-07-21");
		systemRepository.save(systemExampleRhel);
		// add solaris
		SystemExample systemExampleSolaris = new SystemExample();
		systemExampleSolaris.setName("Alexis Exemple");
		systemExampleSolaris.setLastaudit("2017-08-13");
		systemRepository.save(systemExampleSolaris);


		Iterable<SystemExample> systemlist = systemRepository.findAll();
		System.out.println("here are system count: " + systemlist.toString());
		for(SystemExample systemExample:systemlist){
			System.out.println("Here is a system: " + systemExample.toString());
		}

	}

}
