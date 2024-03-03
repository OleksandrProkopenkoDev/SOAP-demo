package ua.spro.soaphelloworld.config;

import static ua.spro.soaphelloworld.endpoint.LoanEligibilityIndicatorEndpoint.NAMESPACE;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class SoapWsConfig {

  public static final String SCHEMA_PATH = "xsd/loan-eligibility.xsd";

  @Bean
  ServletRegistrationBean<MessageDispatcherServlet>
      messageDispatcherServletServletRegistrationBean(ApplicationContext context) {
    MessageDispatcherServlet servlet = new MessageDispatcherServlet();
    servlet.setApplicationContext(context);
    servlet.setTransformWsdlLocations(true);
    return new ServletRegistrationBean<>(servlet, "/ws/*");
  }

  @Bean(name = "loanEligibility")
  DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema){
    DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
    wsdl11Definition.setPortTypeName("LoanEligibilityIndicator");
    wsdl11Definition.setLocationUri("/ws");
    wsdl11Definition.setTargetNamespace(NAMESPACE);
    wsdl11Definition.setSchema(schema);
    return wsdl11Definition;
  }

  @Bean
  XsdSchema schema(){
    return  new SimpleXsdSchema(new ClassPathResource(SCHEMA_PATH));
  }

}
