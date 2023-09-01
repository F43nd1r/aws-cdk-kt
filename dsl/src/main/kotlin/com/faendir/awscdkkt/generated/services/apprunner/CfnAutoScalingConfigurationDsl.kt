package com.faendir.awscdkkt.generated.services.apprunner

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration
import software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAutoScalingConfiguration(id: String, initializer: @AwsCdkDsl
    CfnAutoScalingConfiguration.() -> Unit = {}): CfnAutoScalingConfiguration =
    CfnAutoScalingConfiguration(this, id).apply(initializer)

@Generated
public fun Construct.cfnAutoScalingConfiguration(
  id: String,
  props: CfnAutoScalingConfigurationProps,
  initializer: @AwsCdkDsl CfnAutoScalingConfiguration.() -> Unit = {},
): CfnAutoScalingConfiguration = CfnAutoScalingConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAutoScalingConfiguration(id: String, initializer: @AwsCdkDsl
    CfnAutoScalingConfiguration.Builder.() -> Unit = {}): CfnAutoScalingConfiguration =
    CfnAutoScalingConfiguration.Builder.create(this, id).apply(initializer).build()
