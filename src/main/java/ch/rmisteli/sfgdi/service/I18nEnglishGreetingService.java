package ch.rmisteli.sfgdi.service;

import ch.rmisteli.sfgdi.repository.EnglishGreetingRepository;

/**
 * I18nGreetingService
 * Author: rmisteli
 * Created: 29.10.21 - 09:18
 */
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
