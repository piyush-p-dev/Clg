#!/bin/bash
echo "Generating backup listing..."
ls -l | awk '{print $9, $5, $1}' > backup
echo "Current directory details saved to 'backup'."