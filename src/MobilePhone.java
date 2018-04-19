import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> arrayList = new ArrayList<>();

    //todo:function


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.arrayList = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already in the file");
            return false;
        }
        arrayList.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.arrayList.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.arrayList.remove(foundPosition);
        System.out.println(contact.getName()+ " was removed");
        return true;
    }

    private int findContact(Contact contact) {
        return this.arrayList.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.arrayList.size(); i++) {
            Contact contact = this.arrayList.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }


    public String queryContact(Contact contact){
        if(findContact(contact) > 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){

        int position = findContact(name);
        if(position >= 0){
            return this.arrayList.get(position);
        }
        return null;
    }

    public void printContacts() {

        System.out.println("Contact list");
        for(int i=0; i<this.arrayList.size();i++){
            System.out.println((i+1)+ "."+ this.arrayList.get(i).getName()+" -> "+ this.arrayList.get(i).getPhoneNumber());
        }

    }
}
