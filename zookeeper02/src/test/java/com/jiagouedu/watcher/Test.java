package com.jiagouedu.watcher;/* ━━━━━━如来保佑━━━━━━
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


import com.jiagouedu.zkclient.watcher.ZkClientWatcher;

public class Test {

   public static void main(String[] args) throws InterruptedException {
      ZkClientWatcher zkClientWatcher=new ZkClientWatcher();
      String path="/wukong";
      zkClientWatcher.lister(path);
      zkClientWatcher.deleteRecursive(path);
      zkClientWatcher.createPersistent(path,"123");
      Thread.sleep(2000);
      zkClientWatcher.writeData(path,"abc");
      Thread.sleep(Integer.MAX_VALUE);
   }
}
