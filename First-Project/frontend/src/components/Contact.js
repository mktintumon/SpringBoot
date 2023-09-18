import React, { Component } from 'react'
import AddContacts from "./AddContacts"
import SingleContact from "./SingleContact"

export default class Contact extends Component {
    constructor(props){
        super(props);
        this.state = {
            contacts : [],
        }
    }

    componentDidMount(){
        fetch('http://localhost:8081/api/contacts')
        .then(res => res.json())
        .then(data => this.setState({contacts:data}))
    }

    render() {
        return (
            <div>
                <div className='row'>
                    <AddContacts/>
                </div>

                <div className='row'>
                    {
                        this.state.contacts.map((items)=>(
                            <SingleContact key={items.id} item={items}/>
                        ))
                    }
                </div>
            </div>
        )
    }
}
