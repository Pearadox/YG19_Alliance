package com.pearadox.yg_alliance;

import com.google.firebase.database.IgnoreExtraProperties;

public class p_Firebase {

    @IgnoreExtraProperties

    public static class eventObj {
        private String comp_code;
        private String comp_name;
        private String comp_div;
        private String comp_date;
        private String comp_city;
        private String comp_place;

        // Default constructor required for calls to
        // DataSnapshot.getValue(eventObj.class)
        public eventObj() {
        }

        public eventObj(String comp_code, String comp_name, String comp_div, String comp_date, String comp_city, String comp_place) {
            this.comp_code = comp_code;
            this.comp_name = comp_name;
            this.comp_div = comp_div;
            this.comp_date = comp_date;
            this.comp_city = comp_city;
            this.comp_place = comp_place;
        }

        public String getComp_code() {
            return comp_code;
        }

        public void setComp_code(String comp_code) {
            this.comp_code = comp_code;
        }

        public String getcomp_name() {
            return comp_name;
        }

        public void setcomp_name(String comp_name) {
            this.comp_name = comp_name;
        }

        public String getcomp_div() {
            return comp_div;
        }

        public void setcomp_div(String comp_div) {
            this.comp_div = comp_div;
        }

        public String getcomp_date() {
            return comp_date;
        }

        public void setcomp_date(String comp_date) {
            this.comp_date = comp_date;
        }

        public String getcomp_city() {
            return comp_city;
        }

        public void setcomp_city(String comp_city) {
            this.comp_city = comp_city;
        }

        public String getcomp_place() {
            return comp_place;
        }

        public void setcomp_place(String comp_place) {
            this.comp_place = comp_place;
        }
    }

// ==========================================================
// ==========================================================
    public static class teamsObj {
    private String team_num;
    private String team_name;
    private String team_loc;
    private String team_OPR;
    private String team_rank;
    private String team_rScore;
    private String team_WLT;

    public teamsObj() {
    }

    public teamsObj(String team_num, String team_name, String team_loc, String team_OPR, String team_rank, String team_rScore, String team_WLT) {
        this.team_num = team_num;
        this.team_name = team_name;
        this.team_loc = team_loc;
        this.team_OPR = team_OPR;
        this.team_rank = team_rank;
        this.team_rScore = team_rScore;
        this.team_WLT = team_WLT;
    }

    public String getTeam_num() {
        return team_num;
    }

    public void setTeam_num(String team_num) {
        this.team_num = team_num;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getTeam_loc() {
        return team_loc;
    }

    public void setTeam_loc(String team_loc) {
        this.team_loc = team_loc;
    }

    public String getTeam_OPR() {
        return team_OPR;
    }

    public void setTeam_OPR(String team_OPR) {
        this.team_OPR = team_OPR;
    }

    public String getTeam_rank() {
        return team_rank;
    }

    public void setTeam_rank(String team_rank) {
        this.team_rank = team_rank;
    }

    public String getTeam_rScore() {
        return team_rScore;
    }

    public void setTeam_rScore(String team_rScore) {
        this.team_rScore = team_rScore;
    }

    public String getTeam_WLT() {
        return team_WLT;
    }

    public void setTeam_WLT(String team_WLT) {
        this.team_WLT = team_WLT;
    }
}

// ==========================================================
// ==========================================================
    public static class devicesObj {
        private String dev_name;
        private String dev_desc;
        private String dev_id;
        private String stud_id;
        private String phase;
        private String batt_stat;
        private String btUUID;

        public devicesObj() {
        }

    public devicesObj(String dev_name, String dev_desc, String dev_id, String stud_id, String phase, String batt_stat, String btUUID) {
        this.dev_name = dev_name;
        this.dev_desc = dev_desc;
        this.dev_id = dev_id;
        this.stud_id = stud_id;
        this.phase = phase;
        this.batt_stat = batt_stat;
        this.btUUID = btUUID;
    }

    public String getDev_name() {
            return dev_name;
        }

        public void setDev_name(String dev_name) {
            this.dev_name = dev_name;
        }

        public String getDev_desc() {
            return dev_desc;
        }

        public void setDev_desc(String dev_desc) {
            this.dev_desc = dev_desc;
        }

        public String getDev_id() {
            return dev_id;
        }

        public void setDev_id(String dev_id) {
            this.dev_id = dev_id;
        }

        public String getStud_id() {
            return stud_id;
        }

        public void setStud_id(String stud_id) {
            this.stud_id = stud_id;
        }

        public String getPhase() {
            return phase;
        }

        public void setPhase(String phase) {
            this.phase = phase;
        }

        public String getBtUUID() {
            return btUUID;
        }

        public void setBtUUID(String btUUID) {
            this.btUUID = btUUID;
        }
        public String getBatt_stat() {
            return batt_stat;
        }
        public void setBatt_stat(String batt_stat) {
            this.batt_stat = batt_stat;
        }
    }

    // ==========================================================
// ==========================================================
    public static class students {
        private String name;
        private String status;

        public students() {
        }

        public students(String name, String status) {
            this.name = name;
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public String getStatus() {
            return status;
        }

        public void setName(String sName) {
            this.name = sName;
        }

        public void setStatus(String Stat) {
            this.status = Stat;
        }
    }

// ==========================================================
// ==========================================================

    public static class matchObj {
        private String date;
        private String time;
        private String mtype;
        private String match;
        private String r1;
        private String r2;
        private String r3;
        private String b1;
        private String b2;
        private String b3;

        // Default constructor required for calls to
        // DataSnapshot.getValue(teams.class)
        public matchObj() {
        }

        public matchObj(String date, String time, String mtype, String match, String r1, String r2, String r3, String b1, String b2, String b3) {
            this.date = date;
            this.time = time;
            this.mtype = mtype;
            this.match = match;
            this.r1 = r1;
            this.r2 = r2;
            this.r3 = r3;
            this.b1 = r1;
            this.b2 = b2;
            this.b3 = b3;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getMtype() {
            return mtype;
        }

        public void setMtype(String mtype) {
            this.mtype = mtype;
        }

        public String getMatch() {
            return match;
        }

        public void setMatch(String match) {
            this.match = match;
        }

        public String getR1() {
            return r1;
        }

        public void setR1(String r1) {
            this.r1 = r1;
        }

        public String getR2() {
            return r2;
        }

        public void setR2(String r2) {
            this.r2 = r2;
        }

        public String getR3() {
            return r3;
        }

        public void setR3(String r3) {
            this.r3 = r3;
        }

        public String getB1() {
            return b1;
        }

        public void setB1(String b1) {
            this.b1 = b1;
        }

        public String getB2() {
            return b2;
        }

        public void setB2(String b2) {
            this.b2 = b2;
        }

        public String getB3() {
            return b3;
        }

        public void setB3(String b3) {
            this.b3 = b3;
        }

    }

    // ==========================================================
// ==========================================================
    public static class curMatch {
        private String cur_match;
        private String r1;
        private String r2;
        private String r3;
        private String b1;
        private String b2;
        private String b3;
        private String our_matches;

        public curMatch() {
        }

        public curMatch(String cur_match, String r1, String r2, String r3, String b1, String b2, String b3, String our_matches) {
            this.cur_match = cur_match;
            this.r1 = r1;
            this.r2 = r2;
            this.r3 = r3;
            this.b1 = r1;
            this.b2 = b2;
            this.b3 = b3;
            this.our_matches = our_matches;
        }

        public String getCur_match() {
            return cur_match;
        }

        public void setCur_match(String cur_match) {
            this.cur_match = cur_match;
        }

        public String getR1() {
            return r1;
        }

        public void setR1(String r1) {
            this.r1 = r1;
        }

        public String getR2() {
            return r2;
        }

        public void setR2(String r2) {
            this.r2 = r2;
        }

        public String getR3() {
            return r3;
        }

        public void setR3(String r3) {
            this.r3 = r3;
        }

        public String getB1() {
            return b1;
        }

        public void setB1(String b1) {
            this.b1 = b1;
        }

        public String getB2() {
            return b2;
        }

        public void setB2(String b2) {
            this.b2 = b2;
        }

        public String getB3() {
            return b3;
        }

        public void setB3(String b3) {
            this.b3 = b3;
        }

        public String getOur_matches() {
            return our_matches;
        }

        public void setOur_matches(String our_matches) {
            this.our_matches = our_matches;
        }
    }

// ==========================================================
// ==========================================================

}
