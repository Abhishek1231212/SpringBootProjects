import axios from "axios";
const HR_API_BASE_URL = "http://localhost:8080/api/v1/hrs";

class HumanResourceService{
    getHrs(){
        return axios.get(HR_API_BASE_URL);
    }
}

export default new HumanResourceService();