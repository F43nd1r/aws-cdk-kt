package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityGroupEgress(id: String, props: CfnSecurityGroupEgressProps):
    CfnSecurityGroupEgress = CfnSecurityGroupEgress(this, id, props)

@Generated
public fun Construct.cfnSecurityGroupEgress(
  id: String,
  props: CfnSecurityGroupEgressProps,
  initializer: @AwsCdkDsl CfnSecurityGroupEgress.() -> Unit,
): CfnSecurityGroupEgress = CfnSecurityGroupEgress(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecurityGroupEgress(id: String, initializer: @AwsCdkDsl
    CfnSecurityGroupEgress.Builder.() -> Unit): CfnSecurityGroupEgress =
    CfnSecurityGroupEgress.Builder.create(this, id).apply(initializer).build()
