package com.faendir.awscdkkt.services.ses.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.SnsProps

@Generated
public fun snsProps(initializer: SnsProps.Builder.() -> Unit = {}): SnsProps =
    SnsProps.builder().apply(initializer).build()
