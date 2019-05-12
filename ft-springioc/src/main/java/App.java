import cn.ft.AppConfig;
import cn.ft.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author danqiusheng
 * @since 2019-05-09
 */
public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		annotationConfigApplicationContext.getBeanFactory().registerSingleton("userMapper",)
	}
}
