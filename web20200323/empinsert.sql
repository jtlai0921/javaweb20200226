INSERT INTO classicmodels.employees(employeeNumber,lastName,firstName,extension,email,officeCode,
reportsTo,jobTitle)
VALUES
(1800,'Lee','Amy','0x12345','amy@demo.com',1,1143,'Sales Rep');

UPDATE classicmodels.employees
SET
extension = '0x5678',
officeCode = 7,
reportsTo = 1102,
jobTitle = 'admin'
WHERE employeeNumber =1800;


DELETE FROM `classicmodels`.`employees`
WHERE employeeNumber=1800;

INSERT INTO `classicmodels`.`customers`
(`customerNumber`,
`customerName`,
`contactLastName`,
`contactFirstName`,
`phone`,
`addressLine1`,
`city`,
`country`
)
VALUES
(500,'PCHOME Taiwan','Chen','Andy','0922123123','xxx address','Taipe','Taiwan');
