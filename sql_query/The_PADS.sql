select concat(name,concat("(",concat(substr(occupation,1,1),")")))
from occupations
order by name,occupation;
select concat('There are a total of ',count(occupation)," ",lower(occupation),'s.')
from occupations 
group by occupation
order by count(occupation),occupation