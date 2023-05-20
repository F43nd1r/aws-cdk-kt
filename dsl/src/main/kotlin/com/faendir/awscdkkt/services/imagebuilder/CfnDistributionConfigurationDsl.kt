@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps
import software.constructs.Construct

public fun Construct.cfnDistributionConfiguration(
  id: String,
  props: CfnDistributionConfigurationProps,
  initializer: CfnDistributionConfiguration.() -> Unit = {},
): CfnDistributionConfiguration = CfnDistributionConfiguration(this, id, props).apply(initializer)
