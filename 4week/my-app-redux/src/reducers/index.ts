import { combineReducers } from "redux";
import { clickerReducer } from "./Clicker.reducer";

export interface IClickerState {
  clicks: number
}

export interface IState {
  clicker: IClickerState
}

export const state = combineReducers<IState>({
  clicker: clickerReducer
})