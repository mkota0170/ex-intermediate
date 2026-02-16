package com.intermediate.exintermediate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.intermediate.exintermediate.domain.baseballTeam;
import com.intermediate.exintermediate.service.baseballTeamService;

@Controller
@RequestMapping("/ex-intermediate")
public class baseBallteamController {
    
    @Autowired
    private baseballTeamService service;

    /**
     * チーム一覧選択画面への移動
     * @param model
     * @return 選択画面への移動
     */
    @RequestMapping("")
    public String showDetails(Model model){
        List<baseballTeam> list =  service.showList();
        model.addAttribute("nameList",list);
        return "selectTeam";
    }

    /**
     * 選択したチームの詳細情報を表示する画面へ遷移するメソッド
     * @param teamName
     * @param model
     * @return 選択したチームの詳細情報が記載されたページへ遷移
     */
    @RequestMapping("/move")
    public String movePage(@RequestParam("teamName") String teamName,Model model){
        baseballTeam baseballTeam = service.showDetail(teamName);
        model.addAttribute("detail", baseballTeam);
        return "detail";
    }
}
