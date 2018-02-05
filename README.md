# AndroidUpdateManager
Android 自动更新下载安装

### 使用前肯定是先添加依赖啊
Add it in your root build.gradle at the end of repositories:
```aidl 
    allprojects {
            repositories {
                 ...
                maven { url 'https://jitpack.io' }
            }
        }
```
Add the dependency
```aidl 
    dependencies {
         compile 'com.github.JueShouGitHub:AndroidUpdateManager:v1.1'
	    }
```

### Step
前提，声明权限，很重要啊，不要忘记了
```aidl 
        <uses-permission android:name="android.permission.INTERNET"/>
        <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
        <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
```

###### Step1 根据实际需要得到相关版本信息
```aidl 
    //当卡版本名称
    Constants.getVerName(Context context)//String
    //当前版本编号
    Constants.getVerCode(Context context)//int
```

###### Step2 调起更新进度弹窗
```aidl 
    //就一句话
    UpdateDialog dialog = new UpdateDialog(Context context, String title, String apkUrl);
```
就一句话就够了；参数应该很简单了

- context 这没什么可说的
- title 进度框的标题，可以传空“”
- apkUrl 这就是下载apk的地址，不要传错了

###### 呃，然后就没了。当然了，是不是有新版本当然还是自己和后台的交互得到结果了
###### 有新版本才调用更新，没有，那还更个屁啊

