import { SortingAlgorithm } from "../../shared/src/SortingAlgorithm";

export class SelectionSortingAlgorithm implements SortingAlgorithm {

    public sort(array: number[]): number[] {
        for (let i = 0; i < array.length; i++) {
            this.swap(array, i, this.findMinimumElementIndex(array, i));
        }

        return array;
    }

    private findMinimumElementIndex(array: number[], startIndex: number): number {
        let minimumElementIndex = startIndex;

        for (let i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[minimumElementIndex]) {
                minimumElementIndex = i;
            }
        }

        return minimumElementIndex;
    }

    private swap(array: number[], firstIndex: number, secondIndex: number): void {
        const temporary = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporary;
    }

}