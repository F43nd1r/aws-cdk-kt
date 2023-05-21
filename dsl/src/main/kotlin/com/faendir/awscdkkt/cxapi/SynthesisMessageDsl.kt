package com.faendir.awscdkkt.cxapi

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cxapi.SynthesisMessage

@Generated
public fun synthesisMessage(initializer: SynthesisMessage.Builder.() -> Unit = {}): SynthesisMessage
    = SynthesisMessage.builder().apply(initializer).build()
