package com.faendir.awscdkkt.generated.services.globalaccelerator.endpoints

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEIP
import software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint

@Generated
public fun buildCfnEipEndpoint(eip: CfnEIP, initializer: @AwsCdkDsl
    CfnEipEndpoint.Builder.() -> Unit): CfnEipEndpoint =
    CfnEipEndpoint.Builder.create(eip).apply(initializer).build()
