import axios from 'axios';
import { environment } from '../../environment';

export const javaClient = axios.create({
  baseURL: environment.javaContext,
  withCredentials: true
});
