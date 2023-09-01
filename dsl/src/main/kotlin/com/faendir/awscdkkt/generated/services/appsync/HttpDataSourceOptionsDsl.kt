package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.HttpDataSourceOptions

@Generated
public fun buildHttpDataSourceOptions(initializer: @AwsCdkDsl
    HttpDataSourceOptions.Builder.() -> Unit = {}): HttpDataSourceOptions =
    HttpDataSourceOptions.Builder().apply(initializer).build()
