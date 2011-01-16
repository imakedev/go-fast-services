package com.moogle.client.ui;

import java.io.IOException;
import java.io.InputStream;

import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import net.rim.device.api.system.Bitmap;
import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.Screen;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.BitmapField;
import net.rim.device.api.ui.component.Dialog;
import net.rim.device.api.ui.container.GridFieldManager;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.container.VerticalFieldManager;
import net.rim.device.api.xml.jaxp.XMLParser;
import net.rim.device.api.xml.parsers.DocumentBuilder;
import net.rim.device.api.xml.parsers.DocumentBuilderFactory;
import net.rim.device.api.xml.parsers.ParserConfigurationException;

public class GoFastGrid extends MainScreen {
	/*private ButtonField _buttonFieldOne;
	private ButtonField _buttonFieldTwo;
	private ButtonField _buttonFieldThree;
	private ButtonField _buttonFieldFour;
	private ButtonField _buttonFieldFive;
	private ButtonField _buttonFieldSix;
	private ButtonField _buttonFieldSeven;
	private ButtonField _buttonFieldEight;
	private ButtonField _buttonFieldNine;
	private ButtonField _buttonFieldStar;
	private ButtonField _buttonFieldZero;
	private ButtonField _buttonFieldPound;*/

	//private BasicEditField _phoneNumberField;

	/**
	 * Creates a new GridFieldScreen object
	 */
	public GoFastGrid() {
		super(NO_VERTICAL_SCROLL);

		setTitle(" Catalog");

		// Define rows and columns
		int rows = 4;
		int cols = 4;

		// Instantiate a GridFieldManager with 4 rows and 3 columns
		GridFieldManager gridFieldManager = new GridFieldManager(rows, cols,
				Field.FIELD_HCENTER);

		// Add a field to the screen to display a phone number
		/*_phoneNumberField = new BasicEditField("Phone number: ", "", 15,
				Field.NON_FOCUSABLE);
		add(_phoneNumberField);

		add(new SeparatorField());*/

		// Instantiate button fields
		/*_buttonFieldOne = new ButtonField("1", ButtonField.NEVER_DIRTY);
		_buttonFieldTwo = new ButtonField("2", ButtonField.NEVER_DIRTY);
		_buttonFieldThree = new ButtonField("3", ButtonField.NEVER_DIRTY);
		_buttonFieldFour = new ButtonField("4", ButtonField.NEVER_DIRTY);
		_buttonFieldFive = new ButtonField("5", ButtonField.NEVER_DIRTY);
		_buttonFieldSix = new ButtonField("6", ButtonField.NEVER_DIRTY);
		_buttonFieldSeven = new ButtonField("7", ButtonField.NEVER_DIRTY);
		_buttonFieldEight = new ButtonField("8", ButtonField.NEVER_DIRTY);
		_buttonFieldNine = new ButtonField("9", ButtonField.NEVER_DIRTY);
		_buttonFieldStar = new ButtonField("*", ButtonField.NEVER_DIRTY);
		_buttonFieldZero = new ButtonField("0", ButtonField.NEVER_DIRTY);
		_buttonFieldPound = new ButtonField("#", ButtonField.NEVER_DIRTY);*/
		BitmapField bt1 = new BitmapField(Bitmap
				.getBitmapResource("img/64.png"), BitmapField.FOCUSABLE);
		BitmapField bt2 = new BitmapField(Bitmap
				.getBitmapResource("img/64_2.png"), BitmapField.FOCUSABLE);
		BitmapField bt3 = new BitmapField(Bitmap
				.getBitmapResource("img/64_3.png"), BitmapField.FOCUSABLE);
		BitmapField bt4 = new BitmapField(Bitmap
				.getBitmapResource("img/64_4.png"), BitmapField.FOCUSABLE);
		BitmapField bt5 = new BitmapField(Bitmap
				.getBitmapResource("img/64_5.png"), BitmapField.FOCUSABLE);
		BitmapField bt6 = new BitmapField(Bitmap
				.getBitmapResource("img/64_6.png"), BitmapField.FOCUSABLE);
		BitmapField bt7 = new BitmapField(Bitmap
				.getBitmapResource("img/64_7.png"), BitmapField.FOCUSABLE);
		BitmapField bt8 = new BitmapField(Bitmap
				.getBitmapResource("img/64_8.png"), BitmapField.FOCUSABLE);
		BitmapField bt9 = new BitmapField(Bitmap
				.getBitmapResource("img/64_9.png"), BitmapField.FOCUSABLE);

		BitmapField bt10 = new BitmapField(Bitmap
				.getBitmapResource("img/Search-icon.png"), BitmapField.FOCUSABLE);

		BitmapField bt11 = new BitmapField(Bitmap
				.getBitmapResource("img/Setting-icon.png"), BitmapField.FOCUSABLE);

		// Add button fields to the GridFieldManager
		gridFieldManager.add(bt1);
		gridFieldManager.add(bt2);
		gridFieldManager.add(bt3);
		gridFieldManager.add(bt4);
		gridFieldManager.add(bt5);
		gridFieldManager.add(bt6);
		gridFieldManager.add(bt7);
		gridFieldManager.add(bt8);
		gridFieldManager.add(bt9);
		gridFieldManager.add(bt10);
		gridFieldManager.add(bt11);
	/*	gridFieldManager.add(_buttonFieldStar);
		gridFieldManager.add(_buttonFieldZero);
		gridFieldManager.add(_buttonFieldPound);
*/
		// Add the GridFieldManager to a VerticalFieldManager
		VerticalFieldManager vfm = new VerticalFieldManager(USE_ALL_WIDTH);
		vfm.add(gridFieldManager);

		// Add the HorizontalFieldManager to the screen
		try {
			//http://localhost:8080/GoFastAoeServices/restfultest;interface=wifi
			//getViaHttpConnection("http://localhost:8080;interface=wifi");
			//getViaHttpConnection("http://aoesearch.appspot.com;interface=wifi");
			getViaHttpConnection("http://mooglefast.appspot.com/gofast;interface=wifi");
			//getViaHttpConnection("http://localhost:8080/GoFastAoeServices/restfultest;deviceside=true;interface=wifi"); ///GoFastServices?type=aoe
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(" [aoe debug ]IOException threw " + e.toString());
		}
		add(vfm);
	}

	/**
	 * @see Screen#keyChar(char, int, int)
	 */
	/*protected boolean keyChar(char key, int status, int time) {
		int textLength = _phoneNumberField.getText().length();

		if ((key == Characters.BACKSPACE || key == Characters.ESCAPE)
				&& textLength > 0) {
			String oldText = _phoneNumberField.getText();
			String newText = oldText.substring(0, textLength - 1);
			_phoneNumberField.setText(newText);
			return true;
		}
		return super.keyChar(key, status, time);
	}*/

	/**
	 * @see Screen#navigationClick(int, int)
	 */
	protected boolean navigationClick(int status, int time) {
		//doUpdate();
		return true;
	}

	/**
	 * Appends digit to the phone number field text corresponding to the
	 * selected keypad button.
	 */
	/*void doUpdate() {
		if (_buttonFieldOne.isFocus()) {
			_phoneNumberField.setText(_phoneNumberField.getText() + "1");
		} else if (_buttonFieldTwo.isFocus()) {
			_phoneNumberField.setText(_phoneNumberField.getText() + "2");
		} else if (_buttonFieldThree.isFocus()) {
			_phoneNumberField.setText(_phoneNumberField.getText() + "3");
		} else if (_buttonFieldFour.isFocus()) {
			_phoneNumberField.setText(_phoneNumberField.getText() + "4");
		} else if (_buttonFieldFive.isFocus()) {
			_phoneNumberField.setText(_phoneNumberField.getText() + "5");
		} else if (_buttonFieldSix.isFocus()) {
			_phoneNumberField.setText(_phoneNumberField.getText() + "6");
		} else if (_buttonFieldSeven.isFocus()) {
			_phoneNumberField.setText(_phoneNumberField.getText() + "7");
		} else if (_buttonFieldEight.isFocus()) {
			_phoneNumberField.setText(_phoneNumberField.getText() + "8");
		} else if (_buttonFieldNine.isFocus()) {
			_phoneNumberField.setText(_phoneNumberField.getText() + "9");
		} else if (_buttonFieldStar.isFocus()) {
			_phoneNumberField.setText(_phoneNumberField.getText() + "*");
		} else if (_buttonFieldZero.isFocus()) {
			_phoneNumberField.setText(_phoneNumberField.getText() + "0");
		} else if (_buttonFieldPound.isFocus()) {
			_phoneNumberField.setText(_phoneNumberField.getText() + "#");
		}
	}*/
	public void getViaHttpConnection(String url) throws IOException {
         HttpConnection c = null;
         InputStream is = null;
         int rc;
         System.out.println("[ aoe debug ] GetViaHttpConnection="+url);
         try {
             c = (HttpConnection)Connector.open(url);
             
             // Getting the response code will open the connection,
             // send the request, and read the HTTP response headers.
             // The headers are stored until requested.
             rc = c.getResponseCode();
             if (rc != HttpConnection.HTTP_OK) {
            	 
            	 System.out.println("[ aoe debug ] HTTP response code: " + rc);
            	 //throw new IOException("HTTP response code: " + rc);
             }

             is = c.openInputStream();
             DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
             DocumentBuilder db=null;
			try {
				db = dbf.newDocumentBuilder();
			    
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				 
				System.out.println("[ aoe debug ] error ParserConfigurationException: " + e.getMessage());
			}
             Document doc =null;
			try {
				doc = db.parse(is);
				
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				System.out.println("[ aoe debug ] error ParserConfigurationException: " + e.getMessage());
				 
			}
             doc.getDocumentElement().normalize();
             System.out.println("[ aoe debug ] Root element " + doc.getDocumentElement().getNodeName());
             NodeList nodeLst = doc.getElementsByTagName("transid");
             System.out.println("[ aoe debug ] nodeLst="+nodeLst.getLength());
             for (int i = 0; i < nodeLst.getLength(); i++) {
            	 System.out.println("[ aoe debug ] node item="+nodeLst.item(i));
			}
            // XMLReader r = new XMLParser();
            // r.parse(input)
             // Get the ContentType
             String type = c.getType();

             // Get the length and process the data
            /* int len = (int)c.getLength();
             if (len > 0) {
                 int actual = 0;
                 int bytesread = 0 ;
                 byte[] data = new byte[len];
                 while ((bytesread != len) && (actual != -1)) {
                    actual = is.read(data, bytesread, len - bytesread);
                    bytesread += actual;
                 }
             } else {
                 int ch;
                 while ((ch = is.read()) != -1) {
                     ...
                 }
             }*/
         } catch (ClassCastException e) {
        	 System.out.println(" [aoe debug ]ClassCastException threw " + e.toString());
        	 //throw new IllegalArgumentException("Not an HTTP URL");
         } finally {
             if (is != null)
                 is.close();
             is = null;
             if (c != null)
                 c.close();
             c = null;
         }
     }
	/* public void close()
	    {
	        // Display a farewell message before closing the application
	        Dialog.alert("Goodbye!");     
	        super.close();
	    }  */
	 public static void errorDialog(final String message)
	    {
	        UiApplication.getUiApplication().invokeLater(new Runnable()
	        {
	            public void run()
	            {
	                Dialog.alert(message);
	            } 
	        });
	    }
}
