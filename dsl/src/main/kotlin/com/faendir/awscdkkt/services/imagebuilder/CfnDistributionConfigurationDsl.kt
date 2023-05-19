@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
