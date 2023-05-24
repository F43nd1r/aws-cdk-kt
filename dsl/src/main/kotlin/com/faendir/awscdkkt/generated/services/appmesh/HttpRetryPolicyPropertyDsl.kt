package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun buildHttpRetryPolicyProperty(initializer: @AwsCdkDsl
    CfnRoute.HttpRetryPolicyProperty.Builder.() -> Unit): CfnRoute.HttpRetryPolicyProperty =
    CfnRoute.HttpRetryPolicyProperty.Builder().apply(initializer).build()
