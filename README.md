_LSD Project, [case 4](https://datsoftlyngby.github.io/soft2020fall/resources/da1526ac-case-4.pdf)_

# **Accomodation dot com**

## **Glossary**

<details>
  <summary>Click to expand!</summary>

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

<details>
<summary>Click to expand!</summary>

![alt text](https://github.com/Team-A-SOFT2020/Accomodation-dot-com/blob/main/Documentation/LogicalDataModel.png)



This model describes a booking system in which a ”Guest” can book one or multiple vacant rooms with 1 or multiple nr of guests attached.
There are different types of rooms which are attached to “Hotel”(s). They are all a part of a “HotelChain” identified by a “threeLetterCode” (a combination of Country code and three letters derived from “Hotel” name).
“TravelAgency” and “Employee” are displayed and greyed out for future implementation.

This model describes a booking system in which a ”Guest” can book one or multiple vacant rooms with 1 or multiple nr of guests.
There are different types of “Room”(s) which are attached to “Hotel”(s). They are all a part of a “HotelChain” identified by a “threeLetterCode” (a combination of Country code and three letters derived from “Hotel” name).
“TravelAgency” and “Employee” are displayed and greyed out for future implementation.

</details>


## **Use Case Diagram**

<details>
<summary>Click to expand!</summary>

![alt text](https://github.com/Team-A-SOFT2020/Accomodation-dot-com/blob/main/Documentation/UseCaseDiagram.png)



</details>

## **Use Cases**

<details>
<summary>Click to expand!</summary>


<br/>

### UC1

<br/>

**Name:** Show list of vacant rooms

**Description:** Show a list of vacant rooms

**Primary Actor:** Guest

**Preconditions:** none

**Main Succes Scenario:**
  1. Guest selects city, date and number of guests
  2. System shows list of hotels with vacant rooms
  3. Guest selects a hotel
  4. System shows list of vacant rooms

<br/>

**Extensions:**

**2a:** No hotels have vacant rooms that meet (all) the criteria.

  1. System displays "No vacant rooms are available error"
  2. Guest returns to MSS 1


**4a:** Hotel no longer has available room(s)
  1. System displays "Hotel is no longer available error"
  2. Guest returns to MSS 3


**Postcondition (Success guaranties)** A list of vacant rooms is displayed





### UC2

<br/>

**Name:** Create Booking

**Description:** Create a booking

**Primary Actor:** Guest

**Preconditions:** none

**Main Succes Scenario:**

1.	Guest searches for list of vacant rooms (UC1)

2.	Guest selects room to book

3. 	System asks for passport number

4.	Guest fills in passport number and confirms booking

5.	System confirms booking


**Extensions:**

**2a:** Room is no longer available
  1. System displays “Room unavailable error”
  2. System updates list of vacant rooms
  3. Guest returns to MSS 2






**Postcondition (Success guaranties)** A room is booked




### UC3

<br/>

**Name:** Show booking

**Description:** Show bookings made by the guest

**Primary Actor:** Guest

**Preconditions:** none

**Main Succes Scenario:**

1.	Guest fills in booking id

2.	System shows booking details




**Postcondition (Success guaranties)** Bookings made my guest is displayed.



### UC4

<br/>

**Name:** Cancel Booking

**Description:** Cancels a booking

**Primary Actor:** Guest

**Preconditions:** none

**Main Succes Scenario:**

1.	System displays current bookings (UC3)

2.	Guest selects room to cancel

3.	System confirms cancelation


**Postcondition (Success guaranties)** A room is canceled


</details>


## **Sequence Diagrams**

<details>
<summary>Click to expand!</summary>

### Sequence Diagram 1


![alt text](https://github.com/Team-A-SOFT2020/Accomodation-dot-com/blob/main/Documentation/sequenceDiagram1.png)

### Sequence Diagram 2

![alt text](https://github.com/Team-A-SOFT2020/Accomodation-dot-com/blob/main/Documentation/sequenceDiagram2.png)

### Sequence Diagram 3

![alt text](https://github.com/Team-A-SOFT2020/Accomodation-dot-com/blob/main/Documentation/sequenceDiagram3.png)




</details>
