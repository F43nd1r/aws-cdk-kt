@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.ApiDestination
import software.amazon.awscdk.services.events.ApiDestinationProps
import software.constructs.Construct

public fun Construct.apiDestination(
  id: String,
  props: ApiDestinationProps,
  initializer: ApiDestination.() -> Unit = {},
): ApiDestination = ApiDestination(this, id, props).apply(initializer)
