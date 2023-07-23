package org.springframework.mylearntest.ioc.eventpublication.event;

public class Test4Event {
	public static void main(String[] args) {
		MethodExecutionEventPublisher eventPublisher = new MethodExecutionEventPublisher();
		eventPublisher.addMethodExecutionEventListener(new SimpleMethodExecutionEventListener());
		eventPublisher.methodToMonitor();
		eventPublisher.removeAllListeners();
	}
}
