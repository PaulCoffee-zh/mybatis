package com.akcomejf.cube.framework;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;

/**
 * 
 * @author bianxj
 *
 * @param <T>
 */
@Service
public abstract class MyService<T> {

	@Autowired
	protected MyMapper<T> mapper;

	/**
	 * 保存一个实体，null的属性也会保存，不会使用数据库默认值
	 * 
	 * @param entity
	 * @return
	 */
	@Transactional
	public int insert(T entity) {
		return mapper.insert(entity);
	}

	/**
	 * 根据主键更新实体全部字段，null值会被更新
	 * 
	 * @param entity
	 * @return
	 */
	@Transactional
	public int updateByPrimaryKey(T entity) {
		return mapper.updateByPrimaryKey(entity);
	}

	@Transactional
	public int delete(T entity) {
		return mapper.delete(entity);
	}

	@Transactional
	public void deleteByPrimaryKey(Object id) {
		mapper.deleteByPrimaryKey(id);
	}

	public T selectByPrimaryKey(Object pk) {
		return mapper.selectByPrimaryKey(pk);
	}

	/**
	 * 根据实体中的属性进行查询，只能有一个返回值，有多个结果是抛出异常，查询条件使用等号
	 * 
	 * @param record
	 * @return
	 */
	public T selectOne(T entity) {
		return mapper.selectOne(entity);
	}

	/**
	 * 根据Example条件进行查询
	 * 
	 * @param example
	 * @return
	 */
	public List<T> selectByExample(Object example) {
		return mapper.selectByExample(example);
	}

	public List<T> selectPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return mapper.select(null);
	}

	public List<T> selectPage(int pageNum, int pageSize, Object example) {
		PageHelper.startPage(pageNum, pageSize);
		return mapper.selectByExample(example);
	}

}