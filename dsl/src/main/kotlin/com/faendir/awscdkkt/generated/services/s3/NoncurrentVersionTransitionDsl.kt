package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.NoncurrentVersionTransition

@Generated
public fun buildNoncurrentVersionTransition(initializer: @AwsCdkDsl
    NoncurrentVersionTransition.Builder.() -> Unit): NoncurrentVersionTransition =
    NoncurrentVersionTransition.Builder().apply(initializer).build()
