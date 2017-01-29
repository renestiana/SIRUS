/**
 * 
 */
package com.bitrisoft.ranap17.service;

import java.util.List;

import com.bitrisoft.ranap17.model.Article;

/**
 * @author leonardo
 *
 */
public interface ArticleService {
	public Article create(Article article);
	public Article update(Article article);
	public void destroy(Article article) throws Exception;
	public Article findById(Long id);
	public List<Article> findAll();
}
