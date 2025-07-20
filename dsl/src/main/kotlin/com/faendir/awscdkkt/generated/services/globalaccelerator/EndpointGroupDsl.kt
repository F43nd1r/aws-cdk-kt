package com.faendir.awscdkkt.generated.services.globalaccelerator

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl EndpointGroup.() -> Unit = {},
): EndpointGroup = EndpointGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEndpointGroup(id: String, initializer: @AwsCdkDsl EndpointGroup.Builder.() -> Unit = {}): EndpointGroup = EndpointGroup.Builder.create(this, id).apply(initializer).build()
