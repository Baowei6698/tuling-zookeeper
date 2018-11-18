package com.jiagouedu;/*
 * ━━━━━━如来保佑━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━永无BUG━━━━━━
 * 图灵学院-悟空老师
 * 以往视频加小乔老师QQ：895900009
 * 悟空老师QQ：245553999
 */

import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/***
 * 注册中心 对外提供注册服务的
 */
public class ZookeeperServerResiter {
    private ZooKeeper zk;

    public static final String root="/wukong";
    private static final String  host="192.168.0.31:2181,192.168.0.32:2181,192.168.0.33:2181";

    public ZooKeeper getConnection(Watcher watch) throws IOException {
        zk=new ZooKeeper(host,500,watch);
        return zk;
    }




}
