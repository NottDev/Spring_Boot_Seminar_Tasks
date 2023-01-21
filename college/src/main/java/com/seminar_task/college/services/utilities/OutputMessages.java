package com.seminar_task.college.services.utilities;

public class OutputMessages {

    /**
     * Method that returns a custom message indicating a
     * conflict with an existing attribute 'id'.
     * @return "FATAL ERROR. Element found with same id."
     */
    public String IdCheckError(){ return "FATAL ERROR. Element found with same id.";}

    /**
     * Method that returns a custom message indicating a
     * conflict finding an element.
     * @return "FATAL ERROR. Element not found."
     */
    public String NotFoundError(){ return "FATAL ERROR. Element not found.";}

    /**
     * Method that returns a custom message indicating a successful saving process.
     * @return "COMPLETED. Element have been saved successfully."
     */
    public String SaveSuccess(){ return "COMPLETED. Element have been saved successfully.";}

    /**
     * Method that returns a custom message indicating a successful updating process.
     * @return "COMPLETED. Element have been updated successfully."
     */
    public String UpdateSuccess(){ return "COMPLETED. Element have been updated successfully.";}

    /**
     * Method that returns a custom message indicating a successful deletion process.
     * @return "COMPLETED. Element have been deleted successfully."
     */
    public String DeleteSuccess(){ return "COMPLETED. Element have been deleted successfully.";}
}
