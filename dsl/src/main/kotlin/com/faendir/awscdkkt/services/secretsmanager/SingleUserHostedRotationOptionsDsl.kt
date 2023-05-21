package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions

@Generated
public
    fun singleUserHostedRotationOptions(initializer: SingleUserHostedRotationOptions.Builder.() -> Unit
    = {}): SingleUserHostedRotationOptions =
    SingleUserHostedRotationOptions.builder().apply(initializer).build()
