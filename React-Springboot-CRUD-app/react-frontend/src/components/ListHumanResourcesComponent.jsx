import React, { Component } from 'react';
import HumanResourceService from '../services/HumanResourceService';

class ListHumanResourcesComponent extends Component {
    constructor(props){
        super(props)
        this.state = {
            hrs : []
        }
    }
    componentDidMount(){
        HumanResourceService.getHrs().then((res) =>{
            this.setState({hrs: res.data})
        })
    }
    render() {
        return (
            <div>
                <h2>HR's List</h2>
                <div className="row">
                    <table className='table table-striped table-bordered'>
                        <thead>
                            <tr>
                                <th>HR Name</th>
                                <th>HR Contact</th>
                                <th>HR Age</th>
                                <th>HR Id</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.hrs.map(
                                    hr =>
                                    <tr key={hr.id}>
                                        <td>{hr.name}</td>
                                        <td>{hr.contact}</td>
                                        <td>{hr.age}</td>
                                        <td>{hr.id}</td>
                                    </tr>
                            )
                            }   
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default ListHumanResourcesComponent;