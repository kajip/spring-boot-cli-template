package jp.co.biglobe.isp.sample.service;

import jp.co.biglobe.isp.sample.domain.Greeting;
import jp.co.biglobe.isp.sample.domain.GreetingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public Greeting greeting() {
        return greetingRepository.search();
    }
}
