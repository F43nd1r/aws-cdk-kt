package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.RedirectTarget

@Generated
public fun redirectTarget(initializer: RedirectTarget.Builder.() -> Unit = {}): RedirectTarget =
    RedirectTarget.builder().apply(initializer).build()
