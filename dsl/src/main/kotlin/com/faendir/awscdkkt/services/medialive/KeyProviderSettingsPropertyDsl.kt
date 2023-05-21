package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun keyProviderSettingsProperty(initializer: CfnChannel.KeyProviderSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.KeyProviderSettingsProperty =
    CfnChannel.KeyProviderSettingsProperty.builder().apply(initializer).build()
