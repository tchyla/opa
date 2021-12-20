package pl.tchyla.opa.pojo;

public class ActorsContract {
    private Integer id;
    private String contract;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public ActorsContract(Integer id, String contract) {
        this.id = id;
        this.contract = contract;
    }
}
