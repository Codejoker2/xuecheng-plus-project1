package com.xuecheng.content.api;

import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.service.CourseBaseInfoService;
import com.xuecheng.exception.ValidationGroups;
import com.xuecheng.model.PageParams;
import com.xuecheng.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zengweichuan
 * @description 课程信息编辑接口
 * @date 2024/3/24
 */
@Api(value = "课程信息编辑接口",tags = "课程信息编辑接口")
@RestController
@RequestMapping("/course")
public class CourseBaseInfoController {

    @Resource
    private CourseBaseInfoService courseBaseInfoService;
    @PostMapping("/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto){
        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParamsDto);
        return courseBasePageResult;
    }

    @PostMapping
    public CourseBaseInfoDto createCourseBase(@RequestBody @Validated(ValidationGroups.Inster.class) AddCourseDto addCourseDto){
        CourseBaseInfoDto courseBase = courseBaseInfoService.createCourseBase(addCourseDto);
        return courseBase;
    }

}