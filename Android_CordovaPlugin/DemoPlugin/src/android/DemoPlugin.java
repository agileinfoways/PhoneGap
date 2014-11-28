package com.agileinfoways.plugin;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import android.util.Log;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
public class DemoPlugin extends CordovaPlugin {
	public static final String TAG = "Demo Plugin";
	/**
	 * Constructor.
	 */
	public DemoPlugin() {}
	/**
	 * Sets the context of the Command. This can then be used to do things like
	 * get file paths associated with the Activity.
	 *
	 * @param cordova The context of the main Activity.
	 * @param webView The CordovaWebView Cordova is running in.
	 */
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		Log.v(TAG,"Init DemoPlugin");
	}
	public boolean execute(final String action, final JSONArray args, CallbackContext callbackContext) throws JSONException {
		final int duration = Toast.LENGTH_SHORT;
		// Shows a toast
		Log.v(TAG,"DemoPlugin received:"+ action);
		cordova.getActivity().runOnUiThread(new Runnable() {
			public void run() {
				Toast toast;
				try {
					toast = Toast.makeText(cordova.getActivity().getApplicationContext(), action+" : "+args.getString(0), duration);
					toast.show();

				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		return true;
	}
}
