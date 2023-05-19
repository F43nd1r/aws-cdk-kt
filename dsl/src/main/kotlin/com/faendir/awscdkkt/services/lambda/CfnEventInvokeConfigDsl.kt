@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps
import software.constructs.Construct

public fun Construct.cfnEventInvokeConfig(
  id: String,
  props: CfnEventInvokeConfigProps,
  initializer: CfnEventInvokeConfig.() -> Unit = {},
): CfnEventInvokeConfig = CfnEventInvokeConfig(this, id, props).apply(initializer)
