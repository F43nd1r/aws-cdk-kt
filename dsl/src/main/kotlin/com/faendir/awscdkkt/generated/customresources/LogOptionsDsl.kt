package com.faendir.awscdkkt.generated.customresources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.customresources.LogOptions

@Generated
public fun buildLogOptions(initializer: @AwsCdkDsl LogOptions.Builder.() -> Unit = {}): LogOptions =
    LogOptions.Builder().apply(initializer).build()
