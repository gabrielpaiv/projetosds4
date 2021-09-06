import NavBar from "components/NavBar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";

function App() {
  return (
    <>
      <NavBar />
      <div>
        <h1 className="text-primary">Olá mundo!</h1>
      </div>
      <Footer />
      <DataTable />
    </>
  );
}

export default App;
