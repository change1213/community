package com.dubble.community.strategy;

import com.dubble.community.dto.AccessTokenDTO;
import com.dubble.community.dto.GiteeUser;
import com.dubble.community.provider.GiteeProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiteeUserStrategy implements UserStrategy {
    @Autowired
    private GiteeProvider giteeProvider;

    @Override
    public LoginUserInfo getUser(String code, String state) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setState(state);
        String accessToken = giteeProvider.getAccessToken(accessTokenDTO);
        GiteeUser giteeUser = giteeProvider.getUser(accessToken);
        LoginUserInfo loginUserInfo = new LoginUserInfo();
        loginUserInfo.setAvatarUrl(giteeUser.getAvatarUrl());
        loginUserInfo.setBio(giteeUser.getBio());
        loginUserInfo.setId(giteeUser.getId());
        loginUserInfo.setName(giteeUser.getName());
        return loginUserInfo;
    }

    @Override
    public String getSupportedType() {
        return "gitee";
    }
}
