import React from "react";

const SingleContact = ({item})=>(
    <div className="row center">
      <div className="col s10 m4">
        <div className="card green">
          <div className="card-content white-text">
            <span className="card-title"> Name : {item.firstName} {item.lastName}</span>
          </div>
          <div className="card-action">
            Email ID : <i>{item.email}</i>  
          </div>
        </div>
      </div>
  </div>
);

export default SingleContact;