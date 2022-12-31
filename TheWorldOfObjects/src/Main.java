class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
        // Create a new Contact object for Alice
        Contact friendAlice = new Contact();
        // Set the fields
        friendAlice.name = "Alice";
        friendAlice.phoneNumber = "798542132";
        // Add Alice Contact to the ContactsManager
        myContactsManager.addContact(friendAlice);
        // Create a new Contact object for Alex
        Contact friendAlex = new Contact();
        // Set the fields
        friendAlex.name = "Alex";
        friendAlex.phoneNumber = "795558885";
        // Add Alex Contact to the ContactsManager
        myContactsManager.addContact(friendAlex);
        // Create a new Contact object for Nicole
        Contact friendNicole = new Contact();
        // Set the fields
        friendNicole.name = "Nicole";
        friendNicole.phoneNumber = "779558885";
        // Add Nicole Contact to the ContactsManager
        myContactsManager.addContact(friendNicole);

        // Now let's try to search of a contact and display their phone number
        Contact result = myContactsManager.searchContact("Alex");
        System.out.println(result.phoneNumber);
    }
}







