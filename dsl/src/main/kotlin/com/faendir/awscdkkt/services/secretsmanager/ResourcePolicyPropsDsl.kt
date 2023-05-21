package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps

@Generated
public fun resourcePolicyProps(initializer: ResourcePolicyProps.Builder.() -> Unit = {}):
    ResourcePolicyProps = ResourcePolicyProps.builder().apply(initializer).build()
