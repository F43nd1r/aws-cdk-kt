package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction
import software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps

@Generated
public fun authenticateCognitoAction(options: AuthenticateCognitoActionProps):
    AuthenticateCognitoAction = AuthenticateCognitoAction(options)

@Generated
public fun buildAuthenticateCognitoAction(initializer: @AwsCdkDsl
    AuthenticateCognitoAction.Builder.() -> Unit): AuthenticateCognitoAction =
    AuthenticateCognitoAction.Builder.create().apply(initializer).build()
