package com.example.ashraf.recyclerview;

import java.util.ArrayList;

/**
 * Created by Trainer on 8/29/2017.
 */

public class PhoneContact {
    private String contactName;
    private String contactNumber;
    private int contactImage;

    public PhoneContact(String contactName, String contactNumber, int contactImage) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.contactImage = contactImage;
    }

    public PhoneContact() {
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getContactImage() {
        return contactImage;
    }

    public void setContactImage(int contactImage) {
        this.contactImage = contactImage;
    }

    public ArrayList<PhoneContact>getAllContacts(){
        ArrayList<PhoneContact>contacts = new ArrayList<>();
        contacts.add(new PhoneContact("abc","456789",R.mipmap.ic_launcher));
        contacts.add(new PhoneContact("abc","456789",R.mipmap.ic_launcher));
        contacts.add(new PhoneContact("abc","456789",R.mipmap.ic_launcher));
        contacts.add(new PhoneContact("abc","456789",R.mipmap.ic_launcher));
        contacts.add(new PhoneContact("abc","456789",R.mipmap.ic_launcher));
        contacts.add(new PhoneContact("abc","456789",R.mipmap.ic_launcher));
        return contacts;
    }
}
