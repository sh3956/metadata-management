package com.emma.bootscala.controller;

import com.emma.bootscala.domain.MetaDatabase;
import com.emma.bootscala.service.MetaDatabaseService;
import com.emma.bootscala.utils.ResultVO;
import com.emma.bootscala.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;

@RestController
@RequestMapping("/meta/database")
public class MetaDatabaseController {

    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value = "/", method= RequestMethod.POST)
    public ResultVO save(@ModelAttribute MetaDatabase metaDatabase){
        metaDatabaseService.save(metaDatabase);
        return ResultVOUtil.success();
    }

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public ResultVO query(){
        return ResultVOUtil.success(metaDatabaseService.query());
    }

}
