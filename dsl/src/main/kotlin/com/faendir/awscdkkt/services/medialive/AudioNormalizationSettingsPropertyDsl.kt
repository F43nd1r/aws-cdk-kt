package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun audioNormalizationSettingsProperty(initializer: CfnChannel.AudioNormalizationSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.AudioNormalizationSettingsProperty =
    CfnChannel.AudioNormalizationSettingsProperty.builder().apply(initializer).build()
