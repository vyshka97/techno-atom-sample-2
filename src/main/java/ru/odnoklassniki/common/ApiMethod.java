package ru.odnoklassniki.common;

/**
 * Created by Maksim Egorichev on 4/23/18 at 12:22 AM
 *
 * Список API-методов
 */
public enum ApiMethod {
    USERS_GET_CURRENT_USER("users", "getCurrentUser"),
    USERS_GET_INFO_BY("users", "getInfoBy"),
    GROUP_GET_INFO("group", "getInfo"),
    GROUP_GET_USER_GROUPS_V2("group", "getUserGroupsV2"),
    ;

    private String methodGroup;
    private String methodName;

    ApiMethod(String methodGroup, String methodName) {
        this.methodGroup = methodGroup;
        this.methodName = methodName;
    }

    public String getMethodGroup() {
        return methodGroup;
    }

    public String getMethodName() {
        return methodName;
    }
}