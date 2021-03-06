package com.zjut.henry.indoorlocationng;

/**
 * 全局参数
 * Created by henry on 12/6/17.
 */

class GlobalParameter {

    // Beacon服务器地址
    static String SERVER_IP = "101.37.22.132";

    // Beacon服务器端口
    static int SERVER_PORT = 6667;

    // 守护进程启动间隔时间(ms)
    static long SERVICE_DAEMON_PERIOD = 10000;

    // Beacon Cache 生命时长
    static long BEACON_CACHE_LIFE = 2 * 1000 * 60 * 60 * 24;    // 2 天
    // static long BEACON_CACHE_LIFE = 5000;

    // 在线Beacon生命时长
    static long BEACON_ONLINE_LIFE = 3000;                     // 3 秒

    // 地点切换间隔时间
    static long REGION_SWIFT_PERIOD = 1000;

    // 闲时定位间隔
    static long LOCATION_PERIOD = 10000;

    // 定位使用的Beacon数目
    static int LOCATION_BEACON_QUANTITY = 4;

    // 质心定位算法参数
    static double LOCATION_WEIGHTED_CENTROID_ALPHA = 3.0D;

    // 结果比例尺(输出 = 定位结果(cm) / 结果比例尺)
    static double RESULT_SCALE = 100;
}
