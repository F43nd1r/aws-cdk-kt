package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AuthorizationMode

@Generated
public fun authorizationMode(initializer: AuthorizationMode.Builder.() -> Unit = {}):
    AuthorizationMode = AuthorizationMode.builder().apply(initializer).build()
