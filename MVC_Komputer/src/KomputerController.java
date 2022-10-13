public class KomputerController
{
    private KomputerModel model;
    private KomputerView view;

    public KomputerController(KomputerModel model, KomputerView view){
        this.model = model;
        this.view = view;
    }

    public void setKomputerName(String name){
        model.setName(name);
    }

    public String getKomputerName(){
        return model.getName();
    }

    public void setKomputerId(String id){
        model.setId(id);
    }

    public String getKomputerId(){
        return model.getId();
    }

    public void setKomputerCategory(String category){
        model.setCategory(category);
    }

    public String getKomputerCategory(){
        return model.getCategory();
    }
    public void updateView(){
        view.printKomputerDetails(model.getName(), model.getId(), model.getCategory());
    }
}