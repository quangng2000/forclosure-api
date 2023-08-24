PORT=8080

# Find the PID of the process listening on the specified port
PID=$(lsof -t -i :$PORT)

if [ -n "$PID" ]; then
    echo "Process with PID $PID is listening on port $PORT. Killing the process..."
    kill $PID
    echo "Process killed."
else
    echo "No process found listening on port $PORT."
fi


-c "nohup java -jar target/forclosure-api-0.0.1-SNAPSHOT.jar &"