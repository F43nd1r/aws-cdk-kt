package com.faendir.awscdkkt.generated.services.sqs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.RedriveAllowPolicy

@Generated
public fun buildRedriveAllowPolicy(initializer: @AwsCdkDsl RedriveAllowPolicy.Builder.() -> Unit =
    {}): RedriveAllowPolicy = RedriveAllowPolicy.Builder().apply(initializer).build()
