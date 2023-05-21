package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.OAuthSettings

@Generated
public fun oAuthSettings(initializer: OAuthSettings.Builder.() -> Unit = {}): OAuthSettings =
    OAuthSettings.builder().apply(initializer).build()
