@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions

public
    fun multiUserHostedRotationOptions(initializer: MultiUserHostedRotationOptions.Builder.() -> Unit):
    MultiUserHostedRotationOptions =
    MultiUserHostedRotationOptions.builder().apply(initializer).build()
