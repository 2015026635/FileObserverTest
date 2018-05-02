# FileObserverTest
android 监听文件变化

!!!需要注意
1.注册OPEN事件在某些手机不生效

    原因:某些手机回调没有OPEN事件

     解决:   可以注册 ACCESS 代替 OPEN

2.注册ALL_EVENTS 不生效

    原因:某版本手机访问sd卡权限有三种状态 拒绝,询问,

    解决:设为允许 ,部分手机默认安转为询问
