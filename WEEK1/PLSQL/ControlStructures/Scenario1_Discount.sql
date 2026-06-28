SET SERVEROUTPUT ON;

BEGIN
    FOR cust IN (
        SELECT CustomerID, Age
        FROM Customers
    )
    LOOP
        IF cust.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                '1% discount applied for Customer ID: '
                || cust.CustomerID
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/