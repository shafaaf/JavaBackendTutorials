package com.journaldev.di.injector;

import com.google.inject.AbstractModule;
import com.journaldev.di.services.EmailService;
import com.journaldev.di.services.FacebookService;
import com.journaldev.di.services.MessageService;

public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		// can change binding to any 1 below

		// bind the service to implementation class
//		bind(MessageService.class).to(EmailService.class);
		bind(MessageService.class).to(FacebookService.class);
	}
}
