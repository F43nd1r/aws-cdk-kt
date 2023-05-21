package com.faendir.awscdkkt.services.appconfig

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHostedConfigurationVersion(
  id: String,
  props: CfnHostedConfigurationVersionProps,
  initializer: CfnHostedConfigurationVersion.() -> Unit = {},
): CfnHostedConfigurationVersion = CfnHostedConfigurationVersion(this, id, props).apply(initializer)
