@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPool

public
    fun cognitoIdentityProviderProperty(initializer: CfnIdentityPool.CognitoIdentityProviderProperty.Builder.() -> Unit):
    CfnIdentityPool.CognitoIdentityProviderProperty =
    CfnIdentityPool.CognitoIdentityProviderProperty.builder().apply(initializer).build()
