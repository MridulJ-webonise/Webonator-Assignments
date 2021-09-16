#!/bin/bash
YEAR=`date +%Y`
MONTH=`date +%m`
DAY=`date +%d`
FILENAME=BACKUP-$DAY-$MONTH-$YEAR.sql
pg_dump -d dvdrental -U postgres > ./Backup/$FILENAME
