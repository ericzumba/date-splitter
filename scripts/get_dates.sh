# usage ./get_dates host user number_of_intervals
DB_HOST=$1
DB_USER=$2
NUMBER_OF_INTERVALS=$3
mkdir debug
./fetch_dates.sh $DB_HOST $DB_USER | tee debug/last_read.dates | java -jar date-splitter-1.0.jar $NUMBER_OF_INTERVALS
