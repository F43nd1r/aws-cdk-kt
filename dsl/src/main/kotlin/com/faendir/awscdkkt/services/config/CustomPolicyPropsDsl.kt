package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CustomPolicyProps

@Generated
public fun customPolicyProps(initializer: CustomPolicyProps.Builder.() -> Unit = {}):
    CustomPolicyProps = CustomPolicyProps.builder().apply(initializer).build()
