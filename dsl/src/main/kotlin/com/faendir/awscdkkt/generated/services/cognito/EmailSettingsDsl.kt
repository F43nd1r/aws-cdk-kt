package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.EmailSettings

@Generated
public fun buildEmailSettings(initializer: @AwsCdkDsl EmailSettings.Builder.() -> Unit = {}):
    EmailSettings = EmailSettings.Builder().apply(initializer).build()
