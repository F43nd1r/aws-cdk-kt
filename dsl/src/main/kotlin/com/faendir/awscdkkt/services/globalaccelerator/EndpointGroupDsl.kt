@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.EndpointGroup
import software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps
import software.constructs.Construct

public fun Construct.endpointGroup(
  id: String,
  props: EndpointGroupProps,
  initializer: EndpointGroup.() -> Unit = {},
): EndpointGroup = EndpointGroup(this, id, props).apply(initializer)
