import com.money.entity.User;
import com.money.service.test.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/*
 * @author:liuzhaolu
 * @createTime: 2019-11-19 17:20
 * @desc:
 */
@ContextConfiguration(locations = {"classpath:spring-*.xml"})
@RunWith(value = SpringJUnit4ClassRunner.class)
public class JunitTestDemo {

    @Resource
    private UserService userService;

    @Test
    public void testSelect() {
        //保存订单
        User user = userService.getUserInfoByUserName("liuzhaolu");
        System.out.println(user.toString());
    }
}
