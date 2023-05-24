package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.EventInvokeConfig
import software.amazon.awscdk.services.lambda.EventInvokeConfigProps
import software.constructs.Construct

@Generated
public fun Construct.eventInvokeConfig(id: String, props: EventInvokeConfigProps): EventInvokeConfig
    = EventInvokeConfig(this, id, props)

@Generated
public fun Construct.eventInvokeConfig(
  id: String,
  props: EventInvokeConfigProps,
  initializer: @AwsCdkDsl EventInvokeConfig.() -> Unit,
): EventInvokeConfig = EventInvokeConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEventInvokeConfig(id: String, initializer: @AwsCdkDsl
    EventInvokeConfig.Builder.() -> Unit): EventInvokeConfig =
    EventInvokeConfig.Builder.create(this, id).apply(initializer).build()
