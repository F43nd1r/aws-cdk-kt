@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

public
    fun grpcRetryPolicyProperty(initializer: CfnRoute.GrpcRetryPolicyProperty.Builder.() -> Unit):
    CfnRoute.GrpcRetryPolicyProperty =
    CfnRoute.GrpcRetryPolicyProperty.builder().apply(initializer).build()
