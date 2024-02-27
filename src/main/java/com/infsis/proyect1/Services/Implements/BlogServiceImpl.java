package com.infsis.proyect1.Services.Implements;


import com.infsis.proyect1.DTOs.BlogDTO;
import com.infsis.proyect1.Models.Blog;
import com.infsis.proyect1.Services.BlogService;

import java.util.Optional;

public class BlogServiceImpl implements BlogService {
    @Override
    public Optional<BlogDTO> getBlogById(Integer blogId) {
        return Optional.empty();
    }

    @Override
    public BlogDTO saveBlog(BlogDTO blogDTO) {
        return null;
    }

    @Override
    public BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO) {
        return null;
    }

    @Override
    public void deleteBlog(Integer blogId) {

    }
    public Blog blogDtoToBlog(BlogDTO blogDTO){
        Blog blog = new Blog();
        blog.setId(blogDTO.getId());
        blog.setName(blogDTO.getName());
        return blog;
    }
    public BlogDTO blogToBlogDto(Blog blog){
        BlogDTO blogDTO = new BlogDTO(
                blog.getId(),
                blog.getName()
        );
        return blogDTO;
    }
}
