package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucketProps

@Generated
public fun buildCfnBucketProps(initializer: @AwsCdkDsl CfnBucketProps.Builder.() -> Unit = {}):
    CfnBucketProps = CfnBucketProps.Builder().apply(initializer).build()
