package com.faendir.awscdkkt.generated.services.iotwireless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroup
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMulticastGroup(
  id: String,
  props: CfnMulticastGroupProps,
  initializer: @AwsCdkDsl CfnMulticastGroup.() -> Unit = {},
): CfnMulticastGroup = CfnMulticastGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMulticastGroup(id: String, initializer: @AwsCdkDsl CfnMulticastGroup.Builder.() -> Unit = {}): CfnMulticastGroup = CfnMulticastGroup.Builder.create(this, id).apply(initializer).build()
