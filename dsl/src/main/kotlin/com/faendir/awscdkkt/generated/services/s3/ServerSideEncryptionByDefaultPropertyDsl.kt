package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildServerSideEncryptionByDefaultProperty(initializer: @AwsCdkDsl
    CfnBucket.ServerSideEncryptionByDefaultProperty.Builder.() -> Unit = {}):
    CfnBucket.ServerSideEncryptionByDefaultProperty =
    CfnBucket.ServerSideEncryptionByDefaultProperty.Builder().apply(initializer).build()
