@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.groundstation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps
import software.constructs.Construct

public fun Construct.cfnDataflowEndpointGroup(
  id: String,
  props: CfnDataflowEndpointGroupProps,
  initializer: CfnDataflowEndpointGroup.() -> Unit = {},
): CfnDataflowEndpointGroup = CfnDataflowEndpointGroup(this, id, props).apply(initializer)
