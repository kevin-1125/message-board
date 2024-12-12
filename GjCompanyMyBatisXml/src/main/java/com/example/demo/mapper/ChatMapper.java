package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Chat;

@Mapper
public interface ChatMapper {
	//新增
	void addChat(Chat c);
	//查詢
	List<Chat> selectAll();
	List<Chat> selectById(int id);
	//List<Chat> selectByIdRange(int start,int end);
	//刪除
	void update(Chat c);
	//修改
	void deleteById(int id);
	
	
	/*@Select("select * from chat")
	List<Chat> allChat();*/

}
