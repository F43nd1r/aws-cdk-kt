package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.ManagedPolicyProps

@Generated
public fun managedPolicyProps(initializer: ManagedPolicyProps.Builder.() -> Unit = {}):
    ManagedPolicyProps = ManagedPolicyProps.builder().apply(initializer).build()
