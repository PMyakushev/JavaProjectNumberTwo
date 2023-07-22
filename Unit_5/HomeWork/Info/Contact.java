package Unit_5.HomeWork.Info;

public class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // constructor, getters, setters

    // В формате "one entry per line"
    public static Contact fromString(String str) {
        String[] parts = str.split("\n");
        return new Contact(parts[0], parts[1]);
    }

    @Override
    public String toString() {
        return name + "\n" + phone + "\n";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}