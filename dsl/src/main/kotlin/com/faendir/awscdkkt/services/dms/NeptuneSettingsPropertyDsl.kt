package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

@Generated
public
    fun neptuneSettingsProperty(initializer: CfnEndpoint.NeptuneSettingsProperty.Builder.() -> Unit
    = {}): CfnEndpoint.NeptuneSettingsProperty =
    CfnEndpoint.NeptuneSettingsProperty.builder().apply(initializer).build()
