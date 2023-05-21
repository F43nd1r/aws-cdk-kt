package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

@Generated
public
    fun gcpMySQLSettingsProperty(initializer: CfnEndpoint.GcpMySQLSettingsProperty.Builder.() -> Unit
    = {}): CfnEndpoint.GcpMySQLSettingsProperty =
    CfnEndpoint.GcpMySQLSettingsProperty.builder().apply(initializer).build()
