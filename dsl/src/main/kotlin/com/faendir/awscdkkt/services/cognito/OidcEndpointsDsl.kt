package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.OidcEndpoints

@Generated
public fun oidcEndpoints(initializer: OidcEndpoints.Builder.() -> Unit = {}): OidcEndpoints =
    OidcEndpoints.builder().apply(initializer).build()
