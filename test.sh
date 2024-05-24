#!/usr/bin/env bash

curl -X POST --location "http://127.0.0.1:8080/example" \
    -H "Content-Type: application/json" \
    -d "{
          \"id\": \"300\",
          \"comment\": \"test\"
        }"

curl -X GET --location "http://127.0.0.1:8080/example/all" \
    -H "Accept: application/json"

curl -X GET --location "http://127.0.0.1:8080/example/300" \
    -H "Accept: application/json"

curl -X DELETE --location "http://127.0.0.1:8080/example/300"

curl -X POST --location "http://127.0.0.1:8080/example" \
    -H "Content-Type: application/json" \
    -d "{
          \"id\": \"100\",
          \"comment\": \"test\"
        }"

curl -X PUT --location "http://127.0.0.1:8080/example" \
    -H "Content-Type: application/json" \
    -d "{
          \"id\": \"100\",
          \"comment\": \"updated\"
        }"