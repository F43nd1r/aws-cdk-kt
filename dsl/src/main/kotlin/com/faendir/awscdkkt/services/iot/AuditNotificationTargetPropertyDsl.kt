@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration

public
    fun auditNotificationTargetProperty(initializer: CfnAccountAuditConfiguration.AuditNotificationTargetProperty.Builder.() -> Unit):
    CfnAccountAuditConfiguration.AuditNotificationTargetProperty =
    CfnAccountAuditConfiguration.AuditNotificationTargetProperty.builder().apply(initializer).build()
