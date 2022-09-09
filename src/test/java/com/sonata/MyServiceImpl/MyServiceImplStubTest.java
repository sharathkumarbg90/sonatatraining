package com.sonata.MyServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

import com.sonata.MyService.MyServiveIntf;
import com.sonata.MyService.MyServiceStub;

class MyServiceImplStubTest {
    
    @Test
    void test() {
        MyServiveIntf my = new MyServiceStub();
        MyServiveImpl mys = new MyServiveImpl(my);
        List<String> filterMySer = mys.retriveRelated("Dummy");
        assertEquals(2, filterMySer.size());
    }
}