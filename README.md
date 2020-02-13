# 使用okhttp框架上传图片到服务器
1.app-build.gradle文件当中添加： implementation 'com.squareup.okhttp3:okhttp:4.2.2'（git更新到最新版本）
2.AndroidManifest.xml文件当中添加如下权限信息
    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>  
 3.编写代码------>本次编写的代码使用的时候post的请求方式：
  
 
 #POST和GET的区别：
 1.Get是最常用的方法，通常用于请求服务器发送某个资源，而且应该是安全的和幂等的
 2.POST方法向服务器提交数据，比如完成表单数据的提交，将数据提交给服务器处理
 3.GET和POST请求都是的HTTP协议都是基于TCP/IP的应用层协议，它们使用的是同一个传输层协议,所以在传输上相同
 4.GET只接受ASCII字符，而POST没有限制
 5.GET比POST更不安全，因为参数直接暴露在URL上，所以不能用来传递敏感信息,若想保证传输安全，可通过HTTPS进行加密
