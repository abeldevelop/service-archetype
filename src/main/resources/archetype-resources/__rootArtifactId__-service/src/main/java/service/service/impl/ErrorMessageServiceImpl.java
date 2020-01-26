#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.service.impl;


import org.springframework.stereotype.Component;

import com.abeldevelop.architecture.library.common.error.DefaultErrorMessageService;
import ${package}.service.util.ErrorCodesConstants;

@Component
public class ErrorMessageServiceImpl extends DefaultErrorMessageService {

    public ErrorMessageServiceImpl() {
        addMessagesToMap();
    }

	private void addMessagesToMap() {
		
	}
}
