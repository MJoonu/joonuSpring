package joonu.spring.myfactory;

import java.util.Map;

import org.apache.coyote.ProtocolHandler;

public class ProtocolHandlerFactory {
	
	private Map<String, ProtocolHandler> handlers;

	public void setHandlers(Map<String, ProtocolHandler> handlers) {
		this.handlers = handlers;
	}

}
