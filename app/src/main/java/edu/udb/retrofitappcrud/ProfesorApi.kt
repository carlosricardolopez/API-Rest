package edu.udb.retrofitappcrud

import retrofit2.Call
import retrofit2.http.*

interface ProfesorApi {

    @GET("datos.php")
    fun obtenerAlumnos(): Call<List<Alumno>>

    @GET("datos.php/{id}")
    fun obtenerAlumnoPorId(@Path("id") id: Int): Call<Alumno>

    @POST("datos.php")
    fun crearAlumno(@Body alumno: Alumno): Call<Alumno>

    @PUT("datos/{id}")
    fun actualizarAlumno(@Path("id") id: Int, @Body alumno: Alumno): Call<Alumno>

    @PUT("datos/{id}")
    fun eliminarAlumno(@Path("id") id: Int, @Body alumno: Alumno): Call<Void>
}