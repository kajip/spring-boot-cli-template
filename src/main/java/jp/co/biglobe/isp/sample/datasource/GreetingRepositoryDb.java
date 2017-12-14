package jp.co.biglobe.isp.sample.datasource;

import jp.co.biglobe.isp.sample.domain.Greeting;
import jp.co.biglobe.isp.sample.domain.GreetingRepository;
import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryDb implements GreetingRepository {
    @Override
    public Greeting search() {
        return new Greeting();
    }
}
