package com.intermediate.exintermediate.domain;

/**
 * 野球チーム表示のためのdomainクラス。
 */
public class baseballTeam {
    //id
    private Integer id;
    //チーム名
    private String teamName;
    //リーグ名
    private String leagueName;
    //本拠地
    private String headQuarters;
    //発足日
    private String inauguration;
    //歴史
    private String history;

    //以下getter,setter
    
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getLeagueName() {
        return leagueName;
    }
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
    public String getHeadQuarters() {
        return headQuarters;
    }
    public void setHeadQuarters(String headQuarters) {
        this.headQuarters = headQuarters;
    }
    public String getInauguration() {
        return inauguration;
    }
    public void setInauguration(String inauguration) {
        this.inauguration = inauguration;
    }
    public String getHistory() {
        return history;
    }
    public void setHistory(String history) {
        this.history = history;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "baseballTeam [id=" + id + ", teamName=" + teamName + ", leagueName=" + leagueName + ", headQuarters="
                + headQuarters + ", inauguration=" + inauguration + ", history=" + history + "]";
    }
    
    
    

    
}
