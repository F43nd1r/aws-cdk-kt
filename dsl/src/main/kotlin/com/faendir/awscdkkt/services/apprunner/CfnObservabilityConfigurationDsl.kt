@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps
import software.constructs.Construct

public fun Construct.cfnObservabilityConfiguration(id: String,
    initializer: CfnObservabilityConfiguration.() -> Unit = {}): CfnObservabilityConfiguration =
    CfnObservabilityConfiguration(this, id).apply(initializer)

public fun Construct.cfnObservabilityConfiguration(
  id: String,
  props: CfnObservabilityConfigurationProps,
  initializer: CfnObservabilityConfiguration.() -> Unit = {},
): CfnObservabilityConfiguration = CfnObservabilityConfiguration(this, id, props).apply(initializer)
