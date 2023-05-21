package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun httpRetryPolicyProperty(initializer: CfnRoute.HttpRetryPolicyProperty.Builder.() -> Unit
    = {}): CfnRoute.HttpRetryPolicyProperty =
    CfnRoute.HttpRetryPolicyProperty.builder().apply(initializer).build()
