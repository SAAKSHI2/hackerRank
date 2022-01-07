select max(salary*months) as earnings,count(salary*months)
from employee
where (salary*months)=(select max(salary*months) from employee)