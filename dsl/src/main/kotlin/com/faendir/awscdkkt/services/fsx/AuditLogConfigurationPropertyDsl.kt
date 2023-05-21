package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem

@Generated
public
    fun auditLogConfigurationProperty(initializer: CfnFileSystem.AuditLogConfigurationProperty.Builder.() -> Unit
    = {}): CfnFileSystem.AuditLogConfigurationProperty =
    CfnFileSystem.AuditLogConfigurationProperty.builder().apply(initializer).build()
