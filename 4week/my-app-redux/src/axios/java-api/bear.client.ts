import { javaClient } from ".";

const bearContext = '/bears';

export const bearClient = {
  findAll() {
    return javaClient.get(bearContext);
  },
  findById(id: number) {
    return javaClient.get(bearContext + `/${id}`);
  }
}