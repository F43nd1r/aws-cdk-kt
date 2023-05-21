package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CognitoOptions

@Generated
public fun cognitoOptions(initializer: CognitoOptions.Builder.() -> Unit = {}): CognitoOptions =
    CognitoOptions.builder().apply(initializer).build()
