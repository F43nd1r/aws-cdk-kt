package com.faendir.awscdkkt.cxapi

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cxapi.LoadBalancerContextResponse

@Generated
public fun loadBalancerContextResponse(initializer: LoadBalancerContextResponse.Builder.() -> Unit =
    {}): LoadBalancerContextResponse =
    LoadBalancerContextResponse.builder().apply(initializer).build()
