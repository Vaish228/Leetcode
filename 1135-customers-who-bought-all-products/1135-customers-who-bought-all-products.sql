# Write your MySQL query statement below
select a.customer_id from customer a , product b
group by customer_id
HAVING COUNT(DISTINCT a.product_key) = (
    SELECT COUNT(*) FROM product
);