package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public fun audioSelectorProperty(initializer: CfnChannel.AudioSelectorProperty.Builder.() -> Unit =
    {}): CfnChannel.AudioSelectorProperty =
    CfnChannel.AudioSelectorProperty.builder().apply(initializer).build()
