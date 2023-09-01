package com.faendir.awscdkkt.generated.services.iotwireless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnDestination
import software.amazon.awscdk.services.iotwireless.CfnDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDestination(
  id: String,
  props: CfnDestinationProps,
  initializer: @AwsCdkDsl CfnDestination.() -> Unit = {},
): CfnDestination = CfnDestination(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDestination(id: String, initializer: @AwsCdkDsl
    CfnDestination.Builder.() -> Unit = {}): CfnDestination = CfnDestination.Builder.create(this,
    id).apply(initializer).build()
