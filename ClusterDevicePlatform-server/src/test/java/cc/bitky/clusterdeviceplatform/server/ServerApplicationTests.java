package cc.bitky.clusterdeviceplatform.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.atomic.AtomicReference;

import cc.bitky.clusterdeviceplatform.server.db.bean.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {
    @Test
    public void contextLoads() {
        int[][] d = new int[5][];
        AtomicReference<Employee> employee = new AtomicReference<>();
        Employee employee1 = employee.get();
        System.out.println();
    }
}


