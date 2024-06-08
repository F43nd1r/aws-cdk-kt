package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy

@Generated
public fun buildPolicyProperty(initializer: @AwsCdkDsl
    CfnConfigurationPolicy.PolicyProperty.Builder.() -> Unit = {}):
    CfnConfigurationPolicy.PolicyProperty =
    CfnConfigurationPolicy.PolicyProperty.Builder().apply(initializer).build()
