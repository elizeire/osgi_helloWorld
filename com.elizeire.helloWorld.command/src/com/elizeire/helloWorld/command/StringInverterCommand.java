package com.elizeire.helloWorld.command;

import org.apache.felix.service.command.CommandProcessor;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.elizeire.helloWorld.api.StringInverter;

@Component(
	    property= {
	        CommandProcessor.COMMAND_SCOPE + ":String=helloWorld",
	        CommandProcessor.COMMAND_FUNCTION + ":String=invert"
	    },
	    service=StringInverterCommand.class
	)
public class StringInverterCommand {
	private StringInverter inverter;

    @Reference
    void bindStringInverter(StringInverter inverter) {
        this.inverter = inverter;
    }
    
    void unbindStringInverter(StringInverter inverter) {
        this.inverter = null;
    }

    public void invert(String input) {
        System.out.println("String inverted:"+inverter.invert(input));
    }
}
