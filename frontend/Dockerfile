FROM node:20-alpine

WORKDIR /app

COPY package*.json ./

RUN apk add --no-cache xdg-utils && npm install

COPY . .

EXPOSE 5173

CMD [ "npm", "run", "dev" ]
