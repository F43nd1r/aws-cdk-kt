package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.EmailSettings

@Generated
public fun emailSettings(initializer: EmailSettings.Builder.() -> Unit = {}): EmailSettings =
    EmailSettings.builder().apply(initializer).build()
