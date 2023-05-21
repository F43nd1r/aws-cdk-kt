package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public fun audioTrackProperty(initializer: CfnChannel.AudioTrackProperty.Builder.() -> Unit = {}):
    CfnChannel.AudioTrackProperty =
    CfnChannel.AudioTrackProperty.builder().apply(initializer).build()
