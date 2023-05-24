package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnCustomerGateway
import software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomerGateway(id: String, props: CfnCustomerGatewayProps):
    CfnCustomerGateway = CfnCustomerGateway(this, id, props)

@Generated
public fun Construct.cfnCustomerGateway(
  id: String,
  props: CfnCustomerGatewayProps,
  initializer: @AwsCdkDsl CfnCustomerGateway.() -> Unit,
): CfnCustomerGateway = CfnCustomerGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomerGateway(id: String, initializer: @AwsCdkDsl
    CfnCustomerGateway.Builder.() -> Unit): CfnCustomerGateway =
    CfnCustomerGateway.Builder.create(this, id).apply(initializer).build()
