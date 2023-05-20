@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnOutput
import software.amazon.awscdk.CfnOutputProps
import software.constructs.Construct

public fun Construct.cfnOutput(
  id: String,
  props: CfnOutputProps,
  initializer: CfnOutput.() -> Unit = {},
): CfnOutput = CfnOutput(this, id, props).apply(initializer)
