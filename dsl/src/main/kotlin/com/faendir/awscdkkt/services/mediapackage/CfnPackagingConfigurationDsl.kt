@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps
import software.constructs.Construct

public fun Construct.cfnPackagingConfiguration(
  id: String,
  props: CfnPackagingConfigurationProps,
  initializer: CfnPackagingConfiguration.() -> Unit = {},
): CfnPackagingConfiguration = CfnPackagingConfiguration(this, id, props).apply(initializer)
