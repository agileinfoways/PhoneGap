==============  CREATE PLUGIN ===========================

1) Create folder "DemoPlugin" .

2) Create Structure like below

      - DemoPlugin
         - src
             - android
                 - DemoPlugin.java
         - www
             - DemoPlugin.js
         - plugin.xml

3) Please follow the structure of DemoPlugin.java ,DemoPlugin.js,plugin.xml to create yours.

4) Double Check for Naming.
                
5) Add permission (if required), in plugin.xml
   
    e.g
    <config-file target="AndroidManifest.xml" parent="/*">
            <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    </config-file>

=========================================================

=============== ADD PLUGIN TO PROJECT ===================

1) Put "DemoPlugin" in current workspace.
  
   e.g:
    - MyWorkSpace
       - MyProject
       - DemoPlugin

2) Add plugin to your Project

  e.g:
  home /e/MyWorkSpace/MyProject
  $ cordova plugin add ../DemoPlugin


3) Refresh Project in your IDE.

4) Call plugin from your js. No need to add import DemoPlugin.js file in your Html :)

   e.g:
    function callDemoPlugin(){
	DemoPlugin.callDemo("calldemo","Android Plugin in cordova 3.7",
			function(msg){
		console.log("Success"+msg);
		},
		function(){
			alert("Oops there is an error"); 
			}
		);
      }


5) Make sure you are editing js/html files from external www folder. Don't edit in assets/www/files because it will not affect Code after "Build".
     
6) Build it

   e.g:
  home /e/MyWorkSpace/MyProject
  $ cordova build

7) To remove plugin
  e.g:
  home /e/MyWorkSpace/MyProject
  $ cordova plugin remove com.agileinfoways.plugin

=========================================================

