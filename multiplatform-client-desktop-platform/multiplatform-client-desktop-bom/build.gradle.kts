dependencies {
    api(platform(libs.kotlin.bom))
    api(platform(libs.kotlinx.serialization.bom))
    api(platform(libs.kotlinx.coroutines.bom))

    api(platform(libs.koin.bom))

    api(platform(libs.slf4j.bom))

    constraints {
        api(libs.kotlinx.datetime)

        api(libs.kotlin.logging)
        api(libs.logback.classic)

        api(libs.sqldelight.driver.sqlite)
        api(libs.sqldelight.runtime)
        api(libs.sqldelight.primitive.adapters)
        api(libs.sqldelight.extensions.coroutine)

        api(libs.voyager.navigator)
        api(libs.voyager.screenModel)
        api(libs.voyager.bottomSheetNavigator)
        api(libs.voyager.tabNavigator)
        api(libs.voyager.transitions)
        api(libs.voyager.koin)
    }
}
