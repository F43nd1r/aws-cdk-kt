package com.faendir.awscdkkt.generated.services.elasticloadbalancing

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@Generated
public fun buildPoliciesProperty(initializer: @AwsCdkDsl
    CfnLoadBalancer.PoliciesProperty.Builder.() -> Unit = {}): CfnLoadBalancer.PoliciesProperty =
    CfnLoadBalancer.PoliciesProperty.Builder().apply(initializer).build()
