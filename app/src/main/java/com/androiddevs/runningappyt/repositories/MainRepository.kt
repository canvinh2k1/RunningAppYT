package com.androiddevs.runningappyt.repositories

import com.androiddevs.runningappyt.db.Run
import com.androiddevs.runningappyt.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDAO: RunDAO
) {
    suspend fun insertRun(run: Run) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunsSortedByDate() = runDAO.getAllRunsSortedByDate()
    fun getAllRunsSortedByAvgSpeed() = runDAO.getAllRunsSortedByAvgSpeed()
    fun getAllRunsSortedByDistance() = runDAO.getAllRunsSortedByDistance()
    fun getAllRunsSortedByTimeInMillis() = runDAO.getAllRunsSortedByTimeInMillis()
    fun getAllRunsSortedByCaloriesBurned() = runDAO.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()
    fun getTotalDistance() = runDAO.getTotalDistance()
    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()
    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()
}