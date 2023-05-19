@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
