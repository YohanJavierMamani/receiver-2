package com.formacionbdi.springboot.app.receiver2.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQ {

	@RabbitListener(queues = "${sample.rabbitmq.queue}")
	public void recievedMessage(String incomingMessage) {
		System.out.println("ESTE MENSAJE LLEGÓ AL SERVICIO :D : " + incomingMessage);
	}
}
