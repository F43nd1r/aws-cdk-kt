package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnConfigurationPolicy

@Generated
public fun buildSecurityHubPolicyProperty(initializer: @AwsCdkDsl
    CfnConfigurationPolicy.SecurityHubPolicyProperty.Builder.() -> Unit = {}):
    CfnConfigurationPolicy.SecurityHubPolicyProperty =
    CfnConfigurationPolicy.SecurityHubPolicyProperty.Builder().apply(initializer).build()
