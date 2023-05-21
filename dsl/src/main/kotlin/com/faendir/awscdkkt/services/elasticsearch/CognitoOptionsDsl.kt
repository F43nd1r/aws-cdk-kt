@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CognitoOptions

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.CognitoOptions is deprecated in CDK.")
@Generated
public fun cognitoOptions(initializer: CognitoOptions.Builder.() -> Unit = {}): CognitoOptions =
    CognitoOptions.builder().apply(initializer).build()
