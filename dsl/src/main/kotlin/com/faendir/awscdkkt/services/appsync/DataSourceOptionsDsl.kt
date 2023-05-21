package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.DataSourceOptions

@Generated
public fun dataSourceOptions(initializer: DataSourceOptions.Builder.() -> Unit = {}):
    DataSourceOptions = DataSourceOptions.builder().apply(initializer).build()
