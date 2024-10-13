import { SortingAlgorithm } from "../src/SortingAlgorithm";
import { SelectionSortingAlgorithm } from "../src/implementations/SelectionSortingAlgorithm";

const sortingAlgorithms: { name: string, instance: SortingAlgorithm }[] = [

    { name: "Selection Sorting Algorithm", instance: new SelectionSortingAlgorithm() }

];

sortingAlgorithms.forEach(({ name, instance }) => {

    describe(`[${name}] Tests`, () => {

        it(`should sort an empty array`, () => {
            const unsortedArray: number[] = [];
            const expectedArray: number[] = [];

            expect(instance.sort(unsortedArray)).toEqual(expectedArray);
        });

        it(`should sort a single element array`, () => {
            const unsortedArray: number[] = [ 1 ];
            const expectedArray: number[] = [ 1 ];

            expect(instance.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an array with repeated elements", () => {
            const unsortedArray: number[] = [ 2, 1, 2, 1 ];
            const expectedArray: number[] = [ 1, 1, 2, 2 ];

            expect(instance.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an array with negative elements", () => {
            const unsortedArray: number[] = [ -5, -3, -2, -8, -7, -4, -1, -9, -6 ];
            const expectedArray: number[] = [ -9, -8, -7, -6, -5, -4, -3, -2, -1 ];

            expect(instance.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an array with positive and negative elements", () => {
            const unsortedArray: number[] = [ -5, 3, -2, 8, -7, 4, -1, 9, -6 ];
            const expectedArray: number[] = [ -7, -6, -5, -2, -1, 3, 4, 8, 9 ];

            expect(instance.sort(unsortedArray)).toEqual(expectedArray);
        });

    });

});
