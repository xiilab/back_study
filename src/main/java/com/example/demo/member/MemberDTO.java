package com.example.demo.member;

import lombok.*;

import javax.validation.constraints.NotNull;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberDTO {

    @Builder
    @AllArgsConstructor
    @Getter
    public static class MemberRequestDTO {
        @NotNull(message = "이름이 null일순 없습니다.")
        private String name;
        private Job job;
    }

    @Builder
    @AllArgsConstructor
    @Getter
    public static class MemberResponseDTO {
        private Long id;
        private String name;
        private Job job;
    }


}