package com.kodbook.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodbook.entities.Post;
import com.kodbook.repositories.PostRepositories;

@Service
public class PostServiceImplementation implements PostService{

	@Autowired
	PostRepositories repo;
	
	@Override
	public void createPost(Post post) {
		// TODO Auto-generated method stub
		repo.save(post);
		
	}

	@Override
	public List<Post> fetchAllPosts() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

	@Override
	public Post getPost(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void updatePost(Post post) {
		repo.save(post);
	}

	

	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
