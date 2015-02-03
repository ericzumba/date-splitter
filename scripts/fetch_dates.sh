DB_HOST=$1
DB_USER=$2
DUMP_DIR=$3
mkdir -p $DUMP_DIR
psql -h $DB_HOST -d vivareal -U $DB_USER -W -t -A -F", " -c "select id, date_trunc('milliseconds', fch_actualizacion) from inmueble where estado='ACTIVO' and cuenta is not null and pcli = 'BR' order by date_trunc('milliseconds', fch_actualizacion) asc, id asc" > $DUMP_DIR/dump.csv
