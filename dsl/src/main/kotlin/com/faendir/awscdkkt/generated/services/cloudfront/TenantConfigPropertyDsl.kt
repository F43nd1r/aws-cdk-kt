package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public fun buildTenantConfigProperty(initializer: @AwsCdkDsl
    CfnDistribution.TenantConfigProperty.Builder.() -> Unit = {}):
    CfnDistribution.TenantConfigProperty =
    CfnDistribution.TenantConfigProperty.Builder().apply(initializer).build()
