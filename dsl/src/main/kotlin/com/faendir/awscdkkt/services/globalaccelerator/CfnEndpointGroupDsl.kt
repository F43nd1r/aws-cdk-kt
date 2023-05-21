package com.faendir.awscdkkt.services.globalaccelerator

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
  initializer: CfnEndpointGroup.() -> Unit = {},
): CfnEndpointGroup = CfnEndpointGroup(this, id, props).apply(initializer)
