package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress
import software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityGroupIngress(
  id: String,
  props: CfnSecurityGroupIngressProps,
  initializer: @AwsCdkDsl CfnSecurityGroupIngress.() -> Unit = {},
): CfnSecurityGroupIngress = CfnSecurityGroupIngress(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecurityGroupIngress(id: String, initializer: @AwsCdkDsl CfnSecurityGroupIngress.Builder.() -> Unit = {}): CfnSecurityGroupIngress = CfnSecurityGroupIngress.Builder.create(this, id).apply(initializer).build()
