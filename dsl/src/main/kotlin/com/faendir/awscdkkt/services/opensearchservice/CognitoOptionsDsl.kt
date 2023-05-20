@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CognitoOptions

public fun cognitoOptions(initializer: CognitoOptions.Builder.() -> Unit): CognitoOptions =
    CognitoOptions.builder().apply(initializer).build()
