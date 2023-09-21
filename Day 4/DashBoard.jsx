import React from 'react';
import Sidebar from './SideBar';
import Navbar from './NavBar';
import './Dashboard.css';

function Dashboard() {
  return (
    <>
    <Navbar />
    <Sidebar />
    <div className="dashboard">
      <div className="content">
      <h1>DashBoard</h1>
      <div className="grid-container">
      <div className="grid-list">
            <h2>Patients</h2>
            <div className="count">200</div>
        </div>
      <div className="grid-list">
            <h2>Killed</h2>
            <div className="count">195</div>
        </div>
      <div className="grid-list">
            <h2>Revenue</h2>
            <div className="count">90,50,000</div>
        </div>
        </div>
      </div>
    </div>
    </>
    );
}

export default Dashboard;
