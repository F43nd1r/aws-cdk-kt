package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.OAuthSettings

@Generated
public fun buildOAuthSettings(initializer: @AwsCdkDsl OAuthSettings.Builder.() -> Unit = {}):
    OAuthSettings = OAuthSettings.Builder().apply(initializer).build()
