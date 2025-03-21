## Quick Start

1.  Ensure you have Java 17 or above installed on your PC. **[Version 17 is preferred]**
2.  You may download [here](https://se-education.org/guides/tutorials/javaInstallationMac.html) for Mac users and [here](https://www.oracle.com/sg/java/technologies/downloads/) for Windows users.
3.  If you have it installed already, you may check it by running `java -version` in your terminal.
4.  Download the latest `.jar` file from here. **[link will be updated once v1 is ready]**
5.  Copy the file to the folder you want to use as the home folder for your **O$P$ budget tracking app** 🙂.
6.  Open a command terminal, `cd` into the folder you put the jar file in, and use the `java -jar oSpS.jar` command to run the application.
7.  Type the command in the command box and press **Enter** to execute it.
8.  **Example:** Typing `help` and pressing **Enter** will open a mini window showing a list of all possible commands.
9.  Refer to the [features](https://docs.google.com/document/d/125Cg7wzuc4XFo3wsziwL2f64KN1uUfvFL5dIm6IQrSk/edit?tab=t.xl7ogrtj0a5q#heading=h.61o02m6y9xrc) section below for details on all commands and functionalities.

---

## Feature List

### Admin:

#### Viewing help: `/help`
Lists the commands available to the user.
- **Usage:** `/help`
- **Expected output:** *[To insert list of commands that will be returned]*

---

#### Exiting the program: `/bye`
Terminates the program and saves the user’s data, such as their payee list, groups, balance, and transaction information to a `.csv` file.
- **Usage:** `/bye`
- **Expected output:** *[Save aforementioned data into file and produce an exit message]*

---

## Manage Balance:

#### Add an expense: `/add`
Add an expense with a description, amount, category, payee.

- **Format:**
  ```
  /add <amount>
  "App asks for description" <description of payment>
  "App asks for category of expense" <category of expense>
  "App asks for currency" <*optionally convert the amount into SGD as the home currency*>
  ```

- **Usage:**
  ```
  /add 400
  "Add a description for this expense!"
  User input: Grab-booking
  "Add a category for this expense!"
  User input: transport
  "What currency is this expense in? Leave EMPTY if in SGD"
  User input: YEN
  "Awesome! I have added this expense :)
  You can view it under your expenses now!"
  ```
  The entry will automatically be tagged with a unique expense ID.

---

#### Delete an expense: `/delete`
Delete expenses to remove unwanted expenses.
- **Format:** `/delete <expense ID>`
- **Usage:** `/delete 2`

---

#### Edit an expense: `/edit`
Edit an existing expense.
- **Format:**
  ```
  edit
  "Enter the index of the expense to edit" <index of expense>
  "Enter the expense details"
  "Title:" <New title>
  "Description:" <New description>
  "Amount:" <New amount>
  ```

- **Usage:**
  ```
  edit
  "Enter the index of the expense to edit" 
  User input:1
  "Enter the expense details"
  "Title:"
  User input: Edited expense 1
  "Description:"
  User input: new edited expense
  "Amount:" 10
  ```
---

#### View all expenses: `/list`
View all the expenses.
- **Format:** `/list`
- **Usage:** `/list`
- **Example:**
  ```
  List of Expenses:
  Expense #1
  Title: test expense
  Description: testing testing
  Amount: $50.00
  ```

---

#### View unsettled expenses: `/list-unsettled`
View expenses you owe or is owed to you.
- **Format and Usage:** `/list-unsettled`
- **Example:**
  ```
  1. Alex owes you $10
  2. Mary owes you $20
  3. You owe Raj $30
  ```

---

#### View settled expenses: `/list-settled`
View expenses that are marked as settled using "mark" command.
- **Format and Usage:** `/list-settled`
- **Example:**
  ```
  Expense #1
  Title: test expense
  Description: testing testing
  Amount: $50.00
  
  List of Settled Expenses:
  You have 1 settled expense
  ```

---

#### Mark settled expenses: `/mark`
Once a transaction is made, the user can mark it as paid.

- **Usage:**
  ```
  /mark
  "Enter expense number to mark:"
  User input: 1
  
  ```

---

#### Unmark settled expenses: `/unmark`
User can unmark an expense that has been marked already.

- **Usage:**
  ```
  "Enter expense number to unmark"
  User input: 1
  ```

---

#### View balance in wallet: `/balance`
Shows total money to be paid and total money to pay.
- **Output:**
  ```
  Total money to pay: <total amount user owes>
  Total money to receive: <total amount user is owed>
  ```

---

## Manage Group Members:

#### View Friends in a group: `/create-group`
Create a new group to split expenses with.
- **Usage:**
  ```
  create-group
  "Enter the group name:" test group
  "Who would you like to add to the group? (Type 'done' to finish)"
  "Enter name:" apple
  "Enter name:" mango
  "Enter name:" carrot
  "Enter name:" done
  Group created successfully!
  
  ```

---

#### Add Friends to a group: `/view-group`
View a specific group and see how much each member owes.
- **Usage:**
  ```
  view-group
  Enter the group name to view: TestGroup
  Group: TestGroup
  Members of group "TestGroup":
  - Alice owes: 25.00
  - Bob owes: 25.00
  
    ```

---

#### Add Friends to a group: `/add-member`
Adds a user to a group.
- **Usage:**
  ```
  add-member
  Enter the name of the member to add: natasha
  Enter the group name: TestGroup
  natasha has been added to TestGroup
  
    ```

---

#### Add Friends to a group: `/remove-member`
Removes a member from a group
- **Usage:**
  ```
  remove-member
  Enter the name of the member to remove: natasha
  Enter name of group to remove member from: TestGroup
  
    ```

---

#### Add Friends to a group: `/my-groups`
Shows all of the users groups.
- **Usage:**
  ```
  my-groups
  Group Name: TestGroup
  Members:
  - Alice
  - Bob
  - natasha
  
  Group Name: NewGroup
  Members:
  - Charlie

  Group Name: test group
  Members:
  - apple
  - mango
  - carrot
  ```

---

#### Add Friends to a group: `/remove-group`
Removes an entire group.

- **Usage:**
  ```
  remove-group
  Enter the name of the group to remove: TestGroup
  
    ```

---

## Manage Payments:

#### Select split method: `/split`
Opens a menu for the user to select a method of splitting.
- **Format:** `/split`
- **Example output:**
  ```
  [1] Split equally among all members of the selected group
  [2] Manually input percentage and members involved in transaction
  [x]: Cancel
  ```
---




