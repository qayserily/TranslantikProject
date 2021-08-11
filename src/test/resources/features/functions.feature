@wip
Feature: User can navigate to the "General Infirmation" page by clicking on the related car

    Scenario Outline:

        Given The user is on the login page
        And "User" should be able to login with its "Password"
        And User can navigate to the "General Infirmation" page by clicking on the "eye" sign under ''...''
        And User should see "edit", "delete" and "add event" buttons on the General Information
        When User can see created activities by click on the Activity module on the ''General Information'' page
        Then All of the information between the "General Information" page and table should be matched

        Examples:
            | MODEL NAME | MAKE    | CAN BE REQUESTED | CVVI   | CO2 FEE(/MONTH) | COST (DEPRECIATED) | TOTAL COST(DEPRECIATED) | CO2 EMISSIONS | FUEL TYPE | VENDORS            |
            | Model S    | Tesla   | YES              | 23     | 23              | 23                 | 32                      | 23            | Diesel    | 23                 |
            | Enzo       | Ferrari | YES              | 123    | 23              | 12,331             | 12,332                  | 123           | Diesel    | 213                |
            | Mazda      | Opel    | YES              | 222    | 21              | 222                | 222                     | 22            | Electric  | Michael's Car Shop |
            | Rouge      | Nissan  | NO               | 16,000 | 2,100           | 12,500             | 15,000                  | 120           | Gasoline  | Eugino Dealer      |
            | FOCUS      | FORD    | YES              | 5,000  | 2.5             | 0.02               | 5,600                   | 0             | Electric  | MR VENDOR          |