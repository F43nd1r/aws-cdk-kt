package com.faendir.awscdkkt.generated.services.globalaccelerator.endpoints

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEIP
import software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint
import software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpointProps

@Generated
public fun cfnEipEndpoint(eip: CfnEIP): CfnEipEndpoint = CfnEipEndpoint(eip)

@Generated
public fun cfnEipEndpoint(eip: CfnEIP, options: CfnEipEndpointProps): CfnEipEndpoint =
    CfnEipEndpoint(eip, options)

@Generated
public fun buildCfnEipEndpoint(eip: CfnEIP, initializer: @AwsCdkDsl
    CfnEipEndpoint.Builder.() -> Unit): CfnEipEndpoint =
    CfnEipEndpoint.Builder.create(eip).apply(initializer).build()
