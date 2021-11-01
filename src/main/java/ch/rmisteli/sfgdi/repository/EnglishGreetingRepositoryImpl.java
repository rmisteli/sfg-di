package ch.rmisteli.sfgdi.repository;

/**
 * EnglishGreetingRepositoryImpl
 * Author: rmisteli
 * Created: 01.11.21 - 09:11
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
