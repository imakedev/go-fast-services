package com.moogle.client.ui;

import net.rim.device.api.ui.UiApplication;

public class GoFastUI   extends UiApplication
{
	 public static void main(String[] args)
	    {
	        // Create a new instance of the application and make the currently
	        // running thread the application's event dispatch thread.
		 GoFastUI theApp = new GoFastUI();       
	        theApp.enterEventDispatcher();
	    } 
	    /**
	     * Creates a new HelloWorldDemo object
	     */
	    public GoFastUI()
	    {        
	        // Push a screen onto the UI stack for rendering.
	    	System.out.println("[aoe debug] ============================");
	        pushScreen(new GoFastGrid());
	    }    
	   
}
