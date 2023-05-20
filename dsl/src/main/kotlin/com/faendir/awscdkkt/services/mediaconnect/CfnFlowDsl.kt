@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.mediaconnect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnFlow
import software.amazon.awscdk.services.mediaconnect.CfnFlowProps
import software.constructs.Construct

public fun Construct.cfnFlow(
  id: String,
  props: CfnFlowProps,
  initializer: CfnFlow.() -> Unit = {},
): CfnFlow = CfnFlow(this, id, props).apply(initializer)
