@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appconfig

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps
import software.constructs.Construct

public fun Construct.cfnHostedConfigurationVersion(
  id: String,
  props: CfnHostedConfigurationVersionProps,
  initializer: CfnHostedConfigurationVersion.() -> Unit = {},
): CfnHostedConfigurationVersion = CfnHostedConfigurationVersion(this, id, props).apply(initializer)
