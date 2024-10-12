import { SortingAlgorithm } from "../src/SortingAlgorithm";

export function sortingAlgorithmTests(sortingAlgorithm: SortingAlgorithm): void {

    describe("Sorting Algorithm Tests", () => {

        it("should sort an empty array", () => {
            const unsortedArray: number[] = [];
            const expectedArray: number[] = [];

            expect(sortingAlgorithm.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an array with one element", () => {
            const unsortedArray: number[] = [ 1 ];
            const expectedArray: number[] = [ 1 ];

            expect(sortingAlgorithm.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an array with two elements", () => {
            const unsortedArray: number[] = [ 2, 1 ];
            const expectedArray: number[] = [ 1, 2 ];

            expect(sortingAlgorithm.sort(unsortedArray)).toEqual(expectedArray);
        });

        it("should sort an array with repeated elements", () => {
            const unsortedArray: number[] = [ 2, 1, 2, 1 ];
            const expectedArray: number[] = [ 1, 1, 2, 2 ];

            expect(sortingAlgorithm.sort(unsortedArray)).toEqual(expectedArray);
        });

    })

}