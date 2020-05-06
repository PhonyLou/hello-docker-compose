CREATE TABLE IF NOT EXISTS person (
    id SERIAL PRIMARY KEY,
    name varchar(11) NOT NULL
);

CREATE TABLE IF NOT EXISTS directive (
    id SERIAL PRIMARY KEY,
    directive varchar(200) NOT NULL
);
