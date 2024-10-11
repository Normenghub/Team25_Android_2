package com.example.team25.di

import com.example.team25.data.repository.DefaultLoginRepository
import com.example.team25.data.repository.DefaultManagerRepository
import com.example.team25.domain.repository.LoginRepository
import com.example.team25.domain.repository.ManagerRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class ViewmodelModule {
    @Binds
    @ViewModelScoped
    abstract fun bindLoginRepository(defaultLoginRepository: DefaultLoginRepository): LoginRepository

    @Binds
    @ViewModelScoped
    abstract fun bindManagerRepository(defaultManagerRepository: DefaultManagerRepository): ManagerRepository
}

