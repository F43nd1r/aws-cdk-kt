package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions

@Generated
public
    fun multiUserHostedRotationOptions(initializer: MultiUserHostedRotationOptions.Builder.() -> Unit
    = {}): MultiUserHostedRotationOptions =
    MultiUserHostedRotationOptions.builder().apply(initializer).build()
