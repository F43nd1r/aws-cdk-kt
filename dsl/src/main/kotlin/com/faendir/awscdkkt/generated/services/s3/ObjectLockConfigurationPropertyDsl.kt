package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildObjectLockConfigurationProperty(initializer: @AwsCdkDsl
    CfnBucket.ObjectLockConfigurationProperty.Builder.() -> Unit = {}):
    CfnBucket.ObjectLockConfigurationProperty =
    CfnBucket.ObjectLockConfigurationProperty.Builder().apply(initializer).build()
