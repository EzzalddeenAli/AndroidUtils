package cloud.cn.applicationtest.entity;

/**
 * Created by Cloud on 2016/4/15.
 */
public class UpgradeInfo {
    private int version;
    private String url;
    private String desc;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
