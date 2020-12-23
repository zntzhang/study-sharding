package com.example.studysharding.common.service;

import java.util.Set;

public interface IRoleService {
    Set<String> getRolesByUserId(Long uid);
}
