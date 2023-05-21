package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun audioTrackSelectionProperty(initializer: CfnChannel.AudioTrackSelectionProperty.Builder.() -> Unit
    = {}): CfnChannel.AudioTrackSelectionProperty =
    CfnChannel.AudioTrackSelectionProperty.builder().apply(initializer).build()
