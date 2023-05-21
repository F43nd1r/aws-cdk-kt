package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration

@Generated
public
    fun auditCheckConfigurationProperty(initializer: CfnAccountAuditConfiguration.AuditCheckConfigurationProperty.Builder.() -> Unit
    = {}): CfnAccountAuditConfiguration.AuditCheckConfigurationProperty =
    CfnAccountAuditConfiguration.AuditCheckConfigurationProperty.builder().apply(initializer).build()
