package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnPolicyProps

@Generated
public fun cfnPolicyProps(initializer: CfnPolicyProps.Builder.() -> Unit = {}): CfnPolicyProps =
    CfnPolicyProps.builder().apply(initializer).build()
