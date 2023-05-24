package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildObjectLockRuleProperty(initializer: @AwsCdkDsl
    CfnBucket.ObjectLockRuleProperty.Builder.() -> Unit): CfnBucket.ObjectLockRuleProperty =
    CfnBucket.ObjectLockRuleProperty.Builder().apply(initializer).build()
