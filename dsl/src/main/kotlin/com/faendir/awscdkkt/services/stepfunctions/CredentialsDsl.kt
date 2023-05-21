package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Credentials

@Generated
public fun credentials(initializer: Credentials.Builder.() -> Unit = {}): Credentials =
    Credentials.builder().apply(initializer).build()
