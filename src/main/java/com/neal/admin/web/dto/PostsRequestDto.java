package com.neal.admin.web.dto;

import com.neal.admin.web.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsRequestDto {

    private String title;
    private String content;
    private String Author;

    @Builder
    public PostsRequestDto(String title, String content, String Author) {
        this.title = title;
        this.content = content;
        this.Author = Author;
    }

    public Posts toEntity() {
        return Posts.builder().title(title).content(content).author(Author).build();
    }
}
