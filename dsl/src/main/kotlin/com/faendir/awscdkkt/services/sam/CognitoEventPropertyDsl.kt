package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun cognitoEventProperty(initializer: CfnFunction.CognitoEventProperty.Builder.() -> Unit =
    {}): CfnFunction.CognitoEventProperty =
    CfnFunction.CognitoEventProperty.builder().apply(initializer).build()
