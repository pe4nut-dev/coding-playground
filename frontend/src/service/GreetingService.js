import http from "../http-common";

class GreetingService {
    async greet(name) {
        return await http.get(`/hello?name=${name}`);
    }
}

export default new GreetingService();