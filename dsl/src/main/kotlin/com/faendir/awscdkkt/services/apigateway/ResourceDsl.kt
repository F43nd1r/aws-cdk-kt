@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Resource
import software.amazon.awscdk.services.apigateway.ResourceProps
import software.constructs.Construct

public fun Construct.resource(
  id: String,
  props: ResourceProps,
  initializer: Resource.() -> Unit = {},
): Resource = Resource(this, id, props).apply(initializer)
