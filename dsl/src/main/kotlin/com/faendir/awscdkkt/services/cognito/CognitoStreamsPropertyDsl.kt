package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPool

@Generated
public
    fun cognitoStreamsProperty(initializer: CfnIdentityPool.CognitoStreamsProperty.Builder.() -> Unit
    = {}): CfnIdentityPool.CognitoStreamsProperty =
    CfnIdentityPool.CognitoStreamsProperty.builder().apply(initializer).build()
