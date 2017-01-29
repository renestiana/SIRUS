package com.bitrisoft.ranap17.repository;

import java.util.List;

import com.bitrisoft.ranap17.model.Article;

public interface ArticleRepository {	
	public Article create(Article article);
	public void destroy(Article article);
	public Article update(Article article);
	public List<Article> findAll();
	public Article findById(Long id);
}
