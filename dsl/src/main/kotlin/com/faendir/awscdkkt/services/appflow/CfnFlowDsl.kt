@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow
import software.amazon.awscdk.services.appflow.CfnFlowProps
import software.constructs.Construct

public fun Construct.cfnFlow(
  id: String,
  props: CfnFlowProps,
  initializer: CfnFlow.() -> Unit = {},
): CfnFlow = CfnFlow(this, id, props).apply(initializer)
