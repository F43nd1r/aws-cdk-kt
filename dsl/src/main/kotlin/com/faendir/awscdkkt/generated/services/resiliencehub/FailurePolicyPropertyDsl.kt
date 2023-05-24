package com.faendir.awscdkkt.generated.services.resiliencehub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy

@Generated
public fun buildFailurePolicyProperty(initializer: @AwsCdkDsl
    CfnResiliencyPolicy.FailurePolicyProperty.Builder.() -> Unit):
    CfnResiliencyPolicy.FailurePolicyProperty =
    CfnResiliencyPolicy.FailurePolicyProperty.Builder().apply(initializer).build()
