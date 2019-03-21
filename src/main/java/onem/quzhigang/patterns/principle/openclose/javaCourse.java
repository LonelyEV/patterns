package onem.quzhigang.patterns.principle.openclose;

import java.math.BigDecimal;

/**
 * @Copyright (C), 2018, 上海米袋融资有限公司
 * @ProjectName: new_gold_midai
 * @FileName: javaCourse
 * @Author: 屈志刚
 * @Date: 2019/3/21/021 14:17
 * @Description:
 * @email ==>> jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class javaCourse implements ICourse {

    private Integer id;
    private String name;
    private BigDecimal price;

    public javaCourse(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}
