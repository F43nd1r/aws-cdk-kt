package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.EndpointGroup
import software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps
import software.constructs.Construct

@Generated
public fun Construct.endpointGroup(
  id: String,
  props: EndpointGroupProps,
  initializer: EndpointGroup.() -> Unit = {},
): EndpointGroup = EndpointGroup(this, id, props).apply(initializer)
