package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun ancillarySourceSettingsProperty(initializer: CfnChannel.AncillarySourceSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.AncillarySourceSettingsProperty =
    CfnChannel.AncillarySourceSettingsProperty.builder().apply(initializer).build()
