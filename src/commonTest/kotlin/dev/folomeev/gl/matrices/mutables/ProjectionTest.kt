package dev.folomeev.gl.matrices.mutables

import dev.folomeev.gl.matrices.identityMat4
import dev.folomeev.gl.matrices.mat4
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals

class ProjectionTest {
    private fun randomMutableMat4(): MutableMat4 =
        Random(1234).let { mutableMat4 { _, _ -> it.nextFloat() } }

    @Test
    fun orthogonal_defaultParams() =
        assertEquals(
            identityMat4(),
            orthogonal()
        )

    @Test
    fun orthogonal_nonDefaultParams() =
        assertEquals(
            mat4(
                2f, 0f, 0f, 0f,
                0f, 2f, 0f, 0f,
                0f, 0f, -2f, 0f,
                -3f, -7f, -11f, 1f
            ),
            orthogonal(1f, 2f, 3f, 4f, 5f, 6f)
        )

    @Test
    fun orthogonalTo_defaultParams() {
        randomMutableMat4().also { mutableMat4 ->
            assertEquals(
                identityMat4(),
                orthogonalTo(out = mutableMat4)
            )
        }
    }

    @Test
    fun orthogonalTo_nonDefaultParams() {
        randomMutableMat4().also { mutableMat4 ->
            assertEquals(
                mat4(
                    2f, 0f, 0f, 0f,
                    0f, 2f, 0f, 0f,
                    0f, 0f, -2f, 0f,
                    -3f, -7f, -11f, 1f
                ),
                orthogonalTo(1f, 2f, 3f, 4f, 5f, 6f, mutableMat4)
            )
        }
    }

    @Test
    fun orthogonalSelf_defaultParams() {
        randomMutableMat4().also { mutableMat4 ->
            assertEquals(
                identityMat4(),
                mutableMat4.orthogonalSelf()
            )
        }
    }

    @Test
    fun orthogonalSelf_nonDefaultParams() {
        randomMutableMat4().also { mutableMat4 ->
            assertEquals(
                mat4(
                    2f, 0f, 0f, 0f,
                    0f, 2f, 0f, 0f,
                    0f, 0f, -2f, 0f,
                    -3f, -7f, -11f, 1f
                ),
                mutableMat4.orthogonalSelf(1f, 2f, 3f, 4f, 5f, 6f)
            )
        }
    }


    @Test
    fun perspective_nonDefaultParams() =
        assertEquals(
            mat4(
                0.9152438f, 0f, 0f, 0f,
                0f, 1.830487f, 0f, 0f,
                0f, 0f, -7f, -1f,
                0f, 0f, -24f, 0f
            ),
            perspective(1f, 2f, 3f, 4f)
        )

    @Test
    fun perspectiveTo_nonDefaultParams() {
        randomMutableMat4().also { mutableMat4 ->
            assertEquals(
                mat4(
                    0.9152438f, 0f, 0f, 0f,
                    0f, 1.830487f, 0f, 0f,
                    0f, 0f, -7f, -1f,
                    0f, 0f, -24f, 0f
                ),
                perspectiveTo(1f, 2f, 3f, 4f, mutableMat4)
            )
        }
    }

    @Test
    fun perspectiveSelf_nonDefaultParams() {
        randomMutableMat4().also { mutableMat4 ->
            assertEquals(
                mat4(
                    0.9152438f, 0f, 0f, 0f,
                    0f, 1.830487f, 0f, 0f,
                    0f, 0f, -7f, -1f,
                    0f, 0f, -24f, 0f
                ),
                mutableMat4.perspectiveSelf(1f, 2f, 3f, 4f)
            )
        }
    }

    @Test
    fun frustum_defaultParams() =
        assertEquals(
            mat4(
                1f, 0f, 0f, 0f,
                0f, 1f, 0f, 0f,
                0f, 0f, 0f, -1f,
                0f, 0f, -1f, 0f
            ),
            frustum()
        )

    @Test
    fun frustumTo_defaultParams() {
        randomMutableMat4().also { mutableMat4 ->
            assertEquals(
                mat4(
                    1f, 0f, 0f, 0f,
                    0f, 1f, 0f, 0f,
                    0f, 0f, 0f, -1f,
                    0f, 0f, -1f, 0f
                ),
                frustumTo(out = mutableMat4)
            )
        }
    }

    @Test
    fun frustumSelf_defaultParams() {
        randomMutableMat4().also { mutableMat4 ->
            assertEquals(
                mat4(
                    1f, 0f, 0f, 0f,
                    0f, 1f, 0f, 0f,
                    0f, 0f, 0f, -1f,
                    0f, 0f, -1f, 0f
                ),
                mutableMat4.frustumSelf()
            )
        }
    }

    @Test
    fun frustum_nonDefaultParams() =
        assertEquals(
            mat4(
                10f, 0f, 0f, 0f,
                0f, 10f, 0f, 0f,
                3f, 7f, -11f, -1f,
                0f, 0f, -60f, 0f
            ),
            frustum(1f, 2f, 3f, 4f, 5f, 6f)
        )

    @Test
    fun frustumTo_nonDefaultParams() {
        randomMutableMat4().also { mutableMat4 ->
            assertEquals(
                mat4(
                    10f, 0f, 0f, 0f,
                    0f, 10f, 0f, 0f,
                    3f, 7f, -11f, -1f,
                    0f, 0f, -60f, 0f
                ),
                frustumTo(1f, 2f, 3f, 4f, 5f, 6f, mutableMat4)
            )
        }
    }

    @Test
    fun frustumSelf_nonDefaultParams() {
        randomMutableMat4().also { mutableMat4 ->
            assertEquals(
                mat4(
                    10f, 0f, 0f, 0f,
                    0f, 10f, 0f, 0f,
                    3f, 7f, -11f, -1f,
                    0f, 0f, -60f, 0f
                ),
                mutableMat4.frustumSelf(1f, 2f, 3f, 4f, 5f, 6f)
            )
        }
    }
}