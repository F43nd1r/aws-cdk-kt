package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnSecurityConfiguration
import software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityConfiguration(
  id: String,
  props: CfnSecurityConfigurationProps,
  initializer: CfnSecurityConfiguration.() -> Unit = {},
): CfnSecurityConfiguration = CfnSecurityConfiguration(this, id, props).apply(initializer)
