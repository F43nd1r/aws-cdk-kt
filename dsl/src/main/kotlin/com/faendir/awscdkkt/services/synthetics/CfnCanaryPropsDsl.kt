package com.faendir.awscdkkt.services.synthetics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanaryProps

@Generated
public fun cfnCanaryProps(initializer: CfnCanaryProps.Builder.() -> Unit = {}): CfnCanaryProps =
    CfnCanaryProps.builder().apply(initializer).build()
