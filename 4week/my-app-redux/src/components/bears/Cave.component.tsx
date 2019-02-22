import React from 'react';
import { bearClient } from '../../axios/java-api/bear.client';
import Button from 'reactstrap/lib/Button';
import Popover from 'reactstrap/lib/Popover';
import { PopoverHeader, PopoverBody } from 'reactstrap';

interface CaveComponentState {
  showPopOver: boolean
}

interface CaveComponentProps {
  cave: any,
  bearId: number
}

export class CaveComponent extends React.Component<CaveComponentProps, CaveComponentState> {
  constructor(props) {
    super(props);
    this.state = {
      showPopOver: false
    }
  }

  togglePopOver = () => {
    this.setState({
      showPopOver: !this.state.showPopOver
    })
  }
  render() {
    const cave = this.props.cave
    return (
      <td >
        <p id={'cave-for-' + this.props.bearId} onMouseOver={this.togglePopOver} onMouseOut={this.togglePopOver}>
          {cave && cave.id}
        </p>
        {
          cave && <Popover placement="left" isOpen={this.state.showPopOver} target={'cave-for-' + this.props.bearId}>
            <PopoverHeader>Cave Type: {cave.caveType}</PopoverHeader>
            <PopoverBody>
              <p>
                Square Footage: {cave.squareFootage}
              </p>
            </PopoverBody>
          </Popover>
        }
      </td>
    )
  }

}