package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

@Generated
public
    fun redshiftSettingsProperty(initializer: CfnEndpoint.RedshiftSettingsProperty.Builder.() -> Unit
    = {}): CfnEndpoint.RedshiftSettingsProperty =
    CfnEndpoint.RedshiftSettingsProperty.builder().apply(initializer).build()
