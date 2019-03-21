package onem.quzhigang.patterns.principle.singleresponsibility;

/**
 * @Copyright (C), 2018, 上海米袋融资有限公司
 * @ProjectName: new_gold_midai
 * @FileName: JavaCourse
 * @Author: 屈志刚
 * @Date: 2019/3/21/021 17:18
 * @Description:
 * @email ==>> jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class JavaCourse implements CourseContent, CourseManager {

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
