package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildNoncurrentVersionExpirationProperty(initializer: @AwsCdkDsl
    CfnBucket.NoncurrentVersionExpirationProperty.Builder.() -> Unit):
    CfnBucket.NoncurrentVersionExpirationProperty =
    CfnBucket.NoncurrentVersionExpirationProperty.Builder().apply(initializer).build()
