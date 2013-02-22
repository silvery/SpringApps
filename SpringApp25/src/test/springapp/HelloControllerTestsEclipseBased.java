package test.springapp;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.ServletException;

import org.springframework.web.servlet.ModelAndView;

import springapp.web.InventoryController;
import org.junit.Test;

public class HelloControllerTestsEclipseBased {

	@Test
	public void testHandleRequestView() throws Exception{		
        InventoryController controller = new InventoryController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello.jsp", modelAndView.getViewName());
    }

}
