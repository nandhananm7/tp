//@@author matthewyeo1
package seedu.duke.messages;

public class Messages {

    /**
     * System message upon program start-up.
     */
    public void displayWelcomeMessage() {
        setDivider();
        System.out.println("Welcome to O$P$ expense-tracker! How can I help you?");
    }

    /**
     * User input indicator.
     */
    public void enterCommandMessage() {
        System.out.print("Enter command: ");
    }

    /**
     * System message for NULL input.
     */
    public void emptyInputMessage() {
        System.out.println("No input detected. Exiting program...");
    }

    /**
     * Displays a broken line separating each user input command.
     */
    public void setDivider() {
        System.out.println("\n" + "_".repeat(80) + "\n");
    }

    /**
     * ERROR tag for various types of errors.
     */
    public static String errorMessageTag() {
        return "ERROR: ";
    }

    /**
     * Displays an error message when the user inputs an invalid index.
     */
    public String invalidIndexMessage() {
        return "Invalid expense index.";
    }

    /**
     * Displays the exit message when the user exits the program.
     */
    public void displayExitMessage() {
        System.out.println("Thank you for using the Expense Manager. Goodbye!");
    }

    /**
     * Displays an error message when the user inputs an invalid command.
     */
    public void displayInvalidCommandMessage() {
        System.out.println("Invalid command.");
    }

    /**
     * Displays message upon data file creation.
     */
    public static void createNewFileMessage() {
        System.out.println("Created a new file!");
    }

    /**
     * Displays message for a group with no members.
     */
    public String displayEmptyGroupMessage() {
        return "No members in this group.";
    }

    /**
     * Displays message for missing groups.txt file.
     */
    public void displayMissingFileExceptionMessage() {
        System.out.println("Owed amounts file not found. No amounts to display.");
    }

    /**
     * Displays message for invalid amounts.
     */
    public void displayInvalidAmountExceptionMessage() {
        System.out.println("Error parsing owed amounts. Some amounts may not be displayed.");
    }

    /**
     * Displays message for missing group.
     */
    public void displayMissingGroupMessage() {
        System.out.println("Group not found.");
    }

    /**
     * Displays the list of available commands.
     */
    public void displayCommandList() {
        System.out.println("AVAILABLE COMMANDS:");
        System.out.println("------------------");

        System.out.println("help");
        System.out.println("  Description: Displays this help message");
        System.out.println("  Usage: help");
        System.out.println();

        System.out.println("add");
        System.out.println("  Description: Add a new expense");
        System.out.println("  Usage: add");
        System.out.println("  You will be prompted to enter:");
        System.out.println("    - Title: Short name for the expense");
        System.out.println("    - Description: Detailed information about the expense");
        System.out.println("    - Amount: The monetary value (must be a positive number)");
        System.out.println();

        System.out.println("mark");
        System.out.println("  Description: mark an expense as settled");
        System.out.println("  Usage: mark");
        System.out.println("  You will be prompted to enter: expense number");
        System.out.println();

        System.out.println("unmark");
        System.out.println("  Description: unmark an expense to become an unsettled expense");
        System.out.println("  Usage: unmark");
        System.out.println("  You will be prompted to enter: expense number");
        System.out.println();

        System.out.println("list");
        System.out.println("  Description: List all expenses");
        System.out.println("  Usage: list");
        System.out.println();

        System.out.println("list-settled");
        System.out.println("  Description: List all settled expenses");
        System.out.println("  Usage: list-settled");
        System.out.println();

        System.out.println("list-unsettled");
        System.out.println("  Description: List all unsettled expenses");
        System.out.println("  Usage: list-unsettled");
        System.out.println();

        System.out.println("delete");
        System.out.println("  Description: Delete an existing expense");
        System.out.println("  Usage: delete");
        System.out.println("  You will be shown the list of expenses and prompted to enter");
        System.out.println("  the index of the expense to delete");
        System.out.println();

        System.out.println("edit");
        System.out.println("  Description: Edit an existing expense");
        System.out.println("  Usage: edit");
        System.out.println("  You will be shown the list of expenses and prompted to enter:");
        System.out.println("    - Index of the expense to edit");
        System.out.println("    - New title (press Enter to keep current)");
        System.out.println("    - New description (press Enter to keep current)");
        System.out.println("    - New amount (press Enter to keep current)");
        System.out.println();

        System.out.println("balance");
        System.out.println("  Description: Show the balance overview (total expenses and amount owed)");
        System.out.println("  Usage: balance");
        System.out.println();

        System.out.println("create-group");
        System.out.println("  Description: Create a new group and add members to it");
        System.out.println("  Usage: create-group");
        System.out.println("  You will be prompted to:");
        System.out.println("    - Enter group name");
        System.out.println("    - Enter members to add one by one");
        System.out.println("    - Enter done to create and save the group");
        System.out.println();

        System.out.println("view-group");
        System.out.println("  Description: view the members of a specific group");
        System.out.println("  Usage: view-group");
        System.out.println("  You will be prompted to enter:");
        System.out.println("    - Enter group name");
        System.out.println();

        System.out.println("add-member");
        System.out.println("  Description: add a member to an existing group/ create a new group and add");
        System.out.println("  Usage: add-member");
        System.out.println("  You will be prompted to enter:");
        System.out.println("    - Enter name of new member");
        System.out.println("    - Enter name group to add to");
        System.out.println("        If the group exists, adds to group. " +
                "Else prompts the user to create a new group first");
        System.out.println();

        System.out.println("remove-group");
        System.out.println("  Description: remove a member from a group");
        System.out.println("  Usage: remove-group");
        System.out.println("  You will be prompted to enter:");
        System.out.println("    - Enter name of member to remove");
        System.out.println("    - Enter group to remove member from");
        System.out.println();

        System.out.println("my-groups");
        System.out.println("  Description: view the members of a specific group");
        System.out.println("  Usage: view-group");
        System.out.println("  Shows all the members and groups");
        System.out.println();

        System.out.println("split");
        System.out.println("  Description: Split an expense between the members of an existing group");
        System.out.println("  Usage: split");
        System.out.println("  You will be prompted to enter:");
        System.out.println("    - Expense");
        System.out.println("    - Group to split it among");
        System.out.println();

        System.out.println("summary");
        System.out.println("  Description: View expense summaries in different formats");
        System.out.println("  Usage: summary");
        System.out.println("  You will be prompted to choose:");
        System.out.println("    - Monthly Summary: Shows total expenses and count per month");
        System.out.println("    - Category-wise Summary: Shows total expenses and count per category");
        System.out.println();

        System.out.println("export");
        System.out.println("  Description: Export expense summaries to text files");
        System.out.println("  Usage: export");
        System.out.println("  You will be prompted to choose:");
        System.out.println("    - Monthly Summary: Exports to monthly_summary.txt");
        System.out.println("    - Category-wise Summary: Exports to category_summary.txt");

        System.out.println("change-currency");
        System.out.println("  Description: Change all you expenses to a different currency");
        System.out.println("  Usage: change currency");
        System.out.println("  You will be prompted to enter:");
        System.out.println("    -Please enter a number");
        System.out.println("  Enter 1 to enter your own exchange rate");
        System.out.println("  Enter 2 to use an estimated exchange rate");
        System.out.println("    -Please enter a currency to change to");
        System.out.println("  Enter currency based on ISO 4217 standard (eg: SGD, USD, JPY)");
        System.out.println("    -Please input your exchange rate from USD to a new currency (if you picked 1)");
        System.out.println("  Enter the exchange rate you'd like to use");

        System.out.println();

        System.out.println("exit");
        System.out.println("  Description: Exit the program");
        System.out.println("  Usage: exit");
    }
}
//@@author
