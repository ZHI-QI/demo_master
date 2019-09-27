package com.example.demo_master.common.vo;

import java.util.List;

/**
 * 分页结果类
 * @Auther: wangzhiqi
 * @Date: 2019/9/27 14:17
 * @Description:
 */
public class PageResult<T> {

    private Long total;
    private List<T> rows;

    public PageResult(Long total, List<T> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
