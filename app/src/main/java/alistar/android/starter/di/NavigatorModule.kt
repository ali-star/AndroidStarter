package alistar.android.starter.di

import alistar.android.starter.core.navigation.Navigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class NavigatorModule {

    @Provides
    fun navigator(): Navigator = Navigator()

}