package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions

@Generated
public fun withoutPolicyUpdatesOptions(initializer: WithoutPolicyUpdatesOptions.Builder.() -> Unit =
    {}): WithoutPolicyUpdatesOptions =
    WithoutPolicyUpdatesOptions.builder().apply(initializer).build()
