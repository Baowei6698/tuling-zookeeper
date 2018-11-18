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

import com.alibaba.fastjson.JSON;
import org.apache.zookeeper.*;


import java.io.IOException;

public class ProviderServers implements Watcher {

    ZookeeperServerResiter bitZookeeperServer=new ZookeeperServerResiter();

    /***
     * 注册
     * @param serverName
     * @throws IOException
     * @throws KeeperException
     * @throws InterruptedException
     */
    void register(String serverName) throws IOException, KeeperException, InterruptedException {
        ZooKeeper zook= bitZookeeperServer.getConnection(this);
        String node=  zook.create(ZookeeperServerResiter.root+"/server",serverName.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
        System.out.println("创建成功过"+serverName+"，节点："+node);
    }


        @Override
        public void process(WatchedEvent watchedEvent) {

    }

    public static void main(String[] args) throws InterruptedException, IOException, KeeperException {
        ProviderServers server=new ProviderServers();
        StatDto stat=new StatDto();
        int i=0;
        stat.setIp(args[i++]);
        stat.setPort(args[i++]);
        stat.setName(args[i++]);
        stat.setNum(0);
        stat.setStatus(ServerStatus.wait);
        server.register(JSON.toJSONString(stat));
        Thread.sleep(Long.MAX_VALUE);


    }


}
