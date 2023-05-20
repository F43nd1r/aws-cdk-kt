@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem

public
    fun auditLogConfigurationProperty(initializer: CfnFileSystem.AuditLogConfigurationProperty.Builder.() -> Unit):
    CfnFileSystem.AuditLogConfigurationProperty =
    CfnFileSystem.AuditLogConfigurationProperty.builder().apply(initializer).build()
