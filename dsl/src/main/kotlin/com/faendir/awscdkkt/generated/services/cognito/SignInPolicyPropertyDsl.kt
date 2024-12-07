package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun buildSignInPolicyProperty(initializer: @AwsCdkDsl
    CfnUserPool.SignInPolicyProperty.Builder.() -> Unit = {}): CfnUserPool.SignInPolicyProperty =
    CfnUserPool.SignInPolicyProperty.Builder().apply(initializer).build()
