@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
