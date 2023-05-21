package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnObservabilityConfiguration(id: String,
    initializer: CfnObservabilityConfiguration.() -> Unit = {}): CfnObservabilityConfiguration =
    CfnObservabilityConfiguration(this, id).apply(initializer)

@Generated
public fun Construct.cfnObservabilityConfiguration(
  id: String,
  props: CfnObservabilityConfigurationProps,
  initializer: CfnObservabilityConfiguration.() -> Unit = {},
): CfnObservabilityConfiguration = CfnObservabilityConfiguration(this, id, props).apply(initializer)
