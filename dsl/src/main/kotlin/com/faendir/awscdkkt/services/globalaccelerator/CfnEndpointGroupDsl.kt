@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps
import software.constructs.Construct

public fun Construct.cfnEndpointGroup(
  id: String,
  props: CfnEndpointGroupProps,
  initializer: CfnEndpointGroup.() -> Unit = {},
): CfnEndpointGroup = CfnEndpointGroup(this, id, props).apply(initializer)
