cordova.define("com.agileinfoways.plugin.DemoPlugin", function(require, exports, module) { var democonnect = {
    callDemo: function(url,detail, win, fail) {
        cordova.exec(win, fail, "DemoPlugin", url, [ detail ]); 
    }
}
module.exports = democonnect;
});
