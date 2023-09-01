package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnApiDestination
import software.amazon.awscdk.services.events.CfnApiDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApiDestination(
  id: String,
  props: CfnApiDestinationProps,
  initializer: @AwsCdkDsl CfnApiDestination.() -> Unit = {},
): CfnApiDestination = CfnApiDestination(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApiDestination(id: String, initializer: @AwsCdkDsl
    CfnApiDestination.Builder.() -> Unit = {}): CfnApiDestination =
    CfnApiDestination.Builder.create(this, id).apply(initializer).build()
