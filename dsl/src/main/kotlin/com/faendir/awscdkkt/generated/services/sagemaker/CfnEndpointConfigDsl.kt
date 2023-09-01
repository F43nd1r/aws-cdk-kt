package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEndpointConfig(
  id: String,
  props: CfnEndpointConfigProps,
  initializer: @AwsCdkDsl CfnEndpointConfig.() -> Unit = {},
): CfnEndpointConfig = CfnEndpointConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEndpointConfig(id: String, initializer: @AwsCdkDsl
    CfnEndpointConfig.Builder.() -> Unit = {}): CfnEndpointConfig =
    CfnEndpointConfig.Builder.create(this, id).apply(initializer).build()
