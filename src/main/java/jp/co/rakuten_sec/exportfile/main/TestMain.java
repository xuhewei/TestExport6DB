package jp.co.rakuten_sec.exportfile.main;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jp.co.rakuten_sec.exportfile.entity.BondOrdHistory;
import jp.co.rakuten_sec.exportfile.service.BondOrdHistoryService;



public class TestMain {
	
	
	private static final String[] CONTEXT_PATH = { "spring/applicationContext.xml" };

	//private static final Log logger = LogFactory.getLog(TestMain.class);

	public static void main(String[] args){
		
		TestMain thisProgram = new TestMain();

		// spring
		ApplicationContext context = new ClassPathXmlApplicationContext(CONTEXT_PATH);

		// log4j
		//ClassLoader loader = thisProgram.getClass().getClassLoader();
		//DOMConfigurator.configure(loader.getResource("jp/co/rakuten_sec/accsi/log4j.xml"));
		
		BondOrdHistoryService bondOrdHistoryService = (BondOrdHistoryService) context.getBean("bondOrdHistoryService");
		List<BondOrdHistory> list =  bondOrdHistoryService.findAll();
		System.out.println(list.size());
	}
}
