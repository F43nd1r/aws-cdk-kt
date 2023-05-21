package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun audioChannelMappingProperty(initializer: CfnChannel.AudioChannelMappingProperty.Builder.() -> Unit
    = {}): CfnChannel.AudioChannelMappingProperty =
    CfnChannel.AudioChannelMappingProperty.builder().apply(initializer).build()
