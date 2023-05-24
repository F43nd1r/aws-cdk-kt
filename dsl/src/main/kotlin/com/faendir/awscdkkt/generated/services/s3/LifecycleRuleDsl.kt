package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.LifecycleRule

@Generated
public fun buildLifecycleRule(initializer: @AwsCdkDsl LifecycleRule.Builder.() -> Unit):
    LifecycleRule = LifecycleRule.Builder().apply(initializer).build()
