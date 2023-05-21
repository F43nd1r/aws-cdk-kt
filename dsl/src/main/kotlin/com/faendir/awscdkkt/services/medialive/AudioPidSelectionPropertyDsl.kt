package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun audioPidSelectionProperty(initializer: CfnChannel.AudioPidSelectionProperty.Builder.() -> Unit
    = {}): CfnChannel.AudioPidSelectionProperty =
    CfnChannel.AudioPidSelectionProperty.builder().apply(initializer).build()
