# Applicant Physical Fitness Tracker

Thank you for your help with that multiple choice test. Unfortunately, too many people passed. So now, we need a simple gauge of their physical fitness. 

## Task Overview

We're going to get a dump of all the steps that an applicant has taken over the past year. This data will be provided in the form of a text file, with each line representing a new day. That means the file will have 365 lines, each holding just one integer. We've included a sample file for you called `steps.txt`. This file contains data from one of the interns, so the steps are quite low, but it’s good enough for testing.

Your task is to build software that will eventually be used with all applicant information.

## Requirements

1. **File Input and Reading**: 
   - Create a method named `fileOpener` that accepts a filename to open and reads the data.
   - Each line in the file represents a day and contains an integer (number of steps taken).
   
2. **Calculate Steps**:
   - Create another method named `calculateSteps` that contains a loop to step through each day of the year.
   - Calculate the average number of steps taken for each month (January through December).

3. **Return and Display Results**:
   - The `calculateSteps` method should return a formatted string, with each month's average displayed on a new line.
   - The output should look like this for the included sample file:

Average steps for January: 5246.10 Average steps for February: 4851.86 Average steps for March: 5777.61 Average steps for April: 5802.13 Average steps for May: 4711.55 Average steps for June: 4792.33 Average steps for July: 5638.23 Average steps for August: 5759.65 Average steps for September: 6114.57 Average steps for October: 5411.03 Average steps for November: 4268.80 Average steps for December: 5138.06


4. **Hint**:
- January has 31 days (so lines 1 through 31 are part of January).
- February has 28 days (lines 32 through 60).
- Follow this pattern for the rest of the months until you reach line 365.

## Testing

We will test your code with other step files containing data from the applicants. Please ensure that your program works correctly with the sample file (`steps.txt`) and can handle a full year of step data (365 days).
