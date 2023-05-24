package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

@Generated
public fun buildEndpointProperty(initializer: @AwsCdkDsl
    CfnDBInstance.EndpointProperty.Builder.() -> Unit): CfnDBInstance.EndpointProperty =
    CfnDBInstance.EndpointProperty.Builder().apply(initializer).build()
