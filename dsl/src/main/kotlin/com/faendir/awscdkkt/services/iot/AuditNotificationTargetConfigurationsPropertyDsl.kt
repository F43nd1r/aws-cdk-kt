package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration

@Generated
public
    fun auditNotificationTargetConfigurationsProperty(initializer: CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.Builder.() -> Unit
    = {}): CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty =
    CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.builder().apply(initializer).build()
