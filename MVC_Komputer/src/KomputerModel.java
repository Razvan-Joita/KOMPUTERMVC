public class KomputerModel
{
    private String KName;
    private String KId;
    private String KCategory;

    public String getId() {
        return KId;
    }

    public void setId(String id) {
        this.KId = id;
    }

    public String getName() {
        return KName;
    }

    public void setName(String name) {
        this.KName = name;
    }

    public String getCategory() {
        return KCategory;
    }

    public void setCategory(String category) {
        this.KCategory = category;
    }

}