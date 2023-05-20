@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnContactFlow
import software.amazon.awscdk.services.connect.CfnContactFlowProps
import software.constructs.Construct

public fun Construct.cfnContactFlow(
  id: String,
  props: CfnContactFlowProps,
  initializer: CfnContactFlow.() -> Unit = {},
): CfnContactFlow = CfnContactFlow(this, id, props).apply(initializer)
