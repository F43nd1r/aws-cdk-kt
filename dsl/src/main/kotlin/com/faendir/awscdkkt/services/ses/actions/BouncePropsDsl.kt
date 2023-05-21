package com.faendir.awscdkkt.services.ses.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.BounceProps

@Generated
public fun bounceProps(initializer: BounceProps.Builder.() -> Unit = {}): BounceProps =
    BounceProps.builder().apply(initializer).build()
