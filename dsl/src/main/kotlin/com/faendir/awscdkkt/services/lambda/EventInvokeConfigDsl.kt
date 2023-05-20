@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.EventInvokeConfig
import software.amazon.awscdk.services.lambda.EventInvokeConfigProps
import software.constructs.Construct

public fun Construct.eventInvokeConfig(
  id: String,
  props: EventInvokeConfigProps,
  initializer: EventInvokeConfig.() -> Unit = {},
): EventInvokeConfig = EventInvokeConfig(this, id, props).apply(initializer)
