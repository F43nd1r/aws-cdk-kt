package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration
import software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFunctionConfiguration(
  id: String,
  props: CfnFunctionConfigurationProps,
  initializer: @AwsCdkDsl CfnFunctionConfiguration.() -> Unit = {},
): CfnFunctionConfiguration = CfnFunctionConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFunctionConfiguration(id: String, initializer: @AwsCdkDsl
    CfnFunctionConfiguration.Builder.() -> Unit = {}): CfnFunctionConfiguration =
    CfnFunctionConfiguration.Builder.create(this, id).apply(initializer).build()
