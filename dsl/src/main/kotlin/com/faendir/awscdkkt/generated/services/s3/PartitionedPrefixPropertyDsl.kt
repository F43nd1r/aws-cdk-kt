package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildPartitionedPrefixProperty(initializer: @AwsCdkDsl
    CfnBucket.PartitionedPrefixProperty.Builder.() -> Unit = {}):
    CfnBucket.PartitionedPrefixProperty =
    CfnBucket.PartitionedPrefixProperty.Builder().apply(initializer).build()
