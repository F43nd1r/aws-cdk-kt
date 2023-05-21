package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@Generated
public fun cognitoOptionsProperty(initializer: CfnDomain.CognitoOptionsProperty.Builder.() -> Unit =
    {}): CfnDomain.CognitoOptionsProperty =
    CfnDomain.CognitoOptionsProperty.builder().apply(initializer).build()
