_LSD Project, [case 4](https://datsoftlyngby.github.io/soft2020fall/resources/da1526ac-case-4.pdf)_

# **Accomodation dot com**

- [Contract](##Contract)
    * [Glossary](##Glossary)
    * [Nouns](###Nouns)
    * [Logical Data Model](##Logical-Data-Model)
    * [Use Case Diagram](##Use-Case-Diagram)
    * [Use Cases and Sequence Diagrams](##Use-Cases-and-Sequence-Diagrams)
      * [UC 1: Show list of vacant rooms](###UC1)
      * [UC 2: Create Booking](###UC2)
      * [UC 3: Show booking](###UC3)
      * [UC 4: Cancel Booking](###UC4)
 

## Contract

### **Glossary**

<details>
  <summary>Nouns</summary>

### **Nouns**



| WORD                           | LDM |
|:-------------------------------|:---:|
| Hotel chain                    |  x  |
| It system                      |     |
| Hotel room                     |  x  |
| System                         |     |
| Web service                    |     |
| Third party solution           |     |
| Web application                |     |
| Employee                       |  x  |
| Travel agency                  |  x  |
| Accommodation                  |  ?  |
| Agreement                      |     |
| Five letter code               |  x  |
| Letters                        |     |
| Hotel                          |  x  |
| 6 digit number                 |  x  |
| name                           |  x  |
| address                        |  x  |
| city                           |  x  |
| distance to center             |  x  |
| star ratings                   |  x  |
| Number rooms                   |  x  |
| Room number                    |  x  |
| digits and Optional letter a-z |  x  |
| Room                           |  x  |
| Guest                          |  x  |
| Type                           |  x  |
| S single                       |  ?  |
| D double                       |  ?  |
| T twin                         |  ?  |
| F family                       |  ?  |
| M meeting room                 |  ?  |
| individual Price               |  x  |
| Passport number                |  x  |
| Booking                        |  x  |
| Adult guest                    |  x  |
| Child guest                    |  x  |
| Nights                         |  x  |
| Capacity                       |  x  |
| Stay                           |     |
| Late arrival                   |  x  |
| Service                        |     |
| task                           |     |
| Vacant hotel room              |  x  |
| City                           |  x  |
| time period                    |  x  |
| Error message                  |     |

</details>


## **Logical Data Model**



![alt text](https://github.com/Team-A-SOFT2020/Accomodation-dot-com/blob/main/Documentation/LogicalDataModel.png)



This model describes a booking system in which a ”Guest” can book one or multiple vacant rooms with 1 or multiple nr of guests attached.
There are different types of rooms which are attached to “Hotel”(s). They are all a part of a “HotelChain” identified by a “threeLetterCode” (a combination of Country code and three letters derived from “Hotel” name).
“TravelAgency” and “Employee” are displayed and greyed out for future implementation.

This model describes a booking system in which a ”Guest” can book one or multiple vacant rooms with 1 or multiple nr of guests.
There are different types of “Room”(s) which are attached to “Hotel”(s). They are all a part of a “HotelChain” identified by a “threeLetterCode” (a combination of Country code and three letters derived from “Hotel” name).
“TravelAgency” and “Employee” are displayed and greyed out for future implementation.



## **Use Case Diagram**



![alt text](https://github.com/Team-A-SOFT2020/Accomodation-dot-com/blob/main/Documentation/UseCaseDiagram.png)


## **Use Cases and Sequence Diagrams**



### UC1


    Name: Show list of vacant rooms

    Description: Show a list of vacant rooms

    Primary Actor: Guest



    Preconditions: none

    Main Succes Scenario:
      1. Guest selects city, date and number of guests
      2. System shows list of hotels with vacant rooms
      3. Guest selects a hotel
      4. System shows list of vacant rooms



    Extensions:

      2a: No hotels have vacant rooms that meet (all) the criteria.

          1. System displays "No vacant rooms are available error"
          2. Guest returns to MSS 1


      4a: Hotel no longer has available room(s)

          1. System displays "Hotel is no longer available error"
          2. Guest returns to MSS 3


    Postcondition (Success guaranties): A list of vacant rooms is displayed


![alt text](https://github.com/Team-A-SOFT2020/Accomodation-dot-com/blob/main/Documentation/sequenceDiagram1.png)



### UC2


    Name: Create Booking

    Description: Create a booking

    Primary Actor: Guest

    Preconditions: none

    Main Succes Scenario:

      1.	Guest searches for list of vacant rooms (UC1)

      2.	Guest selects room to book

      3. 	System asks for passport number

      4.	Guest fills in passport number and confirms booking

      5.	System shows and confirms booking


    Extensions:

      2a: Room is no longer available

          1. System displays “Room unavailable error”
          2. System updates list of vacant rooms
          3. Guest returns to MSS 2



    Postcondition (Success guaranties)** A booking is created


![alt text](https://github.com/Team-A-SOFT2020/Accomodation-dot-com/blob/main/Documentation/sequenceDiagram2.png)

### UC3



    Name: Show booking

    Description: A guest can see booking details of her booking(s)

    Primary Actor: Guest

    Preconditions: none

    Main Succes Scenario:

      1.  Guest fills in passport number

      2.  System shows existing bookings

      3.  Guest selects a booking

      4.  System shows booking details


    Extensions:

      2a: There are no bookings connected to the given passport number

        1. System displays “No bookings error”
        2. Guest returns to MSS 1

    Postcondition (Success guaranties) Bookingdetails are displayed


![alt text](https://github.com/Team-A-SOFT2020/Accomodation-dot-com/blob/main/Documentation/sequenceDiagram3.png)


### UC4


    Name: Cancel Booking

    Description: A guest cancels a booking

    Primary Actor: Guest

    Preconditions: none

    Main Succes Scenario:

      1.	System displays current bookings (UC3)

      2.	Guest cancels booking

      3.  System asks for confirmation

      4.	Guest confirms cancelation

      5.  System confirms cancelation


    Postcondition (Success guaranties)** A room is canceled


![alt text](https://github.com/Team-A-SOFT2020/Accomodation-dot-com/blob/main/Documentation/sequenceDiagram4.png)

