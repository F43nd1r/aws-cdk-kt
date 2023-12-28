package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnAccessEntry

@Generated
public fun buildAccessPolicyProperty(initializer: @AwsCdkDsl
    CfnAccessEntry.AccessPolicyProperty.Builder.() -> Unit = {}):
    CfnAccessEntry.AccessPolicyProperty =
    CfnAccessEntry.AccessPolicyProperty.Builder().apply(initializer).build()
