SET SERVEROUTPUT ON;

BEGIN

    FOR loan IN (

        SELECT CustomerID,
               LoanID,
               DueDate

        FROM Loans

        WHERE DueDate BETWEEN SYSDATE
                          AND SYSDATE + 30

    )

    LOOP

        DBMS_OUTPUT.PUT_LINE(

            'Reminder: Loan '
            || loan.LoanID
            || ' for Customer '
            || loan.CustomerID
            || ' is due on '
            || loan.DueDate

        );

    END LOOP;

END;
/