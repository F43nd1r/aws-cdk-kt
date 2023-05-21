package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun audioDescriptionProperty(initializer: CfnChannel.AudioDescriptionProperty.Builder.() -> Unit
    = {}): CfnChannel.AudioDescriptionProperty =
    CfnChannel.AudioDescriptionProperty.builder().apply(initializer).build()
