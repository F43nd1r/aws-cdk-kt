package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.OAuthFlows

@Generated
public fun oAuthFlows(initializer: OAuthFlows.Builder.() -> Unit = {}): OAuthFlows =
    OAuthFlows.builder().apply(initializer).build()
