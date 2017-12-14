package jp.co.biglobe.isp.sample.domain

import spock.lang.Specification

class GreetingSpec extends Specification {

    def "Greetingのテスト"() {
        expect:
        def greeting = new Greeting()
        greeting.hello() == "Hello, World!"
    }
}
