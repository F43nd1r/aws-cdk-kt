@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.RedirectTarget

public fun redirectTarget(initializer: RedirectTarget.Builder.() -> Unit): RedirectTarget =
    RedirectTarget.builder().apply(initializer).build()
