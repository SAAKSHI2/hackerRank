select c.company_code, 
    c.founder, 
    count(distinct e.lead_manager_code), 
    count(distinct e.senior_manager_code), 
    count(distinct e.manager_code), 
    count(distinct e.employee_code)
from company c,senior_manager s,employee e,manager m,lead_manager l
where e.company_code=l.company_code and e.company_code=s.company_code and e.company_code=m.company_code and c.company_code=e.company_code
group by c.company_code,c.founder
order by c.company_code