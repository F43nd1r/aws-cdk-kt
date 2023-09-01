package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnOutput.() -> Unit = {},
): CfnOutput = CfnOutput(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOutput(id: String, initializer: @AwsCdkDsl CfnOutput.Builder.() -> Unit
    = {}): CfnOutput = CfnOutput.Builder.create(this, id).apply(initializer).build()
