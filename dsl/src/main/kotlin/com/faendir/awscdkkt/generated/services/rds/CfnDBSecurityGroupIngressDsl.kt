package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBSecurityGroupIngress(id: String, props: CfnDBSecurityGroupIngressProps):
    CfnDBSecurityGroupIngress = CfnDBSecurityGroupIngress(this, id, props)

@Generated
public fun Construct.cfnDBSecurityGroupIngress(
  id: String,
  props: CfnDBSecurityGroupIngressProps,
  initializer: @AwsCdkDsl CfnDBSecurityGroupIngress.() -> Unit,
): CfnDBSecurityGroupIngress = CfnDBSecurityGroupIngress(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDBSecurityGroupIngress(id: String, initializer: @AwsCdkDsl
    CfnDBSecurityGroupIngress.Builder.() -> Unit): CfnDBSecurityGroupIngress =
    CfnDBSecurityGroupIngress.Builder.create(this, id).apply(initializer).build()
