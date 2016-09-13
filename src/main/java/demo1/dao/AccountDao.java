package demo1.dao;

/**
 * Created by Administrator on 2016/9/13.
 */
public interface AccountDao {
    /**
     * 从某用户中转出钱
     * @param username  :用户名
     * @param money     :金钱
     * @return
     */
    public int outMoney(String username,Double money);

    /**
     * 转入某账户中
     * @param username  :用户名
     * @param money     :金钱
     * @return
     */
    public int inMoney(String username,Double money);

}
