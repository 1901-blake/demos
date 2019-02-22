import React from 'react';
import { bearClient } from '../../axios/java-api/bear.client';
import { CaveComponent } from './Cave.component';

interface BearsComponentState {
  bears: any[]
}

export class BearsComponent extends React.Component<any, BearsComponentState> {
  constructor(props) {
    super(props);
    this.state = {
      bears: []
    }
  }

  componentDidMount = async () => {
    try {
      const resp = await bearClient.findAll();
      this.setState({
        bears: resp.data
      })
    } catch (err) {
      console.log(err);
    } 
  }

  render() {
    return (
      <table className="table">
        <thead className="gradient-background">
          <tr>
            <th scope="col">Color</th>
            <th scope="col">Breed</th>
            <th>Legs</th>
            <th>Cave Id</th>
          </tr>
        </thead>
        <tbody id="restaurant-table-body">
          {
            this.state.bears.map(bear => (
              <tr key={'user-row' + bear.id}>
                <td>{bear.color}</td>
                <td>{bear.breed}</td>
                <td>{bear.legs}</td>
                <CaveComponent cave={bear.cave} bearId={bear.id}/>
              </tr>
            ))
          }
        </tbody>
      </table>
    )
  }

}