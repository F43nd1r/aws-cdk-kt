@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CognitoOptions

public fun cognitoOptions(initializer: CognitoOptions.Builder.() -> Unit): CognitoOptions =
    CognitoOptions.builder().apply(initializer).build()
