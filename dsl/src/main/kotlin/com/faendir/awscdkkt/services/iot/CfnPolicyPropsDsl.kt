package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnPolicyProps

@Generated
public fun cfnPolicyProps(initializer: CfnPolicyProps.Builder.() -> Unit = {}): CfnPolicyProps =
    CfnPolicyProps.builder().apply(initializer).build()
