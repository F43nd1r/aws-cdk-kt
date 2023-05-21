package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPool

@Generated
public
    fun cognitoIdentityProviderProperty(initializer: CfnIdentityPool.CognitoIdentityProviderProperty.Builder.() -> Unit
    = {}): CfnIdentityPool.CognitoIdentityProviderProperty =
    CfnIdentityPool.CognitoIdentityProviderProperty.builder().apply(initializer).build()
