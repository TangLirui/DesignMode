package com.gupaoedu.pattern.template.jdbc.dao;

import com.gupaoedu.pattern.template.jdbc.JdbcTemplate;
import com.gupaoedu.pattern.template.jdbc.Member;
import com.gupaoedu.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

public class MemberDao {

    private DataSource dataSource;

    public MemberDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";
        return new JdbcTemplate(dataSource).executeQuery(sql, new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPasswd(rs.getString("passwd"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        }, null);
    }
}
