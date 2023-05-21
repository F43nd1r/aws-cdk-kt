package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun audioSilenceFailoverSettingsProperty(initializer: CfnChannel.AudioSilenceFailoverSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.AudioSilenceFailoverSettingsProperty =
    CfnChannel.AudioSilenceFailoverSettingsProperty.builder().apply(initializer).build()
