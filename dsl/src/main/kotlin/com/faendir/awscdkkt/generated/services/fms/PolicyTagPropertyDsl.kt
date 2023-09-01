package com.faendir.awscdkkt.generated.services.fms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fms.CfnPolicy

@Generated
public fun buildPolicyTagProperty(initializer: @AwsCdkDsl
    CfnPolicy.PolicyTagProperty.Builder.() -> Unit = {}): CfnPolicy.PolicyTagProperty =
    CfnPolicy.PolicyTagProperty.Builder().apply(initializer).build()
