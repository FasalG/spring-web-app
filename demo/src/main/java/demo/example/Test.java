package demo.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {

	public static void main(String[] args) {
		Resource obj = new ClassPathResource("applicationcontext.xml");
		BeanFactory bean = new XmlBeanFactory(obj);
		
		Product product = (Product) bean.getBean("product");
		product.product_details(); 
	}

}
