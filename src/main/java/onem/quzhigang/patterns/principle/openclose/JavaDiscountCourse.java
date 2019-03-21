package onem.quzhigang.patterns.principle.openclose;

import java.math.BigDecimal;

/**
 * @Copyright (C), 2018, 上海米袋融资有限公司
 * @ProjectName: new_gold_midai
 * @FileName: JavaDiscountCourse
 * @Author: 屈志刚
 * @Date: 2019/3/21/021 14:43
 * @Description:
 * @email ==>> jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class JavaDiscountCourse extends javaCourse {

    public JavaDiscountCourse(Integer id, String name, BigDecimal price) {
        super(id, name, price);
    }

    public BigDecimal getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(new BigDecimal(0.8));
    }
}
