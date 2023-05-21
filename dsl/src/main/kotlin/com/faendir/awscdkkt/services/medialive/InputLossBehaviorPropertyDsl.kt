package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun inputLossBehaviorProperty(initializer: CfnChannel.InputLossBehaviorProperty.Builder.() -> Unit
    = {}): CfnChannel.InputLossBehaviorProperty =
    CfnChannel.InputLossBehaviorProperty.builder().apply(initializer).build()
