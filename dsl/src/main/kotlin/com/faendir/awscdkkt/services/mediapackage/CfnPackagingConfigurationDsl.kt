@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
