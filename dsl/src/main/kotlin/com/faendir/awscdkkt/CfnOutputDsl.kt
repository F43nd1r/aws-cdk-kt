package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnOutput
import software.amazon.awscdk.CfnOutputProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOutput(
  id: String,
  props: CfnOutputProps,
  initializer: CfnOutput.() -> Unit = {},
): CfnOutput = CfnOutput(this, id, props).apply(initializer)
