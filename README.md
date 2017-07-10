 # x5webview-cordova-plugin
x5webview-cordova-plugin 是腾讯浏览服务(TBS)为cordova框架提供的用于android平台的cordova插件，旨在为android平台提供更好的webview浏览体验．

一．接入步骤：
1.向cordiva工程中添加x5webview插件：cordova plguin add x5webview-cordova-plugin

2.替换代码：将android代码工程中继承自CordovaActivity的Activity改为继承自CordovaX5WebViewActivity　(platforms/android/src目录下的＂extends CordovaActivity＂改为＂extends CordovaX5WebViewActivity＂)，并在对应的Activity文件中引入对应的类（import org.apache.cordova.x5engine.CordovaX5WebViewActivity;）

3.如果运行命令＂cordova run android"提示错误＂Error: No Java files found that extend CordovaActivity.＂，则需要编辑文件＂./platforms/android/cordova/lib/prepare.js＂，将＂/extends\s+CordovaActivity/g＂改为＂/extends\s+CordovaX5WebViewActivity/g＂


二．熟悉android开发的同学可以参考x5官网来灵活使用x5内核．常用链接如下：

官网(https://x5.tencent.com/tbs/)

常见问题(https://x5.tencent.com/tbs/faq.html)

论坛(http://bbs.mb.qq.com/forum-112-1.html)

内核加载问题检测工具(http://bbs.mb.qq.com/thread-1944983-1-1.html)

