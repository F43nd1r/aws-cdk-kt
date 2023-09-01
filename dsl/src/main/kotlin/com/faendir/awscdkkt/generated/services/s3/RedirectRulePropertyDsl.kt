package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildRedirectRuleProperty(initializer: @AwsCdkDsl
    CfnBucket.RedirectRuleProperty.Builder.() -> Unit = {}): CfnBucket.RedirectRuleProperty =
    CfnBucket.RedirectRuleProperty.Builder().apply(initializer).build()
