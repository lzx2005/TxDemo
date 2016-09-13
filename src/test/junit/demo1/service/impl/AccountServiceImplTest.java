package demo1.service.impl;

import demo1.service.AccountService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/9/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class AccountServiceImplTest extends TestCase {

    @Resource(name = "accountService")
    private AccountService accountService;


    @Test
    public void testTansfer() throws Exception {
        accountService.tansfer("aaa","bbb",100d);
    }

}