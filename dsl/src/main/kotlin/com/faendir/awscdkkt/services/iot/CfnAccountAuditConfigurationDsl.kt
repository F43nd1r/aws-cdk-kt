@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration
import software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps
import software.constructs.Construct

public fun Construct.cfnAccountAuditConfiguration(
  id: String,
  props: CfnAccountAuditConfigurationProps,
  initializer: CfnAccountAuditConfiguration.() -> Unit = {},
): CfnAccountAuditConfiguration = CfnAccountAuditConfiguration(this, id, props).apply(initializer)
