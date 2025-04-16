package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;

    @NotBlank
    @Size(min = 8, message = "비밀번호는 8글자 이상이어야 합니다.")
    @Pattern(regexp = ".*\\d.*", message = "비밀번호에 숫자를 포함시켜 주세요.")
    @Pattern(regexp = ".*[A-Z].*", message = "비밀번호에 대문자를 포함시켜 주세요.")
    private String newPassword;
}
