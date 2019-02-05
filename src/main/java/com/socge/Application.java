package com.socge;

import com.google.gson.Gson;
import com.socge.core.service.ArchivageCamt053;
import com.socge.dao.MessageRepository;
import com.socge.model.Camt053;
import com.socge.model.Message;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
//@EnableJpaRepositories("com.socge.dao") // utile uniquement si le repo et l'entity sont dans un autre package
public class Application implements CommandLineRunner {


	@Autowired
	ArchivageCamt053 archivageCamt053;

	@Autowired
	MessageRepository messageRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		List<Camt053> camt053List = archivageCamt053.creationDuneListAleatoireDeCamt053();

		for(Camt053 camt053:camt053List){
			System.out.println(camt053);
		}

		String listCamt053Json = new Gson().toJson(camt053List);

		System.out.println("ListCamt053Json= " + listCamt053Json);

		Message message = new Message();
		message.setMessage(listCamt053Json);
		message.setQueue("queueFromSecurity");
		messageRepository.save(message);

		System.out.println("--------------------------");
		System.out.println("RECUPERATION DEPUIS LA BDD");
		Iterable<Message> messageIterable = messageRepository.findAll();
		int i = 0;
		for(Message m:messageIterable){
			i++;
			System.out.println("Message_" + i + " = " + m.getMessage());
		}


	}

}
