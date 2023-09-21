import React from 'react';
import './Navbar.css';

function Navbar() {
  return (
    <div className="navbar">
      <h1>Hospital Management System</h1>
      <a href='/login'>Logout</a>
    </div>
  );
}

export default Navbar;
