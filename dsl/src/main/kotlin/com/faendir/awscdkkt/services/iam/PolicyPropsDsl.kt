package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.PolicyProps

@Generated
public fun policyProps(initializer: PolicyProps.Builder.() -> Unit = {}): PolicyProps =
    PolicyProps.builder().apply(initializer).build()
