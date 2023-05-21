package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.HttpDataSourceOptions

@Generated
public fun httpDataSourceOptions(initializer: HttpDataSourceOptions.Builder.() -> Unit = {}):
    HttpDataSourceOptions = HttpDataSourceOptions.builder().apply(initializer).build()
