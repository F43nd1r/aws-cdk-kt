package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnAccountAuditConfiguration.() -> Unit = {},
): CfnAccountAuditConfiguration = CfnAccountAuditConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccountAuditConfiguration(id: String, initializer: @AwsCdkDsl
    CfnAccountAuditConfiguration.Builder.() -> Unit = {}): CfnAccountAuditConfiguration =
    CfnAccountAuditConfiguration.Builder.create(this, id).apply(initializer).build()
