package com.faendir.awscdkkt.generated.services.apprunner

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnObservabilityConfiguration(id: String, initializer: @AwsCdkDsl
    CfnObservabilityConfiguration.() -> Unit = {}): CfnObservabilityConfiguration =
    CfnObservabilityConfiguration(this, id).apply(initializer)

@Generated
public fun Construct.cfnObservabilityConfiguration(
  id: String,
  props: CfnObservabilityConfigurationProps,
  initializer: @AwsCdkDsl CfnObservabilityConfiguration.() -> Unit = {},
): CfnObservabilityConfiguration = CfnObservabilityConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnObservabilityConfiguration(id: String, initializer: @AwsCdkDsl
    CfnObservabilityConfiguration.Builder.() -> Unit = {}): CfnObservabilityConfiguration =
    CfnObservabilityConfiguration.Builder.create(this, id).apply(initializer).build()
