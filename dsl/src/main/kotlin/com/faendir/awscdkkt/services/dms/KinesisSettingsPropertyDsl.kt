package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

@Generated
public
    fun kinesisSettingsProperty(initializer: CfnEndpoint.KinesisSettingsProperty.Builder.() -> Unit
    = {}): CfnEndpoint.KinesisSettingsProperty =
    CfnEndpoint.KinesisSettingsProperty.builder().apply(initializer).build()
