package com.infsis.proyect1.Controllers;

import com.infsis.proyect1.DTOs.ArticleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Article")

public class ArticleController {
    @GetMapping()
    public ResponseEntity<ArticleDTO> getArticles(){
        ArticleDTO articleDTO=new ArticleDTO(1,"titles","references");
        return ResponseEntity.ok().body(articleDTO);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<ArticleDTO> getArticle(@PathVariable Integer id){
        ArticleDTO articleDTO=new ArticleDTO(1,"title","reference");
        return ResponseEntity.ok().body(articleDTO);
    }

    @PostMapping()
    public ResponseEntity<ArticleDTO> saveArticle(@RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok().body(articleDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ArticleDTO> updateArticle(@PathVariable Integer id,@RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok().body(articleDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable Integer id){

    }
}
