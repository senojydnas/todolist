export class Todo {

  constructor(
    id: number,
    text: string,
    dueDate: Date,
    isComplete: boolean
  ) {
    this.id = id;
    this.text = text;
    this.dueDate = dueDate;
    this.isComplete = isComplete;
  }

  id: number;
  text: string;
  dueDate: Date;
  isComplete: boolean;
}
