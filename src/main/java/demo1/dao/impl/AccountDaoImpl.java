package demo1.dao.impl;

import demo1.dao.AccountDao;
import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by Administrator on 2016/9/13.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    public int outMoney(String username, Double money) {
        String sql = "UPDATE account SET money = money - ? WHERE username = ?";
        return this.getJdbcTemplate().update(sql,money,username);
    }

    public int inMoney(String username, Double money) {
        String sql = "UPDATE account SET money = money + ? WHERE username = ?";
        return this.getJdbcTemplate().update(sql,money,username);
    }

}
