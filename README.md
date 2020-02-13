# 使用okhttp框架上传图片到服务器
1.app-build.gradle文件当中添加： implementation 'com.squareup.okhttp3:okhttp:4.2.2'（git更新到最新版本）
2.AndroidManifest.xml文件当中添加如下权限信息

    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
    
 3.编写代码
