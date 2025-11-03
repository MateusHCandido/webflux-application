create table events(
    event_id bigserial not null,
    event_type varchar(30) not null,
    event_name varchar(100) not null,
    event_date date,
    event_description varchar(200) not null,
    primary key(event_id)
);