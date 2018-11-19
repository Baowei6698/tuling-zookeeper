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

/****
 * 由于zkClient创建连接的时候指定了默认的序列化类-new SerializableSerializer(),
 * 所以存储在节点上的值也是序列化后的字节数组，当使用zkCli.sh在控制台set /xxx/xx的值时，
 * 存储的是普通的字符串字节数组。所以当set值时虽然触发了值改变事件，但zkClient无法反序列化这个值。
 * 1、在我们ZkClientWatcher这个类中是加了序列化的（org.I0Itec.zkclient.ZkClient#ZkClient(org.I0Itec.zkclient.IZkConnection, int, org.I0Itec.zkclient.serialize.ZkSerializer)
 * 在zkCli.sh 并没有 然后我为了验证 我在zkCli.sh 删除节点和增加节点都可以
 * 感应到事件
 *
 *
 */
public class Test2 {
   public static void main(String[] args) throws InterruptedException {
      ZkClientWatcher zkClientWatcher=new ZkClientWatcher();
      String path="/wukong";
      zkClientWatcher.writeData(path,"abc"); //能触发 或者在sh zkCli.sh  delete /wukong 也行
   }
}
