package com.faendir.awscdkkt.generated.services.globalaccelerator

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEndpointGroup(
  id: String,
  props: CfnEndpointGroupProps,
  initializer: @AwsCdkDsl CfnEndpointGroup.() -> Unit = {},
): CfnEndpointGroup = CfnEndpointGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEndpointGroup(id: String, initializer: @AwsCdkDsl
    CfnEndpointGroup.Builder.() -> Unit = {}): CfnEndpointGroup =
    CfnEndpointGroup.Builder.create(this, id).apply(initializer).build()
