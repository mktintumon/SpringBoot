import Contact from "./components/Contact"

function App() {
  return (
    <div className="container-fluid">
        <nav>
          <div className="nav-wrapper center">
            <a href="/" className="brand-logo center">Contact Lists</a>
          </div>
        </nav>
      
        <div className="row">
            <Contact/>
        </div>
    </div>
  );
}

export default App;
