package com.example.demo.dao;

import java.util.List;
import com.example.demo.entity.ApplicationList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ListDaoImpl implements ListDao {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ListDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertList(ApplicationList applicationList) {
		// TODO 自動生成されたメソッド・スタブ
		jdbcTemplate.update("INSERT INTO list_db(expenses_id, user_id, content_id, status_id, money, reason, is_user, isdate, upd_user, upd_date, is_delete) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
				applicationList.getExpensesId(), applicationList.getContentId(), applicationList.getStatusId(), applicationList.getMoney(), applicationList.getReason(),
				applicationList.getIsUser(), applicationList.getIsDate(), applicationList.getUpdUser(), applicationList.getUpdDate(), applicationList.getIsDelete());
	}

	@Override
	public List<ApplicationList> getAll() {
		// TODO 自動生成されたメソッド・スタブ
		String sql = "SELECT ";
	}

}
