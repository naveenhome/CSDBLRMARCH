Feature: Add new prescription
As a nnnnnnnnnnn 9810547500

Scenario: Save valid prescription
Given Patient enter valid prescription data
When click on "Save"
Then System display "Prescription is saved" with "OK" button
And clicking on "OK" will take patient on "Home" page
And patient can see newly added prescription on "Home" Page

Scenario: Save valid prescription with data
Given Patient enter name as "Naveen" and doctor name as "ABC" visit date as "12/2/2017" and time is "9.30" and image file name is "rx1.png" and "rx2.png"
When click on "Save"
Then System display "Prescription is saved" with "OK" button
And clicking on "OK" will take patient on "Home" page
And patient can see newly added prescription on "Home" Page