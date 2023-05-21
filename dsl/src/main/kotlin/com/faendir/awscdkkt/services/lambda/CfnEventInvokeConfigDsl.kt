package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventInvokeConfig(
  id: String,
  props: CfnEventInvokeConfigProps,
  initializer: CfnEventInvokeConfig.() -> Unit = {},
): CfnEventInvokeConfig = CfnEventInvokeConfig(this, id, props).apply(initializer)
