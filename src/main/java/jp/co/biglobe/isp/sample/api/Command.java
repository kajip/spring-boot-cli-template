package jp.co.biglobe.isp.sample.api;

import jp.co.biglobe.isp.sample.service.GreetingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * API層的な何か。SpringBoot を実行するとこいつが呼ばれる
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class Command implements CommandLineRunner {

    private final GreetingService service;

    @Override
    public void run(String... args) throws Exception {
        log.info("{}", service.greeting().hello());
    }
}
