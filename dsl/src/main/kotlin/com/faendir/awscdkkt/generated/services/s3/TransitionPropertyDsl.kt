package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildTransitionProperty(initializer: @AwsCdkDsl
    CfnBucket.TransitionProperty.Builder.() -> Unit): CfnBucket.TransitionProperty =
    CfnBucket.TransitionProperty.Builder().apply(initializer).build()
