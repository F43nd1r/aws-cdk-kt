package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration

@Generated
public
    fun auditCheckConfigurationsProperty(initializer: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.Builder.() -> Unit
    = {}): CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty =
    CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.builder().apply(initializer).build()
