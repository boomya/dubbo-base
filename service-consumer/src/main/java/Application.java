import com.boom.dubbo.client.ServiceLocator;
import com.boom.dubbo.consumer.TestDubboService;
import com.boom.dubbo.share.dto.MemberDTO;
import com.boom.dubbo.share.service.HomePageService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    private final static Log log = LogFactory.getLog(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer-application.xml");
        TestDubboService testDubboService = (TestDubboService) context.getBean("testDubboService");
        log.info("testDubboService:" + testDubboService);

        HomePageService homePageService = ServiceLocator.getHomePageService();
        MemberDTO memberDTO = homePageService.getMemberById("1");
        log.info("===========MemberDTO:" + memberDTO.getName());

        HomePageService homePageService2 = ServiceLocator.getHomePageService();
        MemberDTO memberDTO2 = homePageService2.getMemberById("1");
        log.info("===========MemberDTO2:" + memberDTO2.getName());
    }
}
