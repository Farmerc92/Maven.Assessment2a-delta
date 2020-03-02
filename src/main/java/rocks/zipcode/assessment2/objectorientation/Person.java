package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {

    private Long id;
    private String name;
    private Address address;
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        id = Long.MIN_VALUE;
        address = new Address();
        name = "";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person){
            if (this.getName() != null && ((Person) o).getName() != null) {
                if (!this.getName().equals(((Person) o).getName())) {
                    return false;
                }
            }
            if (this.address != null && ((Person) o).getAddress() != null) {
                if (!this.getAddress().equals(((Person) o).getAddress())) {
                    return false;
                }
            }
            if (this.id != null && ((Person) o).getId() != null) {
                if (!this.getId().equals(((Person) o).getId())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString(){
        return String.format("Person{id=%d, name='%s', address=" + address.toString()+ "}", id, name);
    }
}