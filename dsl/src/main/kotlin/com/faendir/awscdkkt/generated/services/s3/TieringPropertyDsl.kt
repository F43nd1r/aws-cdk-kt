package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildTieringProperty(initializer: @AwsCdkDsl CfnBucket.TieringProperty.Builder.() -> Unit
    = {}): CfnBucket.TieringProperty =
    CfnBucket.TieringProperty.Builder().apply(initializer).build()
