@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
