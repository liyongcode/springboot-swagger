package com.example.swagger.controller;


import com.example.swagger.model.Department;
import com.example.swagger.model.ResObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Api(description = "部门接口")
@Component
@RequestMapping("/department")
public class DepartmentCotroller {

    @ApiOperation(value = "新增部门" ,  notes="新增部门")
    @RequestMapping(value="/createDepartment",method= RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResObject createDepartment(@RequestBody Department department){
        System.out.println("createDepartment:::"+department.toString());
        return new ResObject(HttpStatus.OK.value(), "新增成功.");
    }

    @ApiOperation(value = "修改部门" ,  notes="修改部门")
    @RequestMapping(value="/updateDepartment",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResObject updateDepartment(@RequestBody Department department){
        System.out.println("updateDepartment:::"+department.toString());
        return new ResObject(HttpStatus.OK.value(), "修改成功.");
    }

    @ApiOperation(value = "删除部门" ,  notes="删除部门")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "departmentNo", value = "部门编号", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)
    @ResponseBody
    public ResObject deleteDepartment(@RequestParam("departmentNo") String departmentNo){
        System.out.println("deleteUser:::"+departmentNo);
        return new ResObject(HttpStatus.OK.value(), "删除成功.");
    }

    @ApiOperation(value = "查询部门" ,  notes="查询部门")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "departmentNo", value = "部门编号", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/queryDepartment",method=RequestMethod.GET)
    @ResponseBody
    public ResObject queryDepartment(@RequestParam("departmentNo") String departmentNo){
        System.out.println("queryUser:::"+departmentNo);
        Department department = new Department(departmentNo, "开发部");
        return new ResObject(HttpStatus.OK.value(), department);
    }

}
