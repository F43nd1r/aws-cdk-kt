@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.EmailSettings

public fun emailSettings(initializer: EmailSettings.Builder.() -> Unit): EmailSettings =
    EmailSettings.builder().apply(initializer).build()
