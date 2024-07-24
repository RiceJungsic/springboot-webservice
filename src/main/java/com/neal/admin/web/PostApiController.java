package com.neal.admin.web;

import com.neal.admin.web.dto.PostsResponseDto;
import com.neal.admin.web.dto.PostsSaveRequestDto;
import com.neal.admin.web.dto.PostsUpdateRequestDto;
import com.neal.admin.web.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostsService postsService;


    @PostMapping("/api/v1/posts")
    public long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update (@PathVariable long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable long id) {
        return postsService.findById(id);
    }

}
