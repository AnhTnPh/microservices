package com.crm.fucrm.config;

public class AppConstant {
    public static final String API = "/api/v1";
    public static final String NEWS_API = API + "/news";
    public static class News {
        public static final String CREATE = "/create";
        public static final String UPDATE = "/update";
        public static final String DELETE = "/delete/{id}";
        public static final String FIND_BY_ID = "/find-by-id/{id}";
        public static final String FIND_ALL = "/find-all";

        public static final String CONVERT = "/usd-to-vnd";
    }
}
