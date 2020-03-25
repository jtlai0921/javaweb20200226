select*
from employees
where employees.officecode=(select officecode from offices where city='san francisco');