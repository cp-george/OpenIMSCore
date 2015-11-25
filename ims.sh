#!/bin/bash
killall ser

cd /opt/OpenIMSCore/FHoSS/deploy/
gnome-terminal --tab -t PCSCF -e "/opt/OpenIMSCore/pcscf.sh" \
--tab -t ICSCF  -e "/opt/OpenIMSCore/icscf.sh" \
--tab -t SCSCF  -e "/opt/OpenIMSCore/scscf.sh" \
--tab -t HSS  -e "./startup.sh" 
