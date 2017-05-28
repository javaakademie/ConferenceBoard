package de.javaakademie.cb.gui;

import java.util.Optional;
import java.util.ServiceLoader;

import de.javaakademie.cb.api.ConferenceService;
import de.javaakademie.cb.api.annotation.Sessions;
import de.javaakademie.cb.api.annotation.Speaker;
import de.javaakademie.cb.api.model.Session;
import java.util.ServiceLoader.Provider;

/**
 * ServiceFactory.
 * 
 * @author Guido.Oelmann
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ServiceFactory {

	private ServiceLoader<ConferenceService> services = ServiceLoader.load(ConferenceService.class);

	private ConferenceService<?> getServiceByAnnotation(Class clazz) {
		Optional<ConferenceService> providers = services.stream()
				.filter(provider -> provider.type().isAnnotationPresent(clazz)).map(Provider::get).findFirst();
		services.reload(); // TODO
		return providers.get();
	}

	public ConferenceService<de.javaakademie.cb.api.model.Speaker> getSpeakerService() {
		return (ConferenceService<de.javaakademie.cb.api.model.Speaker>) getServiceByAnnotation(Speaker.class);
	}

	public ConferenceService<Session> getSessionService() {
		return (ConferenceService<Session>) getServiceByAnnotation(Sessions.class);
	}

}
