package hello.core.autowired;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AllBeanTest {

    @Test
    void findAllBean(){
        new AnnotationConfigApplicationContext();
    }

    static class DiscountService {
        private final Map<String, DiscountService> policyMap;

        public DiscountService(Map<String, DiscountService> policyMap) {
            this.policyMap = policyMap;
        }
    }
}
