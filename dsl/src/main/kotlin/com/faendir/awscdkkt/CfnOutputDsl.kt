@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
