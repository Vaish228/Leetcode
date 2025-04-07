# Write your MySQL query statement below
#select visits.customer_id , count(*) as count_no_trans from visits left join transactions on visits.visit_id = transactions.visit_id where

select v.customer_id , count(*) as count_no_trans
from visits v left join transactions t on v.visit_id = t.visit_id 
where t.transaction_id is null 
group by v.customer_id;