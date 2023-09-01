package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.LogOptions

@Generated
public fun buildLogOptions(initializer: @AwsCdkDsl LogOptions.Builder.() -> Unit = {}): LogOptions =
    LogOptions.Builder().apply(initializer).build()
