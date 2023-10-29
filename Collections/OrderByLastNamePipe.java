export class OrderByLastNamePipe implements PipeTransform {
  transform(contacts: any[]): any[] {
    return contacts.sort((a, b) => a.lastName.localeCompare(b.lastName));
  }