package com.example.studysharding.common.service;

import java.util.Set;

public interface IPermService {
    Set<String> getPermsByUserId(Long uid);
}
