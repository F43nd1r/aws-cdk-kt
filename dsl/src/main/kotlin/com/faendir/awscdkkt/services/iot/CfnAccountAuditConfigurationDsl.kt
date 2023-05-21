package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration
import software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccountAuditConfiguration(
  id: String,
  props: CfnAccountAuditConfigurationProps,
  initializer: CfnAccountAuditConfiguration.() -> Unit = {},
): CfnAccountAuditConfiguration = CfnAccountAuditConfiguration(this, id, props).apply(initializer)
