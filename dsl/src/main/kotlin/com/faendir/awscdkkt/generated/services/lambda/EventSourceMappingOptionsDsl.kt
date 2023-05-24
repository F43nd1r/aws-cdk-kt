package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.EventSourceMappingOptions

@Generated
public fun buildEventSourceMappingOptions(initializer: @AwsCdkDsl
    EventSourceMappingOptions.Builder.() -> Unit): EventSourceMappingOptions =
    EventSourceMappingOptions.Builder().apply(initializer).build()
