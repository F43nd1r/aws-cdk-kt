package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEIP
import software.amazon.awscdk.services.ec2.CfnEIPProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEIP(id: String, props: CfnEIPProps): CfnEIP = CfnEIP(this, id, props)

@Generated
public fun Construct.cfnEIP(
  id: String,
  props: CfnEIPProps,
  initializer: @AwsCdkDsl CfnEIP.() -> Unit,
): CfnEIP = CfnEIP(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnEIP(id: String): CfnEIP = CfnEIP(this, id)

@Generated
public fun Construct.cfnEIP(id: String, initializer: @AwsCdkDsl CfnEIP.() -> Unit): CfnEIP =
    CfnEIP(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnEIP(id: String, initializer: @AwsCdkDsl CfnEIP.Builder.() -> Unit):
    CfnEIP = CfnEIP.Builder.create(this, id).apply(initializer).build()
