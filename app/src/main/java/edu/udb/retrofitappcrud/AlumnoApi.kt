package edu.udb.retrofitappcrud

import retrofit2.Call
import retrofit2.http.*

interface AlumnoApi {

    @GET("index.php")
    fun obtenerAlumnos(): Call<List<Alumno>>

    @GET("index.php/{id}")
    fun obtenerAlumnoPorId(@Path("id") id: Int): Call<Alumno>

    @POST("index.php")
    fun crearAlumno(@Body alumno: Alumno): Call<Alumno>

    @PUT("index/{id}")
    fun actualizarAlumno(@Path("id") id: Int, @Body alumno: Alumno): Call<Alumno>

    @PUT("index/{id}")
    fun eliminarAlumno(@Path("id") id: Int, @Body alumno: Alumno): Call<Void>
}