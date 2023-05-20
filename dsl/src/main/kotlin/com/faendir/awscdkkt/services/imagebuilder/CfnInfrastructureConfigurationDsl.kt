@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps
import software.constructs.Construct

public fun Construct.cfnInfrastructureConfiguration(
  id: String,
  props: CfnInfrastructureConfigurationProps,
  initializer: CfnInfrastructureConfiguration.() -> Unit = {},
): CfnInfrastructureConfiguration = CfnInfrastructureConfiguration(this, id,
    props).apply(initializer)
