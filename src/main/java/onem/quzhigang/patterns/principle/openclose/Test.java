package onem.quzhigang.patterns.principle.openclose;

import java.math.BigDecimal;

/**
 * @Copyright (C), 2018, 上海米袋融资有限公司
 * @ProjectName: new_gold_midai
 * @FileName: Test
 * @Author: 屈志刚
 * @Date: 2019/3/21/021 14:35
 * @Description:
 * @email ==>> jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class Test {

    public static void main(String[] args) {

        //ICourse javaCourse = new javaCourse(1,"java编程思想",new BigDecimal(100));
        //System.out.println(javaCourse.getId()+"||"+javaCourse.getName()+"||"+javaCourse.getPrice());
        System.out.println("=====================================================================");
        ICourse javaCourse = new JavaDiscountCourse(1,"java编程思想",new BigDecimal(100));
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)javaCourse;

        BigDecimal price = javaDiscountCourse.getPrice().setScale(2,BigDecimal.ROUND_HALF_DOWN);

        System.out.println(javaDiscountCourse.getId()+"||"+javaDiscountCourse.getName()+"||打折后价格："
                +price+"||原价："+javaDiscountCourse.getOriginPrice());

    }
}
