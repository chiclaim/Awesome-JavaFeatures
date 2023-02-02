package com.java5;

/**
 * 枚举
 *
 * 关于枚举的更多分析，可以查看我的：
 *
 * - https://www.bilibili.com/video/BV1oY411T7d2/
 * - https://www.bilibili.com/video/BV1SS4y1v7Pm/
 * - https://www.bilibili.com/video/BV1W3411G7n9/
 * - https://www.bilibili.com/video/BV1jU4y117Q9/
 * - https://www.bilibili.com/video/BV1it4y1p7TA/
 *
 */
public class Enumerations {


    public enum DatabaseType {
        ORACLE {
            public String getJdbcUrl() {
                return "oracle-url";
            }
        },
        MYSQL {
            public String getJdbcUrl() {
                return "mysql-url-";
            }
        };
        public abstract String getJdbcUrl();
    }

    public static void main(String[] args) {
        // 两个隐藏方法： values/valueOf

        DatabaseType oracle = DatabaseType.valueOf("ORACLE");
        System.out.println(oracle);

        for (DatabaseType value : DatabaseType.values()) {
            System.out.println(value);
        }
    }


}
