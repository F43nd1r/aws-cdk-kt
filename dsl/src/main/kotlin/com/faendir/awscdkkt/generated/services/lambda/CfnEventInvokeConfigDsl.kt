package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnEventInvokeConfig.() -> Unit = {},
): CfnEventInvokeConfig = CfnEventInvokeConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventInvokeConfig(id: String, initializer: @AwsCdkDsl CfnEventInvokeConfig.Builder.() -> Unit = {}): CfnEventInvokeConfig = CfnEventInvokeConfig.Builder.create(this, id).apply(initializer).build()
