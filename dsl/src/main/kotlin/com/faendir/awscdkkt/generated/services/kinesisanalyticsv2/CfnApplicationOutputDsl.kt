package com.faendir.awscdkkt.generated.services.kinesisanalyticsv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationOutput(
  id: String,
  props: CfnApplicationOutputProps,
  initializer: @AwsCdkDsl CfnApplicationOutput.() -> Unit = {},
): CfnApplicationOutput = CfnApplicationOutput(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationOutput(id: String, initializer: @AwsCdkDsl
    CfnApplicationOutput.Builder.() -> Unit = {}): CfnApplicationOutput =
    CfnApplicationOutput.Builder.create(this, id).apply(initializer).build()
