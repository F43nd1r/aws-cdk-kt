package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.EventInvokeConfigOptions

@Generated
public fun buildEventInvokeConfigOptions(initializer: @AwsCdkDsl
    EventInvokeConfigOptions.Builder.() -> Unit): EventInvokeConfigOptions =
    EventInvokeConfigOptions.Builder().apply(initializer).build()
