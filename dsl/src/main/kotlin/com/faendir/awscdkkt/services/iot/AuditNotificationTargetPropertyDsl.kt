@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration

public
    fun auditNotificationTargetProperty(initializer: CfnAccountAuditConfiguration.AuditNotificationTargetProperty.Builder.() -> Unit):
    CfnAccountAuditConfiguration.AuditNotificationTargetProperty =
    CfnAccountAuditConfiguration.AuditNotificationTargetProperty.builder().apply(initializer).build()
