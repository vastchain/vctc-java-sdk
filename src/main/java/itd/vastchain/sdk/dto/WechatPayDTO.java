package itd.vastchain.sdk.dto;

import com.alibaba.fastjson.JSONObject;

public class WechatPayDTO extends VctcApiResponseDTO {

    private JSONObject args;

    public JSONObject getArgs() {
        return args;
    }

    public void setArgs(JSONObject args) {
        this.args = args;
    }
}